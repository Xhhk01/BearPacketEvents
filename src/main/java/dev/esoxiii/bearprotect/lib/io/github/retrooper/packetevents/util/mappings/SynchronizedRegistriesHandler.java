package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.ChatType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.ChatTypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.dialog.Dialog;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.dialog.Dialogs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cat.CatSoundVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cat.CatSoundVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cat.CatVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cat.CatVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.chicken.ChickenSoundVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.chicken.ChickenSoundVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cow.CowSoundVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cow.CowSoundVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cow.CowVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cow.CowVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.frog.FrogVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.frog.FrogVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.nautilus.ZombieNautilusVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.nautilus.ZombieNautilusVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.pig.PigSoundVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.pig.PigSoundVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.pig.PigVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.pig.PigVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.sulfurcube.SulfurCubeArchtype;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.sulfurcube.SulfurCubeArchtypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfSoundVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfSoundVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.banner.BannerPattern;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.banner.BannerPatterns;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.blocktransformer.BlockTransformer;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.blocktransformer.BlockTransformers;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.enchantment.type.EnchantmentType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.enchantment.type.EnchantmentTypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.instrument.Instrument;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.instrument.Instruments;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.jukebox.IJukeboxSong;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.jukebox.JukeboxSongs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.trimmaterial.TrimMaterial;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.trimmaterial.TrimMaterials;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.trimpattern.TrimPattern;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.trimpattern.TrimPatterns;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.CopyableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTList;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.User;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtDecoder;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.timelines.Timeline;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.timelines.Timelines;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.biome.Biome;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.biome.Biomes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.blockentity.decopot.DecoratedPotPattern;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.blockentity.decopot.DecoratedPotPatterns;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.clock.WorldClock;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.clock.WorldClocks;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.damagetype.DamageType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.damagetype.DamageTypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.dimension.DimensionType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.dimension.DimensionTypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.BlockStateProvider;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.BlockStateProviders;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.painting.PaintingVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.painting.PaintingVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.resources.ResourceLocation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerRegistryData;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import java.util.stream.Stream;

@NullMarked
@Internal
public final class SynchronizedRegistriesHandler {

    private static final boolean FORCE_PER_USER_REGISTRIES =
            Boolean.getBoolean("packetevents.force-per-user-registries");

    private static final Map<ResourceLocation, SynchronizedRegistriesHandler.RegistryEntry<?>>
            REGISTRY_KEYS = new HashMap<>();

    private SynchronizedRegistriesHandler() {}

    public static void init() {
        if (REGISTRY_KEYS.isEmpty()) {
            throw new AssertionError();
        }
    }

    @Nullable
    public static SynchronizedRegistriesHandler.RegistryEntry<?> getRegistryEntry(
            ResourceLocation resourceLocation) {
        return REGISTRY_KEYS.get(resourceLocation);
    }

    public static void handleRegistry(
            User user,
            PacketWrapper<?> packetWrapper,
            ResourceLocation resourceLocation,
            List<WrapperConfigServerRegistryData.RegistryElement> values) {
        Object registryCacheKey =
                PacketEvents.getAPI()
                        .getServerManager()
                        .getRegistryCacheKey(
                                user, packetWrapper.getServerVersion().toClientVersion());
        handleRegistry(user, packetWrapper, resourceLocation, values, registryCacheKey);
    }

    public static void handleRegistry(
            User user,
            PacketWrapper<?> packetWrapper,
            ResourceLocation resourceLocation,
            List<WrapperConfigServerRegistryData.RegistryElement> values,
            @Nullable Object result) {
        SynchronizedRegistriesHandler.RegistryEntry registryEntry;
        if ((registryEntry = REGISTRY_KEYS.get(resourceLocation)) != null) {
            try {
                SimpleRegistry simpleRegistry;
                if (!FORCE_PER_USER_REGISTRIES && result != null) {
                    SynchronizedRegistriesHandler.RegistryEntry registryEntry2 = registryEntry;
                    simpleRegistry =
                            registryEntry.computeSyncedRegistry(
                                    result,
                                    () ->
                                            registryEntry2.createFromElements(
                                                    ((List) values),
                                                    ((PacketWrapper) packetWrapper)));
                } else {
                    simpleRegistry = registryEntry.createFromElements(values, packetWrapper);
                }
                user.putRegistry(simpleRegistry);
            } catch (Exception exception) {
                throw new IllegalStateException(
                        "Error while reading registry " + resourceLocation + " for " + user,
                        exception);
            }
        }
    }

    public static void handleLegacyRegistries(
            User user, PacketWrapper<?> packetWrapper, NBTCompound nBTCompound) {
        Object registryCacheKey =
                PacketEvents.getAPI()
                        .getServerManager()
                        .getRegistryCacheKey(
                                user, packetWrapper.getServerVersion().toClientVersion());
        Iterator<NBT> iterator2 = nBTCompound.getTags().values().iterator();
        while (iterator2.hasNext()) {
            NBT nBT;
            if ((nBT = (NBT) iterator2.next()) instanceof NBTList) {
                NBTList nBTList = (NBTList) nBT;
                handleRegistry(
                        user,
                        packetWrapper,
                        DimensionTypes.getRegistry().getRegistryKey(),
                        WrapperConfigServerRegistryData.RegistryElement.convertNbt(nBTList),
                        registryCacheKey);
            } else {
                NBTCompound nBTCompound2 = (NBTCompound) nBT;
                ResourceLocation resourceLocation =
                        new ResourceLocation(nBTCompound2.getStringTagValueOrThrow("type"));
                NBTList nBTList2;
                if ((nBTList2 = nBTCompound2.getCompoundListTagOrNull("value")) != null) {
                    handleRegistry(
                            user,
                            packetWrapper,
                            resourceLocation,
                            WrapperConfigServerRegistryData.RegistryElement.convertNbt(nBTList2),
                            registryCacheKey);
                }
            }
        }
    }

    static {
        Stream.of(
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                Biomes.getRegistry(), Biome.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                ChatTypes.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler
                                                .LegacyNbtEntryDecoder)
                                        ChatType::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                TrimPatterns.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler.NbtEntryDecoder)
                                        TrimPattern::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                TrimMaterials.getRegistry(), TrimMaterial.DIRECT_CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                WolfVariants.getRegistry(), WolfVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                WolfSoundVariants.getRegistry(), WolfSoundVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                PigVariants.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler
                                                .LegacyNbtEntryDecoder)
                                        PigVariant::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                FrogVariants.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler
                                                .LegacyNbtEntryDecoder)
                                        FrogVariant::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                CatVariants.getRegistry(), CatVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                CowVariants.getRegistry(), CowVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                ChickenVariants.getRegistry(), ChickenVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                ZombieNautilusVariants.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler
                                                .LegacyNbtEntryDecoder)
                                        ZombieNautilusVariant::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                PaintingVariants.getRegistry(), PaintingVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                DimensionTypes.getRegistry(), DimensionType.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                DamageTypes.getRegistry(), DamageType.DIRECT_CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                BannerPatterns.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler
                                                .LegacyNbtEntryDecoder)
                                        BannerPattern::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                EnchantmentTypes.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler.NbtEntryDecoder)
                                        EnchantmentType::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                JukeboxSongs.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler.NbtEntryDecoder)
                                        IJukeboxSong::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                Instruments.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler.NbtEntryDecoder)
                                        Instrument::decode)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                Dialogs.getRegistry(),
                                ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings
                                                .SynchronizedRegistriesHandler.NbtEntryDecoder)
                                        Dialog::decodeDirect)),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                Timelines.getRegistry(), Timeline.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                PigSoundVariants.getRegistry(), PigSoundVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                CatSoundVariants.getRegistry(), CatSoundVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                CowSoundVariants.getRegistry(), CowSoundVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                ChickenSoundVariants.getRegistry(), ChickenSoundVariant.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                WorldClocks.getRegistry(), WorldClock.DIRECT_CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                SulfurCubeArchtypes.getRegistry(), SulfurCubeArchtype.DIRECT_CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                DecoratedPotPatterns.getRegistry(), DecoratedPotPattern.CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                BlockTransformers.getRegistry(), BlockTransformer.DIRECT_CODEC),
                        new SynchronizedRegistriesHandler.RegistryEntry<>(
                                BlockStateProviders.getRegistry(), BlockStateProvider.DIRECT_CODEC))
                .forEach(
                        result ->
                                REGISTRY_KEYS.put(
                                        result.getRegistryKey(),
                                        (SynchronizedRegistriesHandler.RegistryEntry<?>) result));
    }

    @FunctionalInterface
    @Internal
    public interface LegacyNbtEntryDecoder<T> {

        T decode(NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData);

        default SynchronizedRegistriesHandler.NbtEntryDecoder<T> upgrade() {
            return (result, result2, result3) ->
                    this.decode(result, result2.getServerVersion().toClientVersion(), result3);
        }
    }

    @FunctionalInterface
    @Internal
    public interface NbtEntryDecoder<T> {

        static <T extends MappedEntity & CopyableEntity<T>>
                SynchronizedRegistriesHandler.NbtEntryDecoder<T> fromDecoder(
                        NbtDecoder<T> nbtDecoder) {
            return (result, result2, result3) ->
                    (T)
                            ((CopyableEntity)
                                            ((MappedEntity)
                                                    ((NbtDecoder) nbtDecoder)
                                                            .decode(result, result2)))
                                    .copy(result3);
        }

        T decode(
                NBT nBT,
                PacketWrapper<?> packetWrapper,
                @Nullable TypesBuilderData typesBuilderData);
    }

    @Internal
    public static final class RegistryEntry<
            T extends MappedEntity & CopyableEntity<T> & DeepComparableEntity> {

        private final IRegistry<T> baseRegistry;

        private final SynchronizedRegistriesHandler.NbtEntryDecoder<T> decoder;

        private final Map<Object, SimpleRegistry<T>> syncedRegistries = new ConcurrentHashMap<>(2);

        public RegistryEntry(
                IRegistry<T> registry,
                SynchronizedRegistriesHandler.LegacyNbtEntryDecoder<T> legacyNbtEntryDecoder) {
            this(registry, legacyNbtEntryDecoder.upgrade());
        }

        public RegistryEntry(IRegistry<T> registry, NbtDecoder<T> nbtDecoder) {
            this(registry, SynchronizedRegistriesHandler.NbtEntryDecoder.fromDecoder(nbtDecoder));
        }

        public RegistryEntry(
                IRegistry<T> registry,
                SynchronizedRegistriesHandler.NbtEntryDecoder<T> nbtEntryDecoder) {
            this.baseRegistry = registry;
            this.decoder = nbtEntryDecoder;
        }

        @Nullable
        public SimpleRegistry<T> getSyncedRegistry(Object result) {
            return this.syncedRegistries.get(result);
        }

        public SimpleRegistry<T> computeSyncedRegistry(
                Object result, Supplier<SimpleRegistry<?>> supplier) {
            return this.syncedRegistries.computeIfAbsent(
                    result, result2 -> (SimpleRegistry<T>) ((Supplier) supplier).get());
        }

        private void handleElement(
                SimpleRegistry<T> simpleRegistry,
                WrapperConfigServerRegistryData.RegistryElement registryElement,
                int value,
                PacketWrapper<?> packetWrapper) {
            ResourceLocation id = registryElement.getId();
            ClientVersion clientVersion = packetWrapper.getServerVersion().toClientVersion();
            MappedEntity byName = this.baseRegistry.getByName(clientVersion, id);
            SimpleTypesBuilderData simpleTypesBuilderData = new SimpleTypesBuilderData(id, value);
            MappedEntity mappedEntity =
                    byName == null ? null : ((CopyableEntity) byName).copy(simpleTypesBuilderData);
            MappedEntity mappedEntity2;
            if (registryElement.getData() != null
                    && !((DeepComparableEntity)
                                    (mappedEntity2 =
                                            this.decoder.decode(
                                                    registryElement.getData(),
                                                    packetWrapper,
                                                    simpleTypesBuilderData)))
                            .deepEquals(mappedEntity)) {
                simpleRegistry.define(id, value, (T) mappedEntity2);
            } else if (mappedEntity != null) {
                simpleRegistry.define(id, value, (T) mappedEntity);
            } else {
                PacketEvents.getAPI()
                        .getLogManager()
                        .warn("Unknown registry entry " + id + " for " + this.getRegistryKey());
            }
        }

        public SimpleRegistry<T> createFromElements(
                List<WrapperConfigServerRegistryData.RegistryElement> values,
                PacketWrapper<?> packetWrapper) {
            SimpleRegistry simpleRegistry = new SimpleRegistry(this.getRegistryKey());
            for (int index = 0; index < values.size(); index++) {
                WrapperConfigServerRegistryData.RegistryElement registryElement =
                        (WrapperConfigServerRegistryData.RegistryElement) values.get(index);
                this.handleElement(simpleRegistry, registryElement, index, packetWrapper);
            }
            return simpleRegistry;
        }

        public ResourceLocation getRegistryKey() {
            return this.baseRegistry.getRegistryKey();
        }
    }
}
