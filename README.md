# BearPacketEvents

A fork of [PacketEvents](https://github.com/retrooper/packetevents) by retrooper, hardened for
[BearProtect](https://discord.gg/y9tq64kgxB) (packet-level anti-crash). It runs as its own plugin, and
BearProtect depends on it.

Based on PacketEvents `2.14.1-SNAPSHOT` (after `v2.14.0`). Every class is relocated to
`dev.esoxiii.bearprotect.lib`, so it never clashes with a normal PacketEvents install on the same
server.

## Installing

Put `BearPacketEvents-<version>.jar` in `plugins/` next to BearProtect. Spigot, Paper and Folia,
Java 17+.

## What the fork adds

All of it is about reading untrusted client packets safely, before they reach the server.

### Decode limits

Limits checked while a packet is read, so an oversized packet is dropped before its contents are
allocated. When one is hit, PacketEvents throws `PacketLimitException` with the `Limit` that was
exceeded and the value. Set them on `PacketEventsSettings`:

| Setting | Default | What it limits |
| --- | --- | --- |
| `maxItemDepth` | 3 | Items nested inside items (shulkers, bundles) |
| `maxItemsPerPacket` | 1458 | Item stacks in one packet |
| `maxPayloadMultiplier` | 1 | Payload size relative to vanilla |
| `maxUpdateSignLineLength` | 384 | Characters per sign line |
| `maxReceivedNbtDepth` | 512 | NBT nesting in received packets |
| `maxReceivedNbtElementsPerPacket` | unlimited | NBT tags across every item of one packet |

### Decode events

Fired while a packet is still being read, before its packet event. All three extend
`PacketDecodeEvent`, whose `getPacketEvent()` returns the receive/send event, so a listener can
cancel the packet the moment something looks wrong.

- `ItemStackDecodeEvent`: every item stack read, with its size in bytes. The item can be replaced.
- `NBTDecodeEvent`: every NBT tree read, with its size in bytes. The tag can be replaced.
- `ReadSlotsEvent`: the slot count a packet is about to read (window clicks, inventory contents).

```java
PacketEvents.getAPI().getEventManager().registerListener(new PacketListenerAbstract() {
    @Override
    public void onPacketEventExternal(PacketEvent event) {
        if (event instanceof NBTDecodeEvent nbtEvent && nbtEvent.getDecodedSizeBytes() > 65_536) {
            nbtEvent.getPacketEvent().setCancelled(true);
        }
    }
});
```

### Pre-Via listeners

A listener whose `isPreVia()` returns true sees packets in the client's own protocol version,
before ViaVersion translates them. Crashers often target the translation itself, so checking
before it matters. Without ViaVersion the same listeners run in a fallback mode.

### Channel inject listeners

Get called right after PacketEvents added its handlers to a new connection, e.g. to add your own
netty handler next to them:

```java
PacketEvents.getAPI().getSettings().addChannelInjectListener("my-plugin", (channel, user, preVia) -> {
    // channel is the netty Channel of the connection
});
```

### Other changes

- Packet exceptions go to a settable handler (`PacketEventsSettings#packetExceptionHandler`).
- `ignoreFailures` lets players stay when their connection could not be injected, and silences
  the injection error, for setups where another proxy layer owns the pipeline.
- NBT reading counts tags and checks the buffer has enough bytes before allocating arrays.
- Reflection lookups go through `ReflectionNames`, so the fork survives obfuscated and remapped
  servers (Spigot, Paper's Mojang mappings).
- Packet type and wrapper updates for newer versions (configuration phase packets up to 26.3).

## Building

```bash
./gradlew build
```

Use `./gradlew build -Ptoolchain=21` to build with an installed JDK 21 (bytecode still targets 17).
Bukkit, Paper, Netty and ViaVersion are compiled against headers generated from
`gradle/api-signatures`, so no server jars or extra repositories are needed. The jars land in
`build/libs`.

## License

GPLv3, like PacketEvents. See [LICENSE](LICENSE). Original work © retrooper and the PacketEvents
contributors, changes © Esoxiii.
