package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.ConnectionState;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.PacketSide;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_12;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_12_1;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_13;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_14;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_14_4;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_15;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_15_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_16;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_16_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_17;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_18;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_19;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_19_1;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_19_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_19_4;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_20_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_20_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_20_5;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21_5;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21_6;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_21_9;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_7_10;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_8;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_9;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_1_9_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_26_1;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.clientbound.ClientboundPacketType_26_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_20_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_20_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_20_5;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_21;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_21_6;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_1_21_9;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.clientbound.ClientboundConfigPacketType_26_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.serverbound.ServerboundConfigPacketType_1_20_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.serverbound.ServerboundConfigPacketType_1_20_5;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.serverbound.ServerboundConfigPacketType_1_21_6;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.config.serverbound.ServerboundConfigPacketType_1_21_9;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_12;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_12_1;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_13;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_14;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_15_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_16;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_16_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_17;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_19;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_19_1;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_19_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_19_4;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_20_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_20_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_20_5;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_2;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_4;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_5;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_6;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_21_9;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_7_10;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_8;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_1_9;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_26_1;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.serverbound.ServerboundPacketType_26_3;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.VersionMapper;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientAcceptCodeOfConduct;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientConfigurationEndAck;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientCookieResponse;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientCustomClickAction;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientKeepAlive;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientPluginMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientPong;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientResourcePackStatus;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientSelectKnownPacks;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client.WrapperConfigClientSettings;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerClearDialog;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerCodeOfConduct;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerConfigurationEnd;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerCookieRequest;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerCustomReportDetails;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerDisconnect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerKeepAlive;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerPing;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerPluginMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerPostEffects;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerRegistryData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerResetChat;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerResourcePackRemove;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerResourcePackSend;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerSelectKnownPacks;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerServerLinks;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerShowDialog;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerStoreCookie;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerTransfer;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerUpdateEnabledFeatures;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.handshaking.client.WrapperHandshakingClientHandshake;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientCookieResponse;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientEncryptionResponse;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientLoginStart;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientLoginSuccessAck;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.client.WrapperLoginClientPluginResponse;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerCookieRequest;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerDisconnect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerEncryptionRequest;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerLoginSuccess;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerPluginRequest;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerSetCompression;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientAdvancementTab;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientAnimation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientAttack;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChangeGameMode;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatAck;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatCommand;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatCommandUnsigned;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatPreview;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatSessionUpdate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChunkBatchAck;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClickWindow;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClickWindowButton;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClientStatus;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClientTickEnd;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCloseWindow;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientConfigurationAck;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCookieResponse;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCraftRecipeRequest;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCreativeInventoryAction;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCustomClickAction;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientDebugPing;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientDebugSampleSubscription;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientDebugSubscriptionRequest;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientEditBook;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientEntityAction;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientGenerateStructure;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientHeldItemChange;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientInteractEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientKeepAlive;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientLockDifficulty;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientNameItem;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPickItem;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPickItemFromBlock;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPickItemFromEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerAbilities;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerBlockPlacement;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerDigging;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerInput;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerLoaded;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerPosition;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerPositionAndRotation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerRotation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPluginMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPong;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPunch;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientQueryBlockNBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientQueryEntityNBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientResourcePackStatus;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSelectBundleItem;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSelectTrade;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetBeaconEffect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetDifficulty;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetDisplayedRecipe;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetGameRule;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetRecipeBookState;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetStructureBlock;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetTestBlock;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSettings;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSlotStateChange;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSpectate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSpectateEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSteerBoat;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSteerVehicle;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientTabComplete;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientTeleportConfirm;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientTestInstanceBlockAction;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateCommandBlock;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateCommandBlockMinecart;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateJigsawBlock;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUpdateSign;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientUseItem;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientVehicleMove;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientWindowConfirmation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerAcknowledgeBlockChanges;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerAcknowledgePlayerDigging;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerActionBar;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerAddTransientBlock;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerAttachEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockAction;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockBreakAnimation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockChange;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockEntityData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBossBar;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBundle;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCamera;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChangeGameState;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChatMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChatPreview;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkBatchBegin;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkBatchEnd;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkBiomes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChunkDataBulk;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerClearDialog;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerClearTitles;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCloseWindow;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCollectItem;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCombatEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerConfigurationStart;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCookieRequest;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCraftRecipeResponse;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCustomChatCompletions;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerCustomReportDetails;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDamageEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDeathCombatEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugBlockValue;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugChunkValue;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugEntityValue;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugPong;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDebugSample;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDeclareCommands;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDeclareRecipes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDeleteChat;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDestroyEntities;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDifficulty;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDisconnect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDisguisedChat;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerDisplayScoreboard;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEffect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEndCombatEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEnterCombatEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityAnimation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityEffect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityEquipment;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityHeadLook;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityMetadata;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityMovement;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityPositionSync;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityRelativeMove;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityRelativeMoveAndRotation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityRotation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntitySoundEffect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityStatus;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityTeleport;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityVelocity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerExplosion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerFacePlayer;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerGameRuleValues;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerGameTestHighlightPos;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerHeldItemChange;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerHurtAnimation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerInitializeWorldBorder;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerJoinGame;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerKeepAlive;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerLowDiskSpaceWarning;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMapData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMerchantOffers;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMoveMinecart;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerMultiBlockChange;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerNBTQueryResponse;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerOpenBook;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerOpenHorseWindow;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerOpenSignEditor;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerOpenWindow;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerParticle;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPing;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerAbilities;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerChatHeader;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfo;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfoRemove;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerInfoUpdate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerListHeaderAndFooter;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerPositionAndLook;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPlayerRotation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPluginMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerPostEffects;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerProjectilePower;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRecipeBookAdd;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRecipeBookRemove;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRecipeBookSettings;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRemoveEntityEffect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerResetScore;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerResourcePackRemove;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerResourcePackSend;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRespawn;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerScoreboardObjective;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSelectAdvancementsTab;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerServerData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerServerLinks;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetCompression;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetCooldown;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetCursorItem;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetDisplayChatPreview;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetExperience;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetPassengers;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetPlayerInventory;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetSlot;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetTitleSubtitle;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetTitleText;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSetTitleTimes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerShowDialog;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSoundEffect;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnExperienceOrb;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnLivingEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnPainting;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnPlayer;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnPosition;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSpawnWeatherEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerStatistics;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerStoreCookie;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSwingAnimation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSystemChatMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTabComplete;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTags;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTeams;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTestInstanceBlockStatus;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTickingState;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTickingStep;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTimeUpdate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTransfer;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUnloadChunk;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateAdvancements;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateAttributes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateEnabledFeatures;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateEntityNBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateHealth;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateLight;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateScore;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateSimulationDistance;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateViewDistance;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUpdateViewPosition;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerUseBed;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerVehicleMove;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWaypoint;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWindowConfirmation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWindowItems;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWindowProperty;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorder;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorderCenter;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorderSize;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerWorldBorderWarningReach;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayWorldBorderLerpSize;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayWorldBorderWarningDelay;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.status.client.WrapperStatusClientPing;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.status.client.WrapperStatusClientRequest;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.status.server.WrapperStatusServerPong;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.status.server.WrapperStatusServerResponse;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.ApiStatus.Obsolete;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class PacketType {

    private static volatile boolean PREPARED;

    private static final Object PREPARE_LOCK = new Object();

    private static final VersionMapper CLIENTBOUND_PLAY_VERSION_MAPPER =
            new VersionMapper(
                    ClientVersion.V_1_7_2,
                    ClientVersion.V_1_8,
                    ClientVersion.V_1_9,
                    ClientVersion.V_1_10,
                    ClientVersion.V_1_12,
                    ClientVersion.V_1_12_1,
                    ClientVersion.V_1_13,
                    ClientVersion.V_1_14,
                    ClientVersion.V_1_14_4,
                    ClientVersion.V_1_15,
                    ClientVersion.V_1_15_2,
                    ClientVersion.V_1_16,
                    ClientVersion.V_1_16_2,
                    ClientVersion.V_1_17,
                    ClientVersion.V_1_18,
                    ClientVersion.V_1_19,
                    ClientVersion.V_1_19_1,
                    ClientVersion.V_1_19_3,
                    ClientVersion.V_1_19_4,
                    ClientVersion.V_1_20_2,
                    ClientVersion.V_1_20_3,
                    ClientVersion.V_1_20_5,
                    ClientVersion.V_1_21,
                    ClientVersion.V_1_21_2,
                    ClientVersion.V_1_21_5,
                    ClientVersion.V_1_21_6,
                    ClientVersion.V_1_21_9,
                    ClientVersion.V_26_1,
                    ClientVersion.V_26_3);

    private static final VersionMapper SERVERBOUND_PLAY_VERSION_MAPPER =
            new VersionMapper(
                    ClientVersion.V_1_7_2,
                    ClientVersion.V_1_8,
                    ClientVersion.V_1_9,
                    ClientVersion.V_1_12,
                    ClientVersion.V_1_12_1,
                    ClientVersion.V_1_13,
                    ClientVersion.V_1_14,
                    ClientVersion.V_1_15_2,
                    ClientVersion.V_1_16,
                    ClientVersion.V_1_16_2,
                    ClientVersion.V_1_17,
                    ClientVersion.V_1_19,
                    ClientVersion.V_1_19_1,
                    ClientVersion.V_1_19_3,
                    ClientVersion.V_1_19_4,
                    ClientVersion.V_1_20_2,
                    ClientVersion.V_1_20_3,
                    ClientVersion.V_1_20_5,
                    ClientVersion.V_1_21_2,
                    ClientVersion.V_1_21_4,
                    ClientVersion.V_1_21_5,
                    ClientVersion.V_1_21_6,
                    ClientVersion.V_1_21_9,
                    ClientVersion.V_26_1,
                    ClientVersion.V_26_3);

    private static final VersionMapper CLIENTBOUND_CONFIG_VERSION_MAPPER =
            new VersionMapper(
                    ClientVersion.V_1_20_2,
                    ClientVersion.V_1_20_3,
                    ClientVersion.V_1_20_5,
                    ClientVersion.V_1_21,
                    ClientVersion.V_1_21_6,
                    ClientVersion.V_1_21_9,
                    ClientVersion.V_26_3);

    private static final VersionMapper SERVERBOUND_CONFIG_VERSION_MAPPER =
            new VersionMapper(
                    ClientVersion.V_1_20_2,
                    ClientVersion.V_1_20_5,
                    ClientVersion.V_1_21_6,
                    ClientVersion.V_1_21_9);

    private PacketType() {}

    @Internal
    public static void prepare() {
        if (!PREPARED) {
            synchronized (PREPARE_LOCK) {
                if (!PREPARED) {
                    PacketType.Play.Client.load();
                    PacketType.Play.Server.load();
                    PacketType.Configuration.Client.load();
                    PacketType.Configuration.Server.load();
                    PREPARED = true;
                }
            }
        }
    }

    @Internal
    public static boolean isPrepared() {
        return PREPARED;
    }

    public static PacketTypeCommon getById(
            PacketSide packetSide,
            ConnectionState connectionState,
            ClientVersion clientVersion,
            int value) {
        switch (connectionState) {
            case HANDSHAKING:
                if (packetSide == PacketSide.CLIENT) {
                    return PacketType.Handshaking.Client.getById(value);
                }
                return PacketType.Handshaking.Server.getById(value);
            case STATUS:
                if (packetSide == PacketSide.CLIENT) {
                    return PacketType.Status.Client.getById(value);
                }
                return PacketType.Status.Server.getById(value);
            case LOGIN:
                if (packetSide == PacketSide.CLIENT) {
                    return PacketType.Login.Client.getById(value);
                }
                return PacketType.Login.Server.getById(value);
            case PLAY:
                if (packetSide == PacketSide.CLIENT) {
                    return PacketType.Play.Client.getById(clientVersion, value);
                }
                return PacketType.Play.Server.getById(clientVersion, value);
            case CONFIGURATION:
                if (packetSide == PacketSide.CLIENT) {
                    return PacketType.Configuration.Client.getById(clientVersion, value);
                }
                return PacketType.Configuration.Server.getById(clientVersion, value);
            default:
                return null;
        }
    }

    public static class Configuration {

        public enum Client implements PacketTypeCommon, ServerBoundPacket {
            CLIENT_SETTINGS(WrapperConfigClientSettings.class),
            PLUGIN_MESSAGE(WrapperConfigClientPluginMessage.class),
            CONFIGURATION_END_ACK(WrapperConfigClientConfigurationEndAck.class),
            KEEP_ALIVE(WrapperConfigClientKeepAlive.class),
            PONG(WrapperConfigClientPong.class),
            RESOURCE_PACK_STATUS(WrapperConfigClientResourcePackStatus.class),
            COOKIE_RESPONSE(WrapperConfigClientCookieResponse.class),
            SELECT_KNOWN_PACKS(WrapperConfigClientSelectKnownPacks.class),
            CUSTOM_CLICK_ACTION(WrapperConfigClientCustomClickAction.class),
            ACCEPT_CODE_OF_CONDUCT(WrapperConfigClientAcceptCodeOfConduct.class);

            private static int INDEX = 0;

            private static final Map<Byte, Map<Integer, PacketTypeCommon>> PACKET_TYPE_ID_MAP =
                    new HashMap<>();

            private final int[] ids =
                    new int[PacketType.SERVERBOUND_CONFIG_VERSION_MAPPER.getVersions().length];

            private final Class<? extends PacketWrapper<?>> wrapper;

            Client(@Nullable Class<? extends PacketWrapper<?>> classValue) {
                Arrays.fill(this.ids, -1);
                this.wrapper = classValue;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapper;
            }

            public static void load() {
                INDEX = 0;
                loadPacketIds(ServerboundConfigPacketType_1_20_2.values());
                loadPacketIds(ServerboundConfigPacketType_1_20_5.values());
                loadPacketIds(ServerboundConfigPacketType_1_21_6.values());
                loadPacketIds(ServerboundConfigPacketType_1_21_9.values());
            }

            private static void loadPacketIds(Enum<?>[] enums) {
                int value = INDEX;
                int value2 = enums.length;
                for (int index = 0; index < value2; index++) {
                    Enum enumValue;
                    int value3 = (enumValue = ((Enum[]) enums)[index]).ordinal();
                    PacketType.Configuration.Client client;
                    (client = valueOf(enumValue.name())).ids[value] = value3;
                    PACKET_TYPE_ID_MAP
                            .computeIfAbsent((byte) value, result -> new HashMap<>())
                            .put(value3, client);
                }
                INDEX++;
            }

            @Nullable
            public static PacketTypeCommon getById(int value) {
                return getById(ClientVersion.getLatest(), value);
            }

            @Nullable
            public static PacketTypeCommon getById(ClientVersion clientVersion, int value) {
                PacketType.prepare();
                int index = PacketType.SERVERBOUND_CONFIG_VERSION_MAPPER.getIndex(clientVersion);
                return PACKET_TYPE_ID_MAP.get((byte) index).get(value);
            }

            @Deprecated
            public int getId() {
                return this.getId(ClientVersion.getLatest());
            }

            @Override
            public int getId(ClientVersion clientVersion) {
                PacketType.prepare();
                int index = PacketType.SERVERBOUND_CONFIG_VERSION_MAPPER.getIndex(clientVersion);
                return this.ids[index];
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.CLIENT;
            }
        }

        public enum Server implements PacketTypeCommon, ClientBoundPacket {
            PLUGIN_MESSAGE(WrapperConfigServerPluginMessage.class),
            DISCONNECT(WrapperConfigServerDisconnect.class),
            CONFIGURATION_END(WrapperConfigServerConfigurationEnd.class),
            KEEP_ALIVE(WrapperConfigServerKeepAlive.class),
            PING(WrapperConfigServerPing.class),
            REGISTRY_DATA(WrapperConfigServerRegistryData.class),
            RESOURCE_PACK_SEND(WrapperConfigServerResourcePackSend.class),
            UPDATE_ENABLED_FEATURES(WrapperConfigServerUpdateEnabledFeatures.class),
            UPDATE_TAGS(null),
            RESOURCE_PACK_REMOVE(WrapperConfigServerResourcePackRemove.class),
            COOKIE_REQUEST(WrapperConfigServerCookieRequest.class),
            RESET_CHAT(WrapperConfigServerResetChat.class),
            STORE_COOKIE(WrapperConfigServerStoreCookie.class),
            TRANSFER(WrapperConfigServerTransfer.class),
            SELECT_KNOWN_PACKS(WrapperConfigServerSelectKnownPacks.class),
            CUSTOM_REPORT_DETAILS(WrapperConfigServerCustomReportDetails.class),
            SERVER_LINKS(WrapperConfigServerServerLinks.class),
            CLEAR_DIALOG(WrapperConfigServerClearDialog.class),
            SHOW_DIALOG(WrapperConfigServerShowDialog.class),
            CODE_OF_CONDUCT(WrapperConfigServerCodeOfConduct.class),
            POST_EFFECTS(WrapperConfigServerPostEffects.class);

            private static int INDEX = 0;

            private static final Map<Byte, Map<Integer, PacketTypeCommon>> PACKET_TYPE_ID_MAP =
                    new HashMap<>();

            private final int[] ids =
                    new int[PacketType.CLIENTBOUND_CONFIG_VERSION_MAPPER.getVersions().length];

            private final Class<? extends PacketWrapper<?>> wrapper;

            Server(@Nullable Class<? extends PacketWrapper<?>> classValue) {
                Arrays.fill(this.ids, -1);
                this.wrapper = classValue;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapper;
            }

            public static void load() {
                INDEX = 0;
                loadPacketIds(ClientboundConfigPacketType_1_20_2.values());
                loadPacketIds(ClientboundConfigPacketType_1_20_3.values());
                loadPacketIds(ClientboundConfigPacketType_1_20_5.values());
                loadPacketIds(ClientboundConfigPacketType_1_21.values());
                loadPacketIds(ClientboundConfigPacketType_1_21_6.values());
                loadPacketIds(ClientboundConfigPacketType_1_21_9.values());
                loadPacketIds(ClientboundConfigPacketType_26_3.values());
            }

            private static void loadPacketIds(Enum<?>[] enums) {
                int value = INDEX;
                int value2 = enums.length;
                for (int index = 0; index < value2; index++) {
                    Enum enumValue;
                    int value3 = (enumValue = ((Enum[]) enums)[index]).ordinal();
                    PacketType.Configuration.Server server;
                    (server = valueOf(enumValue.name())).ids[value] = value3;
                    PACKET_TYPE_ID_MAP
                            .computeIfAbsent((byte) value, result -> new HashMap<>())
                            .put(value3, server);
                }
                INDEX++;
            }

            @Nullable
            public static PacketTypeCommon getById(int value) {
                return getById(ClientVersion.getLatest(), value);
            }

            @Nullable
            public static PacketTypeCommon getById(ClientVersion clientVersion, int value) {
                PacketType.prepare();
                int index = PacketType.CLIENTBOUND_CONFIG_VERSION_MAPPER.getIndex(clientVersion);
                return PACKET_TYPE_ID_MAP.get((byte) index).get(value);
            }

            @Deprecated
            public int getId() {
                return this.getId(ClientVersion.getLatest());
            }

            @Override
            public int getId(ClientVersion clientVersion) {
                PacketType.prepare();
                int index = PacketType.CLIENTBOUND_CONFIG_VERSION_MAPPER.getIndex(clientVersion);
                return this.ids[index];
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.SERVER;
            }
        }
    }

    public static class Handshaking {

        public enum Client implements PacketTypeConstant, ServerBoundPacket {
            HANDSHAKE(0, WrapperHandshakingClientHandshake.class),
            LEGACY_SERVER_LIST_PING(254, null);

            private final int id;

            private final Class<? extends PacketWrapper<?>> wrapperClass;

            Client(int id, @Nullable Class<? extends PacketWrapper<?>> classValue) {
                this.id = id;
                this.wrapperClass = classValue;
            }

            @Nullable
            public static PacketTypeCommon getById(int value) {
                if (value == 0) {
                    return HANDSHAKE;
                } else {
                    return value == 254 ? LEGACY_SERVER_LIST_PING : null;
                }
            }

            @Override
            public int getId() {
                return this.id;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapperClass;
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.CLIENT;
            }
        }

        public enum Server implements PacketTypeConstant, ClientBoundPacket {
            LEGACY_SERVER_LIST_RESPONSE(254, null);

            private final int id;

            private final Class<? extends PacketWrapper<?>> wrapperClass;

            Server(int id, @Nullable Class<? extends PacketWrapper<?>> classValue) {
                this.id = id;
                this.wrapperClass = classValue;
            }

            @Nullable
            public static PacketTypeCommon getById(int value) {
                return value == 254 ? LEGACY_SERVER_LIST_RESPONSE : null;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapperClass;
            }

            @Override
            public int getId() {
                return this.id;
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.SERVER;
            }
        }
    }

    public static class Login {

        public enum Client implements PacketTypeConstant, ServerBoundPacket {
            LOGIN_START(0, WrapperLoginClientLoginStart.class),
            ENCRYPTION_RESPONSE(1, WrapperLoginClientEncryptionResponse.class),
            LOGIN_PLUGIN_RESPONSE(2, WrapperLoginClientPluginResponse.class),
            LOGIN_SUCCESS_ACK(3, WrapperLoginClientLoginSuccessAck.class),
            COOKIE_RESPONSE(4, WrapperLoginClientCookieResponse.class);

            private final int id;

            private final Class<? extends PacketWrapper<?>> wrapperClass;

            Client(int id, @Nullable Class<? extends PacketWrapper<?>> classValue) {
                this.id = id;
                this.wrapperClass = classValue;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapperClass;
            }

            @Nullable
            public static PacketTypeCommon getById(int value) {
                switch (value) {
                    case 0:
                        return LOGIN_START;
                    case 1:
                        return ENCRYPTION_RESPONSE;
                    case 2:
                        return LOGIN_PLUGIN_RESPONSE;
                    case 3:
                        return LOGIN_SUCCESS_ACK;
                    case 4:
                        return COOKIE_RESPONSE;
                    default:
                        return null;
                }
            }

            @Override
            public int getId() {
                return this.id;
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.CLIENT;
            }
        }

        public enum Server implements PacketTypeConstant, ClientBoundPacket {
            DISCONNECT(0, WrapperLoginServerDisconnect.class),
            ENCRYPTION_REQUEST(1, WrapperLoginServerEncryptionRequest.class),
            LOGIN_SUCCESS(2, WrapperLoginServerLoginSuccess.class),
            SET_COMPRESSION(3, WrapperLoginServerSetCompression.class),
            LOGIN_PLUGIN_REQUEST(4, WrapperLoginServerPluginRequest.class),
            COOKIE_REQUEST(5, WrapperLoginServerCookieRequest.class);

            private final int id;

            private final Class<? extends PacketWrapper<?>> wrapperClass;

            Server(int id, @Nullable Class<? extends PacketWrapper<?>> classValue) {
                this.id = id;
                this.wrapperClass = classValue;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapperClass;
            }

            @Nullable
            public static PacketTypeCommon getById(int value) {
                switch (value) {
                    case 0:
                        return DISCONNECT;
                    case 1:
                        return ENCRYPTION_REQUEST;
                    case 2:
                        return LOGIN_SUCCESS;
                    case 3:
                        return SET_COMPRESSION;
                    case 4:
                        return LOGIN_PLUGIN_REQUEST;
                    case 5:
                        return COOKIE_REQUEST;
                    default:
                        return null;
                }
            }

            @Override
            public int getId() {
                return this.id;
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.SERVER;
            }
        }
    }

    public static class Play {

        public enum Client implements PacketTypeCommon, ServerBoundPacket {
            CHAT_PREVIEW(WrapperPlayClientChatPreview.class),
            TELEPORT_CONFIRM(WrapperPlayClientTeleportConfirm.class),
            QUERY_BLOCK_NBT(WrapperPlayClientQueryBlockNBT.class),
            SET_DIFFICULTY(WrapperPlayClientSetDifficulty.class),
            CHAT_MESSAGE(WrapperPlayClientChatMessage.class),
            CLIENT_STATUS(WrapperPlayClientClientStatus.class),
            CLIENT_SETTINGS(WrapperPlayClientSettings.class),
            TAB_COMPLETE(WrapperPlayClientTabComplete.class),
            WINDOW_CONFIRMATION(WrapperPlayClientWindowConfirmation.class),
            CLICK_WINDOW_BUTTON(WrapperPlayClientClickWindowButton.class),
            CLICK_WINDOW(WrapperPlayClientClickWindow.class),
            CLOSE_WINDOW(WrapperPlayClientCloseWindow.class),
            PLUGIN_MESSAGE(WrapperPlayClientPluginMessage.class),
            EDIT_BOOK(WrapperPlayClientEditBook.class),
            QUERY_ENTITY_NBT(WrapperPlayClientQueryEntityNBT.class),
            INTERACT_ENTITY(WrapperPlayClientInteractEntity.class),
            GENERATE_STRUCTURE(WrapperPlayClientGenerateStructure.class),
            KEEP_ALIVE(WrapperPlayClientKeepAlive.class),
            LOCK_DIFFICULTY(WrapperPlayClientLockDifficulty.class),
            PLAYER_POSITION(WrapperPlayClientPlayerPosition.class),
            PLAYER_POSITION_AND_ROTATION(WrapperPlayClientPlayerPositionAndRotation.class),
            PLAYER_ROTATION(WrapperPlayClientPlayerRotation.class),
            PLAYER_FLYING(WrapperPlayClientPlayerFlying.class),
            VEHICLE_MOVE(WrapperPlayClientVehicleMove.class),
            STEER_BOAT(WrapperPlayClientSteerBoat.class),
            @Obsolete
            PICK_ITEM(WrapperPlayClientPickItem.class),
            CRAFT_RECIPE_REQUEST(WrapperPlayClientCraftRecipeRequest.class),
            PLAYER_ABILITIES(WrapperPlayClientPlayerAbilities.class),
            PLAYER_DIGGING(WrapperPlayClientPlayerDigging.class),
            ENTITY_ACTION(WrapperPlayClientEntityAction.class),
            @Obsolete
            STEER_VEHICLE(WrapperPlayClientSteerVehicle.class),
            PONG(WrapperPlayClientPong.class),
            RECIPE_BOOK_DATA(null),
            SET_DISPLAYED_RECIPE(WrapperPlayClientSetDisplayedRecipe.class),
            SET_RECIPE_BOOK_STATE(WrapperPlayClientSetRecipeBookState.class),
            NAME_ITEM(WrapperPlayClientNameItem.class),
            RESOURCE_PACK_STATUS(WrapperPlayClientResourcePackStatus.class),
            ADVANCEMENT_TAB(WrapperPlayClientAdvancementTab.class),
            SELECT_TRADE(WrapperPlayClientSelectTrade.class),
            SET_BEACON_EFFECT(WrapperPlayClientSetBeaconEffect.class),
            HELD_ITEM_CHANGE(WrapperPlayClientHeldItemChange.class),
            UPDATE_COMMAND_BLOCK(WrapperPlayClientUpdateCommandBlock.class),
            UPDATE_COMMAND_BLOCK_MINECART(WrapperPlayClientUpdateCommandBlockMinecart.class),
            CREATIVE_INVENTORY_ACTION(WrapperPlayClientCreativeInventoryAction.class),
            UPDATE_JIGSAW_BLOCK(WrapperPlayClientUpdateJigsawBlock.class),
            UPDATE_STRUCTURE_BLOCK(WrapperPlayClientSetStructureBlock.class),
            UPDATE_SIGN(WrapperPlayClientUpdateSign.class),
            @Obsolete
            ANIMATION(WrapperPlayClientAnimation.class),
            SPECTATE(WrapperPlayClientSpectate.class),
            PLAYER_BLOCK_PLACEMENT(WrapperPlayClientPlayerBlockPlacement.class),
            USE_ITEM(WrapperPlayClientUseItem.class),
            CHAT_COMMAND(WrapperPlayClientChatCommand.class),
            CHAT_ACK(WrapperPlayClientChatAck.class),
            CHAT_SESSION_UPDATE(WrapperPlayClientChatSessionUpdate.class),
            CHUNK_BATCH_ACK(WrapperPlayClientChunkBatchAck.class),
            CONFIGURATION_ACK(WrapperPlayClientConfigurationAck.class),
            DEBUG_PING(WrapperPlayClientDebugPing.class),
            SLOT_STATE_CHANGE(WrapperPlayClientSlotStateChange.class),
            CHAT_COMMAND_UNSIGNED(WrapperPlayClientChatCommandUnsigned.class),
            COOKIE_RESPONSE(WrapperPlayClientCookieResponse.class),
            @Obsolete
            DEBUG_SAMPLE_SUBSCRIPTION(WrapperPlayClientDebugSampleSubscription.class),
            CLIENT_TICK_END(WrapperPlayClientClientTickEnd.class),
            SELECT_BUNDLE_ITEM(WrapperPlayClientSelectBundleItem.class),
            PLAYER_INPUT(WrapperPlayClientPlayerInput.class),
            PICK_ITEM_FROM_BLOCK(WrapperPlayClientPickItemFromBlock.class),
            PICK_ITEM_FROM_ENTITY(WrapperPlayClientPickItemFromEntity.class),
            PLAYER_LOADED(WrapperPlayClientPlayerLoaded.class),
            SET_TEST_BLOCK(WrapperPlayClientSetTestBlock.class),
            TEST_INSTANCE_BLOCK_ACTION(WrapperPlayClientTestInstanceBlockAction.class),
            CHANGE_GAME_MODE(WrapperPlayClientChangeGameMode.class),
            CUSTOM_CLICK_ACTION(WrapperPlayClientCustomClickAction.class),
            DEBUG_SUBSCRIPTION_REQUEST(WrapperPlayClientDebugSubscriptionRequest.class),
            ATTACK(WrapperPlayClientAttack.class),
            SET_GAME_RULE(WrapperPlayClientSetGameRule.class),
            SPECTATE_ENTITY(WrapperPlayClientSpectateEntity.class),
            PUNCH(WrapperPlayClientPunch.class);

            private static int INDEX = 0;

            private static final Map<Byte, Map<Integer, PacketTypeCommon>> PACKET_TYPE_ID_MAP =
                    new HashMap<>();

            private final int[] ids =
                    new int[PacketType.SERVERBOUND_PLAY_VERSION_MAPPER.getVersions().length];

            private final Class<? extends PacketWrapper<?>> wrapper;

            Client(@Nullable Class<? extends PacketWrapper<?>> classValue) {
                Arrays.fill(this.ids, -1);
                this.wrapper = classValue;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapper;
            }

            @Nullable
            public static PacketTypeCommon getById(ClientVersion clientVersion, int value) {
                PacketType.prepare();
                int index = PacketType.SERVERBOUND_PLAY_VERSION_MAPPER.getIndex(clientVersion);
                return PACKET_TYPE_ID_MAP
                        .computeIfAbsent((byte) index, result -> new HashMap<>())
                        .get(value);
            }

            private static void loadPacketIds(Enum<?>[] enums) {
                int value = INDEX;
                int value2 = enums.length;
                for (int index = 0; index < value2; index++) {
                    Enum enumValue;
                    int value3 = (enumValue = ((Enum[]) enums)[index]).ordinal();
                    PacketType.Play.Client client;
                    (client = valueOf(enumValue.name())).ids[value] = value3;
                    PACKET_TYPE_ID_MAP
                            .computeIfAbsent((byte) value, result -> new HashMap<>())
                            .put(value3, client);
                }
                INDEX++;
            }

            public static void load() {
                INDEX = 0;
                loadPacketIds(ServerboundPacketType_1_7_10.values());
                loadPacketIds(ServerboundPacketType_1_8.values());
                loadPacketIds(ServerboundPacketType_1_9.values());
                loadPacketIds(ServerboundPacketType_1_12.values());
                loadPacketIds(ServerboundPacketType_1_12_1.values());
                loadPacketIds(ServerboundPacketType_1_13.values());
                loadPacketIds(ServerboundPacketType_1_14.values());
                loadPacketIds(ServerboundPacketType_1_15_2.values());
                loadPacketIds(ServerboundPacketType_1_16.values());
                loadPacketIds(ServerboundPacketType_1_16_2.values());
                loadPacketIds(ServerboundPacketType_1_17.values());
                loadPacketIds(ServerboundPacketType_1_19.values());
                loadPacketIds(ServerboundPacketType_1_19_1.values());
                loadPacketIds(ServerboundPacketType_1_19_3.values());
                loadPacketIds(ServerboundPacketType_1_19_4.values());
                loadPacketIds(ServerboundPacketType_1_20_2.values());
                loadPacketIds(ServerboundPacketType_1_20_3.values());
                loadPacketIds(ServerboundPacketType_1_20_5.values());
                loadPacketIds(ServerboundPacketType_1_21_2.values());
                loadPacketIds(ServerboundPacketType_1_21_4.values());
                loadPacketIds(ServerboundPacketType_1_21_5.values());
                loadPacketIds(ServerboundPacketType_1_21_6.values());
                loadPacketIds(ServerboundPacketType_1_21_9.values());
                loadPacketIds(ServerboundPacketType_26_1.values());
                loadPacketIds(ServerboundPacketType_26_3.values());
            }

            @Override
            public int getId(ClientVersion clientVersion) {
                PacketType.prepare();
                int index = PacketType.SERVERBOUND_PLAY_VERSION_MAPPER.getIndex(clientVersion);
                return this.ids[index];
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.CLIENT;
            }
        }

        public enum Server implements PacketTypeCommon, ClientBoundPacket {
            SET_COMPRESSION(WrapperPlayServerSetCompression.class),
            MAP_CHUNK_BULK(WrapperPlayServerChunkDataBulk.class),
            UPDATE_ENTITY_NBT(WrapperPlayServerUpdateEntityNBT.class),
            UPDATE_SIGN(null),
            USE_BED(WrapperPlayServerUseBed.class),
            SPAWN_WEATHER_ENTITY(WrapperPlayServerSpawnWeatherEntity.class),
            TITLE(WrapperPlayServerSetTitleSubtitle.class),
            WORLD_BORDER(WrapperPlayServerWorldBorder.class),
            COMBAT_EVENT(WrapperPlayServerCombatEvent.class),
            ENTITY_MOVEMENT(WrapperPlayServerEntityMovement.class),
            SPAWN_LIVING_ENTITY(WrapperPlayServerSpawnLivingEntity.class),
            SPAWN_PAINTING(WrapperPlayServerSpawnPainting.class),
            SCULK_VIBRATION_SIGNAL(null),
            ACKNOWLEDGE_PLAYER_DIGGING(WrapperPlayServerAcknowledgePlayerDigging.class),
            CHAT_PREVIEW_PACKET(WrapperPlayServerChatPreview.class),
            NAMED_SOUND_EFFECT(null),
            PLAYER_CHAT_HEADER(WrapperPlayServerPlayerChatHeader.class),
            PLAYER_INFO(WrapperPlayServerPlayerInfo.class),
            DISPLAY_CHAT_PREVIEW(WrapperPlayServerSetDisplayChatPreview.class),
            UPDATE_ENABLED_FEATURES(WrapperPlayServerUpdateEnabledFeatures.class),
            SPAWN_PLAYER(WrapperPlayServerSpawnPlayer.class),
            WINDOW_CONFIRMATION(WrapperPlayServerWindowConfirmation.class),
            SPAWN_ENTITY(WrapperPlayServerSpawnEntity.class),
            @Obsolete
            SPAWN_EXPERIENCE_ORB(WrapperPlayServerSpawnExperienceOrb.class),
            ENTITY_ANIMATION(WrapperPlayServerEntityAnimation.class),
            STATISTICS(WrapperPlayServerStatistics.class),
            BLOCK_BREAK_ANIMATION(WrapperPlayServerBlockBreakAnimation.class),
            BLOCK_ENTITY_DATA(WrapperPlayServerBlockEntityData.class),
            BLOCK_ACTION(WrapperPlayServerBlockAction.class),
            BLOCK_CHANGE(WrapperPlayServerBlockChange.class),
            BOSS_BAR(WrapperPlayServerBossBar.class),
            SERVER_DIFFICULTY(WrapperPlayServerDifficulty.class),
            CLEAR_TITLES(WrapperPlayServerClearTitles.class),
            TAB_COMPLETE(WrapperPlayServerTabComplete.class),
            MULTI_BLOCK_CHANGE(WrapperPlayServerMultiBlockChange.class),
            DECLARE_COMMANDS(WrapperPlayServerDeclareCommands.class),
            CLOSE_WINDOW(WrapperPlayServerCloseWindow.class),
            WINDOW_ITEMS(WrapperPlayServerWindowItems.class),
            WINDOW_PROPERTY(WrapperPlayServerWindowProperty.class),
            SET_SLOT(WrapperPlayServerSetSlot.class),
            SET_COOLDOWN(WrapperPlayServerSetCooldown.class),
            PLUGIN_MESSAGE(WrapperPlayServerPluginMessage.class),
            DISCONNECT(WrapperPlayServerDisconnect.class),
            ENTITY_STATUS(WrapperPlayServerEntityStatus.class),
            EXPLOSION(WrapperPlayServerExplosion.class),
            UNLOAD_CHUNK(WrapperPlayServerUnloadChunk.class),
            CHANGE_GAME_STATE(WrapperPlayServerChangeGameState.class),
            OPEN_HORSE_WINDOW(WrapperPlayServerOpenHorseWindow.class),
            INITIALIZE_WORLD_BORDER(WrapperPlayServerInitializeWorldBorder.class),
            KEEP_ALIVE(WrapperPlayServerKeepAlive.class),
            CHUNK_DATA(WrapperPlayServerChunkData.class),
            EFFECT(WrapperPlayServerEffect.class),
            PARTICLE(WrapperPlayServerParticle.class),
            UPDATE_LIGHT(WrapperPlayServerUpdateLight.class),
            JOIN_GAME(WrapperPlayServerJoinGame.class),
            MAP_DATA(WrapperPlayServerMapData.class),
            MERCHANT_OFFERS(WrapperPlayServerMerchantOffers.class),
            ENTITY_RELATIVE_MOVE(WrapperPlayServerEntityRelativeMove.class),
            ENTITY_RELATIVE_MOVE_AND_ROTATION(WrapperPlayServerEntityRelativeMoveAndRotation.class),
            ENTITY_ROTATION(WrapperPlayServerEntityRotation.class),
            VEHICLE_MOVE(WrapperPlayServerVehicleMove.class),
            OPEN_BOOK(WrapperPlayServerOpenBook.class),
            OPEN_WINDOW(WrapperPlayServerOpenWindow.class),
            OPEN_SIGN_EDITOR(WrapperPlayServerOpenSignEditor.class),
            PING(WrapperPlayServerPing.class),
            CRAFT_RECIPE_RESPONSE(WrapperPlayServerCraftRecipeResponse.class),
            PLAYER_ABILITIES(WrapperPlayServerPlayerAbilities.class),
            END_COMBAT_EVENT(WrapperPlayServerEndCombatEvent.class),
            ENTER_COMBAT_EVENT(WrapperPlayServerEnterCombatEvent.class),
            DEATH_COMBAT_EVENT(WrapperPlayServerDeathCombatEvent.class),
            FACE_PLAYER(WrapperPlayServerFacePlayer.class),
            PLAYER_POSITION_AND_LOOK(WrapperPlayServerPlayerPositionAndLook.class),
            @Obsolete
            UNLOCK_RECIPES(null),
            DESTROY_ENTITIES(WrapperPlayServerDestroyEntities.class),
            REMOVE_ENTITY_EFFECT(WrapperPlayServerRemoveEntityEffect.class),
            RESOURCE_PACK_SEND(WrapperPlayServerResourcePackSend.class),
            RESPAWN(WrapperPlayServerRespawn.class),
            ENTITY_HEAD_LOOK(WrapperPlayServerEntityHeadLook.class),
            SELECT_ADVANCEMENTS_TAB(WrapperPlayServerSelectAdvancementsTab.class),
            ACTION_BAR(WrapperPlayServerActionBar.class),
            WORLD_BORDER_CENTER(WrapperPlayServerWorldBorderCenter.class),
            WORLD_BORDER_LERP_SIZE(WrapperPlayWorldBorderLerpSize.class),
            WORLD_BORDER_SIZE(WrapperPlayServerWorldBorderSize.class),
            WORLD_BORDER_WARNING_DELAY(WrapperPlayWorldBorderWarningDelay.class),
            WORLD_BORDER_WARNING_REACH(WrapperPlayServerWorldBorderWarningReach.class),
            CAMERA(WrapperPlayServerCamera.class),
            HELD_ITEM_CHANGE(WrapperPlayServerHeldItemChange.class),
            UPDATE_VIEW_POSITION(WrapperPlayServerUpdateViewPosition.class),
            UPDATE_VIEW_DISTANCE(WrapperPlayServerUpdateViewDistance.class),
            SPAWN_POSITION(WrapperPlayServerSpawnPosition.class),
            DISPLAY_SCOREBOARD(WrapperPlayServerDisplayScoreboard.class),
            ENTITY_METADATA(WrapperPlayServerEntityMetadata.class),
            ATTACH_ENTITY(WrapperPlayServerAttachEntity.class),
            ENTITY_VELOCITY(WrapperPlayServerEntityVelocity.class),
            ENTITY_EQUIPMENT(WrapperPlayServerEntityEquipment.class),
            SET_EXPERIENCE(WrapperPlayServerSetExperience.class),
            UPDATE_HEALTH(WrapperPlayServerUpdateHealth.class),
            SCOREBOARD_OBJECTIVE(WrapperPlayServerScoreboardObjective.class),
            SET_PASSENGERS(WrapperPlayServerSetPassengers.class),
            TEAMS(WrapperPlayServerTeams.class),
            UPDATE_SCORE(WrapperPlayServerUpdateScore.class),
            UPDATE_SIMULATION_DISTANCE(WrapperPlayServerUpdateSimulationDistance.class),
            SET_TITLE_SUBTITLE(WrapperPlayServerSetTitleSubtitle.class),
            TIME_UPDATE(WrapperPlayServerTimeUpdate.class),
            SET_TITLE_TEXT(WrapperPlayServerSetTitleText.class),
            SET_TITLE_TIMES(WrapperPlayServerSetTitleTimes.class),
            ENTITY_SOUND_EFFECT(WrapperPlayServerEntitySoundEffect.class),
            SOUND_EFFECT(WrapperPlayServerSoundEffect.class),
            STOP_SOUND(null),
            PLAYER_LIST_HEADER_AND_FOOTER(WrapperPlayServerPlayerListHeaderAndFooter.class),
            NBT_QUERY_RESPONSE(WrapperPlayServerNBTQueryResponse.class),
            COLLECT_ITEM(WrapperPlayServerCollectItem.class),
            ENTITY_TELEPORT(WrapperPlayServerEntityTeleport.class),
            UPDATE_ADVANCEMENTS(WrapperPlayServerUpdateAdvancements.class),
            UPDATE_ATTRIBUTES(WrapperPlayServerUpdateAttributes.class),
            ENTITY_EFFECT(WrapperPlayServerEntityEffect.class),
            DECLARE_RECIPES(WrapperPlayServerDeclareRecipes.class),
            TAGS(WrapperPlayServerTags.class),
            CHAT_MESSAGE(WrapperPlayServerChatMessage.class),
            ACKNOWLEDGE_BLOCK_CHANGES(WrapperPlayServerAcknowledgeBlockChanges.class),
            SERVER_DATA(WrapperPlayServerServerData.class),
            SYSTEM_CHAT_MESSAGE(WrapperPlayServerSystemChatMessage.class),
            DELETE_CHAT(WrapperPlayServerDeleteChat.class),
            CUSTOM_CHAT_COMPLETIONS(WrapperPlayServerCustomChatCompletions.class),
            DISGUISED_CHAT(WrapperPlayServerDisguisedChat.class),
            PLAYER_INFO_REMOVE(WrapperPlayServerPlayerInfoRemove.class),
            PLAYER_INFO_UPDATE(WrapperPlayServerPlayerInfoUpdate.class),
            DAMAGE_EVENT(WrapperPlayServerDamageEvent.class),
            HURT_ANIMATION(WrapperPlayServerHurtAnimation.class),
            BUNDLE(WrapperPlayServerBundle.class),
            CHUNK_BIOMES(WrapperPlayServerChunkBiomes.class),
            CHUNK_BATCH_END(WrapperPlayServerChunkBatchEnd.class),
            CHUNK_BATCH_BEGIN(WrapperPlayServerChunkBatchBegin.class),
            DEBUG_PONG(WrapperPlayServerDebugPong.class),
            CONFIGURATION_START(WrapperPlayServerConfigurationStart.class),
            RESET_SCORE(WrapperPlayServerResetScore.class),
            RESOURCE_PACK_REMOVE(WrapperPlayServerResourcePackRemove.class),
            TICKING_STATE(WrapperPlayServerTickingState.class),
            TICKING_STEP(WrapperPlayServerTickingStep.class),
            COOKIE_REQUEST(WrapperPlayServerCookieRequest.class),
            DEBUG_SAMPLE(WrapperPlayServerDebugSample.class),
            STORE_COOKIE(WrapperPlayServerStoreCookie.class),
            TRANSFER(WrapperPlayServerTransfer.class),
            PROJECTILE_POWER(WrapperPlayServerProjectilePower.class),
            CUSTOM_REPORT_DETAILS(WrapperPlayServerCustomReportDetails.class),
            SERVER_LINKS(WrapperPlayServerServerLinks.class),
            MOVE_MINECART(WrapperPlayServerMoveMinecart.class),
            SET_CURSOR_ITEM(WrapperPlayServerSetCursorItem.class),
            SET_PLAYER_INVENTORY(WrapperPlayServerSetPlayerInventory.class),
            ENTITY_POSITION_SYNC(WrapperPlayServerEntityPositionSync.class),
            PLAYER_ROTATION(WrapperPlayServerPlayerRotation.class),
            RECIPE_BOOK_ADD(WrapperPlayServerRecipeBookAdd.class),
            RECIPE_BOOK_REMOVE(WrapperPlayServerRecipeBookRemove.class),
            RECIPE_BOOK_SETTINGS(WrapperPlayServerRecipeBookSettings.class),
            TEST_INSTANCE_BLOCK_STATUS(WrapperPlayServerTestInstanceBlockStatus.class),
            WAYPOINT(WrapperPlayServerWaypoint.class),
            CLEAR_DIALOG(WrapperPlayServerClearDialog.class),
            SHOW_DIALOG(WrapperPlayServerShowDialog.class),
            DEBUG_BLOCK_VALUE(WrapperPlayServerDebugBlockValue.class),
            DEBUG_CHUNK_VALUE(WrapperPlayServerDebugChunkValue.class),
            DEBUG_ENTITY_VALUE(WrapperPlayServerDebugEntityValue.class),
            DEBUG_EVENT(WrapperPlayServerDebugEvent.class),
            GAME_TEST_HIGHLIGHT_POS(WrapperPlayServerGameTestHighlightPos.class),
            GAME_RULE_VALUES(WrapperPlayServerGameRuleValues.class),
            LOW_DISK_SPACE_WARNING(WrapperPlayServerLowDiskSpaceWarning.class),
            POST_EFFECTS(WrapperPlayServerPostEffects.class),
            ADD_TRANSIENT_BLOCK(WrapperPlayServerAddTransientBlock.class),
            SWING_ANIMATION(WrapperPlayServerSwingAnimation.class);

            private static int INDEX = 0;

            private static final Map<Byte, Map<Integer, PacketTypeCommon>> PACKET_TYPE_ID_MAP =
                    new HashMap<>();

            private final int[] ids =
                    new int[PacketType.CLIENTBOUND_PLAY_VERSION_MAPPER.getVersions().length];

            private final Class<? extends PacketWrapper<?>> wrapper;

            Server(@Nullable Class<? extends PacketWrapper<?>> classValue) {
                Arrays.fill(this.ids, -1);
                this.wrapper = classValue;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapper;
            }

            @Override
            public int getId(ClientVersion clientVersion) {
                PacketType.prepare();
                int index = PacketType.CLIENTBOUND_PLAY_VERSION_MAPPER.getIndex(clientVersion);
                return this.ids[index];
            }

            @Nullable
            public static PacketTypeCommon getById(ClientVersion clientVersion, int value) {
                PacketType.prepare();
                int index = PacketType.CLIENTBOUND_PLAY_VERSION_MAPPER.getIndex(clientVersion);
                return PACKET_TYPE_ID_MAP.get((byte) index).get(value);
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.SERVER;
            }

            private static void loadPacketIds(Enum<?>[] enums) {
                int value = INDEX;
                int value2 = enums.length;
                for (int index = 0; index < value2; index++) {
                    Enum enumValue;
                    int value3 = (enumValue = ((Enum[]) enums)[index]).ordinal();
                    PacketType.Play.Server server;
                    (server = valueOf(enumValue.name())).ids[value] = value3;
                    PACKET_TYPE_ID_MAP
                            .computeIfAbsent((byte) value, result -> new HashMap<>())
                            .put(value3, server);
                }
                INDEX++;
            }

            public static void load() {
                INDEX = 0;
                loadPacketIds(ClientboundPacketType_1_7_10.values());
                loadPacketIds(ClientboundPacketType_1_8.values());
                loadPacketIds(ClientboundPacketType_1_9.values());
                loadPacketIds(ClientboundPacketType_1_9_3.values());
                loadPacketIds(ClientboundPacketType_1_12.values());
                loadPacketIds(ClientboundPacketType_1_12_1.values());
                loadPacketIds(ClientboundPacketType_1_13.values());
                loadPacketIds(ClientboundPacketType_1_14.values());
                loadPacketIds(ClientboundPacketType_1_14_4.values());
                loadPacketIds(ClientboundPacketType_1_15.values());
                loadPacketIds(ClientboundPacketType_1_15_2.values());
                loadPacketIds(ClientboundPacketType_1_16.values());
                loadPacketIds(ClientboundPacketType_1_16_2.values());
                loadPacketIds(ClientboundPacketType_1_17.values());
                loadPacketIds(ClientboundPacketType_1_18.values());
                loadPacketIds(ClientboundPacketType_1_19.values());
                loadPacketIds(ClientboundPacketType_1_19_1.values());
                loadPacketIds(ClientboundPacketType_1_19_3.values());
                loadPacketIds(ClientboundPacketType_1_19_4.values());
                loadPacketIds(ClientboundPacketType_1_20_2.values());
                loadPacketIds(ClientboundPacketType_1_20_3.values());
                loadPacketIds(ClientboundPacketType_1_20_5.values());
                loadPacketIds(ClientboundPacketType_1_21.values());
                loadPacketIds(ClientboundPacketType_1_21_2.values());
                loadPacketIds(ClientboundPacketType_1_21_5.values());
                loadPacketIds(ClientboundPacketType_1_21_6.values());
                loadPacketIds(ClientboundPacketType_1_21_9.values());
                loadPacketIds(ClientboundPacketType_26_1.values());
                loadPacketIds(ClientboundPacketType_26_3.values());
            }
        }
    }

    public static class Status {

        public enum Client implements PacketTypeConstant, ServerBoundPacket {
            REQUEST(0, WrapperStatusClientRequest.class),
            PING(1, WrapperStatusClientPing.class);

            private final int id;

            private final Class<? extends PacketWrapper<?>> wrapperClass;

            Client(int id, @Nullable Class<? extends PacketWrapper<?>> classValue) {
                this.id = id;
                this.wrapperClass = classValue;
            }

            @Nullable
            public static PacketTypeCommon getById(int value) {
                if (value == 0) {
                    return REQUEST;
                } else {
                    return value == 1 ? PING : null;
                }
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapperClass;
            }

            @Override
            public int getId() {
                return this.id;
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.CLIENT;
            }
        }

        public enum Server implements PacketTypeConstant, ClientBoundPacket {
            RESPONSE(0, WrapperStatusServerResponse.class),
            PONG(1, WrapperStatusServerPong.class);

            private final int id;

            private final Class<? extends PacketWrapper<?>> wrapperClass;

            Server(int id, @Nullable Class<? extends PacketWrapper<?>> classValue) {
                this.id = id;
                this.wrapperClass = classValue;
            }

            @Override
            public Class<? extends PacketWrapper<?>> getWrapperClass() {
                return this.wrapperClass;
            }

            @Nullable
            public static PacketTypeCommon getById(int value) {
                if (value == 0) {
                    return RESPONSE;
                } else {
                    return value == 1 ? PONG : null;
                }
            }

            @Override
            public int getId() {
                return this.id;
            }

            @Override
            public PacketSide getSide() {
                return PacketSide.SERVER;
            }
        }
    }
}
