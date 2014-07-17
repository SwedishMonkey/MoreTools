package com.swedishmonkey.moretools.common;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration config;
    public static boolean enableDirt;
    public static boolean enableEmerald;
    public static boolean enableLapis;
    public static boolean enableRedstone;
    public static boolean enableWool;
    public static boolean enableObsidian;
    public static boolean enableQuartz;
    public static boolean enableLonsdaleite;
    public static boolean enableGlass;
    public static boolean enableCoal;
    public static boolean enableBedrock;
    public static boolean enableFakeBedrock;
    public static boolean overrideBedrock;
    public static int DirtPickaxeID;
    public static int DirtShovelID;
    public static int DirtSwordID;
    public static int DirtAxeID;
    public static int DirtHoeID;
    public static int DirtHelmetID;
    public static int DirtChestplateID;
    public static int DirtLeggingsID;
    public static int DirtBootsID;
    public static int EmeraldPickaxeID;
    public static int EmeraldShovelID;
    public static int EmeraldSwordID;
    public static int EmeraldAxeID;
    public static int EmeraldHoeID;
    public static int EmeraldHelmetID;
    public static int EmeraldChestplateID;
    public static int EmeraldLeggingsID;
    public static int EmeraldBootsID;
    public static int RedstonePickaxeID;
    public static int RedstoneShovelID;
    public static int RedstoneSwordID;
    public static int RedstoneAxeID;
    public static int RedstoneHoeID;
    public static int RedstoneHelmetID;
    public static int RedstoneChestplateID;
    public static int RedstoneLeggingsID;
    public static int RedstoneBootsID;
    public static int GlassPickaxeID;
    public static int GlassShovelID;
    public static int GlassSwordID;
    public static int GlassAxeID;
    public static int GlassHoeID;
    public static int GlassHelmetID;
    public static int GlassChestplateID;
    public static int GlassLeggingsID;
    public static int GlassBootsID;
    public static int RefinedGlassID;
    public static int CompressedGlassID;
    public static int HardenedGlassID;
    public static int LapisPickaxeID;
    public static int LapisShovelID;
    public static int LapisSwordID;
    public static int LapisAxeID;
    public static int LapisHoeID;
    public static int LapisHelmetID;
    public static int LapisChestplateID;
    public static int LapisLeggingsID;
    public static int LapisBootsID;
    public static int ObsidianPickaxeID;
    public static int ObsidianShovelID;
    public static int ObsidianSwordID;
    public static int ObsidianAxeID;
    public static int ObsidianHoeID;
    public static int ObsidianHelmetID;
    public static int ObsidianChestplateID;
    public static int ObsidianLeggingsID;
    public static int ObsidianBootsID;
    public static int ObsidianLumpID;
    public static int CoalPickaxeID;
    public static int CoalShovelID;
    public static int CoalSwordID;
    public static int CoalAxeID;
    public static int CoalHoeID;
    public static int CoalHelmetID;
    public static int CoalChestplateID;
    public static int CoalLeggingsID;
    public static int CoalBootsID;
    public static int WoolPickaxeID;
    public static int WoolShovelID;
    public static int WoolSwordID;
    public static int WoolAxeID;
    public static int WoolHoeID;
    public static int WoolHelmetID;
    public static int WoolChestplateID;
    public static int WoolLeggingsID;
    public static int WoolBootsID;
    public static int RockWoolID;
    public static int LonsdaleitePickaxeID;
    public static int LonsdaleiteShovelID;
    public static int LonsdaleiteSwordID;
    public static int LonsdaleiteAxeID;
    public static int LonsdaleiteHoeID;
    public static int LonsdaleiteHelmetID;
    public static int LonsdaleiteChestplateID;
    public static int LonsdaleiteLeggingsID;
    public static int LonsdaleiteBootsID;
    public static int LonsdaleiteGemID;
    public static int LonsdaleiteOreID;
    public static int LonsdaleiteBlockID;
    public static int BedrockPickaxeID;
    public static int BedrockShovelID;
    public static int BedrockSwordID;
    public static int BedrockAxeID;
    public static int BedrockHoeID;
    public static int BedrockHelmetID;
    public static int BedrockChestplateID;
    public static int BedrockLeggingsID;
    public static int BedrockBootsID;
    public static int BedrockLumpID;
    public static int ArtificialBedrockID;
    public static int DiamondStickID;
    public static int DiamondFurnaceID;
    public static int QuartzPickaxeID;
    public static int QuartzShovelID;
    public static int QuartzSwordID;
    public static int QuartzAxeID;
    public static int QuartzHoeID;
    public static int QuartzHelmetID;
    public static int QuartzChestplateID;
    public static int QuartzLeggingsID;
    public static int QuartzBootsID;
    public static int ToolsPlaceHolderID;
    public static int ArmorPlaceHolderID;
    public static int SmallLonsdaleiteMetoriteID;

    public static void init(File configFile) {
        //Create the configuration object from the given configuration file
        if (config == null) {
            config = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        enableDirt = config.get(Configuration.CATEGORY_GENERAL, "enableDirt", true, "Enable/Disable Dirt tools and armor")
                .getBoolean(true);
        enableEmerald = config.get(Configuration.CATEGORY_GENERAL, "enableEmerald", true, "Enable/Disable Emerald tools and armor")
                .getBoolean(true);
        enableRedstone = config.get(Configuration.CATEGORY_GENERAL, "enableRedstone", true, "Enable/Disable Redstone tools and armor")
                .getBoolean(true);
        enableGlass = config.get(Configuration.CATEGORY_GENERAL, "enableGlass", true, "Enable/Disable Glass tools and armor")
                .getBoolean(true);
        enableLapis = config.get(Configuration.CATEGORY_GENERAL, "enableLapis", true, "Enable/Disable Lapis tools and armor")
                .getBoolean(true);
        enableObsidian = config.get(Configuration.CATEGORY_GENERAL, "enableObsidian", true, "Enable/Disable Obsidian tools and armor")
                .getBoolean(true);
        enableCoal = config.get(Configuration.CATEGORY_GENERAL, "enableCoal", true, "Enable/Disable Coal tools and armor")
                .getBoolean(true);
        enableWool = config.get(Configuration.CATEGORY_GENERAL, "enableWool", true, "Enable/Disable Wool tools and armor")
                .getBoolean(true);
        enableLonsdaleite = config.get(Configuration.CATEGORY_GENERAL, "enableLonsdaleite",
                true, "Enable/Disable Lonsdaleite tools and armor").getBoolean(true);
        enableBedrock = config.get(Configuration.CATEGORY_GENERAL, "enableBedrock", true, "Enable/Disable Bedrock tools and armor")
                .getBoolean(true);
        enableQuartz = config.get(Configuration.CATEGORY_GENERAL, "enableQuartz", true, "Enable/Disable Quartz tools and armor")
                .getBoolean(true);
        enableFakeBedrock = config.get(Configuration.CATEGORY_GENERAL, "enableFakeBedrock",
                false, "Enables/Disables Artificial bedrock").getBoolean(false);
        overrideBedrock = config.get(Configuration.CATEGORY_GENERAL, "overrideBedrock", true, "Overrides the vanilla bedrock").getBoolean(true);

        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(MoreTools.ID)) {
            loadConfiguration();
        }
    }
}
