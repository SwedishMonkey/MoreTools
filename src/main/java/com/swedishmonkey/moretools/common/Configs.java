package com.swedishmonkey.moretools.common;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class Configs {

    public static boolean enableDirt;
    public static boolean enableEmerald;
    public static boolean enableRedstone;
    public static boolean enableGlass;
    public static boolean enableLapis;
    public static boolean enableObsidian;
    public static boolean enableCoal;
    public static boolean enableWool;
    public static boolean enableLonsdaleite;
    public static boolean enableBedrock;
    public static boolean enableQuartz;
    public static boolean enableFakeBedrock;
    public static boolean overrideBedrock;
    public static int DirtPickaxeID;
    public static int DirtSwordID;
    public static int DirtShovelID;
    public static int DirtAxeID;
    public static int DirtHoeID;
    public static int DirtHelmetID;
    public static int DirtChestplateID;
    public static int DirtLeggingsID;
    public static int DirtBootsID;
    public static int EmeraldPickaxeID;
    public static int EmeraldSwordID;
    public static int EmeraldShovelID;
    public static int EmeraldAxeID;
    public static int EmeraldHoeID;
    public static int EmeraldHelmetID;
    public static int EmeraldChestplateID;
    public static int EmeraldLeggingsID;
    public static int EmeraldBootsID;
    public static int RedstonePickaxeID;
    public static int RedstoneSwordID;
    public static int RedstoneShovelID;
    public static int RedstoneAxeID;
    public static int RedstoneHoeID;
    public static int RedstoneHelmetID;
    public static int RedstoneChestplateID;
    public static int RedstoneLeggingsID;
    public static int RedstoneBootsID;
    public static int GlassPickaxeID;
    public static int GlassSwordID;
    public static int GlassShovelID;
    public static int GlassAxeID;
    public static int GlassHoeID;
    public static int GlassHelmetID;
    public static int GlassChestplateID;
    public static int GlassLeggingsID;
    public static int GlassBootsID;
    public static int CompressedGlassID;
    public static int RefinedGlassID;
    public static int HardenedGlassID;
    public static int LapisPickaxeID;
    public static int LapisSwordID;
    public static int LapisShovelID;
    public static int LapisAxeID;
    public static int LapisHoeID;
    public static int LapisHelmetID;
    public static int LapisChestplateID;
    public static int LapisLeggingsID;
    public static int LapisBootsID;
    public static int ObsidianPickaxeID;
    public static int ObsidianSwordID;
    public static int ObsidianShovelID;
    public static int ObsidianAxeID;
    public static int ObsidianHoeID;
    public static int ObsidianHelmetID;
    public static int ObsidianChestplateID;
    public static int ObsidianLeggingsID;
    public static int ObsidianBootsID;
    public static int CoalPickaxeID;
    public static int CoalSwordID;
    public static int CoalShovelID;
    public static int CoalAxeID;
    public static int CoalHoeID;
    public static int CoalHelmetID;
    public static int CoalChestplateID;
    public static int CoalLeggingsID;
    public static int CoalBootsID;
    public static int WoolPickaxeID;
    public static int WoolSwordID;
    public static int WoolShovelID;
    public static int WoolAxeID;
    public static int WoolHoeID;
    public static int WoolHelmetID;
    public static int WoolChestplateID;
    public static int WoolLeggingsID;
    public static int WoolBootsID;
    public static int RockWoolID;
    public static int LonsdaleitePickaxeID;
    public static int LonsdaleiteSwordID;
    public static int LonsdaleiteShovelID;
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
    public static int BedrockSwordID;
    public static int BedrockShovelID;
    public static int BedrockAxeID;
    public static int BedrockHoeID;
    public static int BedrockHelmetID;
    public static int BedrockChestplateID;
    public static int BedrockLeggingsID;
    public static int BedrockBootsID;
    public static int BedrockLumpID;
    public static int ObsidianLumpID;
    public static int ArtificialBedrockID;
    public static int DiamondStickID;
    public static int QuartzPickaxeID;
    public static int QuartzSwordID;
    public static int QuartzShovelID;
    public static int QuartzAxeID;
    public static int QuartzHoeID;
    public static int QuartzHelmetID;
    public static int QuartzChestplateID;
    public static int QuartzLeggingsID;
    public static int QuartzBootsID;
    public static int ArmorPlaceHolderID;
    public static int ToolsPlaceHolderID;
    public static int DiamondFurnaceID;

    public static void Init(File configFile) {
        Configuration config = new Configuration(configFile);

        try {
            config.load();

            boolean enableDirt = config.get("Enable/Disable", "enableDirt", true, "Enable/Disable Dirt tools and armor")
                    .getBoolean(true);
            boolean enableEmerald = config.get("Enable/Disable", "enableEmerald", true, "Enable/Disable Emerald tools and armor")
                    .getBoolean(true);
            boolean enableRedstone = config.get("Enable/Disable", "enableRedstone", true, "Enable/Disable Redstone tools and armor")
                    .getBoolean(true);
            boolean enableGlass = config.get("Enable/Disable", "enableGlass", true, "Enable/Disable Glass tools and armor")
                    .getBoolean(true);
            boolean enableLapis = config.get("Enable/Disable", "enableLapis", true, "Enable/Disable Lapis tools and armor")
                    .getBoolean(true);
            boolean enableObsidian = config.get("Enable/Disable", "enableObsidian", true, "Enable/Disable Obsidian tools and armor")
                    .getBoolean(true);
            boolean enableCoal = config.get("Enable/Disable", "enableCoal", true, "Enable/Disable Coal tools and armor")
                    .getBoolean(true);
            boolean enableWool = config.get("Enable/Disable", "enableWool", true, "Enable/Disable Wool tools and armor")
                    .getBoolean(true);
            boolean enableLonsdaleite = config.get("Enable/Disable", "enableLonsdaleite",
                    true, "Enable/Disable Lonsdaleite tools and armor").getBoolean(true);
            boolean enableBedrock = config.get("Enable/Disable", "enableBedrock", true, "Enable/Disable Bedrock tools and armor")
                    .getBoolean(true);
            boolean enableQuartz = config.get("Enable/Disable", "enableQuartz", true, "Enable/Disable Quartz tools and armor")
                    .getBoolean(true);
            boolean enableFakeBedrock = config.get("Enable/Disable", "enableFakeBedrock",
                    false, "Enables/Disables Artificial bedrock").getBoolean(false);
            boolean overrideBedrock = config.get("Enable/Disable", "overrideBedrock", false, "Overrides the vanilla bedrock").getBoolean(true);

            int DirtPickaxeID = config.get("Items", "DirtPickaxe",
                    "MoreTools:DirtPickaxe").getInt();
            int DirtSwordID = config.get("Items", "DirtPickaxe", "MoreTools:DirtSword")
                    .getInt();
            int DirtShovelID = config
                    .get("Items", "DirtShovel", "MoreTools:DirtShovel").getInt();
            int DirtAxeID = config.get("Items", "DirtAxe", "MoreTools:DirtAxe")
                    .getInt();
            int DirtHoeID = config.get("Items", "DirtHoe", "MoreTools:DirtHoe")
                    .getInt();
            int DirtHelmetID = config
                    .get("Armor", "DirtHelmet", "MoreTools:DirtHelmet").getInt();
            int DirtChestplateID = config.get("Armor", "DirtChestplate",
                    "MoreTools:DirtChestplate").getInt();
            int DirtLeggingsID = config.get("Armor", "DirtLeggings",
                    "MoreTools:DirtLeggings").getInt();
            int DirtBootsID = config.get("Armor", "DirtBoots", "MoreTools:DirtBoots")
                    .getInt();

            int EmeraldPickaxeID = config.get("Items", "EmeraldPickaxe",
                    "MoreTools:EmeraldPickaxe").getInt();
            int EmeraldSwordID = config.get("Items", "EmeraldPickaxe",
                    "MoreTools:EmeraldSword").getInt();
            int EmeraldShovelID = config.get("Items", "EmeraldShovel",
                    "MoreTools:EmeraldShovel").getInt();
            int EmeraldAxeID = config
                    .get("Items", "EmeraldAxe", "MoreTools:EmeraldAxe").getInt();
            int EmeraldHoeID = config
                    .get("Items", "EmeraldHoe", "MoreTools:EmeraldHoe").getInt();
            int EmeraldHelmetID = config.get("Armor", "EmeraldHelmet",
                    "MoreTools:EmeraldHelmet").getInt();
            int EmeraldChestplateID = config.get("Armor", "EmeraldChestplate",
                    "MoreTools:EmeraldChestplate").getInt();
            int EmeraldLeggingsID = config.get("Armor", "EmeraldLeggings",
                    "MoreTools:EmeraldLeggings").getInt();
            int EmeraldBootsID = config.get("Armor", "EmeraldBoots",
                    "MoreTools:EmeraldBoots").getInt();

            int RedstonePickaxeID = config.get("Items", "RedstonePickaxe",
                    "MoreTools:RedstonePickaxe").getInt();
            int RedstoneSwordID = config.get("Items", "RedstonePickaxe",
                    "MoreTools:RedstoneSword").getInt();
            int RedstoneShovelID = config.get("Items", "RedstoneShovel",
                    "MoreTools:RedstoneShovel").getInt();
            int RedstoneAxeID = config.get("Items", "RedstoneAxe",
                    "MoreTools:RedstoneAxe").getInt();
            int RedstoneHoeID = config.get("Items", "RedstoneHoe",
                    "MoreTools:RedstoneHoe").getInt();
            int RedstoneHelmetID = config.get("Armor", "RedstoneHelmet",
                    "MoreTools:RedstoneHelmet").getInt();
            int RedstoneChestplateID = config.get("Armor", "RedstoneChestplate",
                    "MoreTools:RedstoneChestplate").getInt();
            int RedstoneLeggingsID = config.get("Armor", "RedstoneLeggings",
                    "MoreTools:RedstoneLeggings").getInt();
            int RedstoneBootsID = config.get("Armor", "RedstoneBoots",
                    "MoreTools:RedstoneBoots").getInt();

            int GlassPickaxeID = config.get("Items", "GlassPickaxe",
                    "MoreTools:GlassPickaxe").getInt();
            int GlassSwordID = config.get("Items", "GlassPickaxe",
                    "MoreTools:GlassSword").getInt();
            int GlassShovelID = config.get("Items", "GlassShovel",
                    "MoreTools:GlassShovel").getInt();
            int GlassAxeID = config.get("Items", "GlassAxe", "MoreTools:GlassAxe")
                    .getInt();
            int GlassHoeID = config.get("Items", "GlassHoe", "MoreTools:GlassHoe")
                    .getInt();
            int GlassHelmetID = config.get("Armor", "GlassHelmet",
                    "MoreTools:GlassHelmet").getInt();
            int GlassChestplateID = config.get("Armor", "GlassChestplate",
                    "MoreTools:GlassChestplate").getInt();
            int GlassLeggingsID = config.get("Armor", "GlassLeggings",
                    "MoreTools:GlassLeggings").getInt();
            int GlassBootsID = config
                    .get("Armor", "GlassBoots", "MoreTools:GlassBoots").getInt();
            int RefinedGlassID = config.get("Blocks", "RefinedGlass",
                    "MoreTools:RefinedGlass").getInt();
            int CompressedGlassID = config.get("Blocks", "CompressedGlass",
                    "MoreTools:CompressedGlass").getInt();
            int HardenedGlassID = config.get("Blocks", "HardenedGlass",
                    "MoreTools:HardenedGlass").getInt();

            int LapisPickaxeID = config.get("Items", "LapisPickaxe",
                    "MoreTools:LapisPickaxe").getInt();
            int LapisSwordID = config.get("Items", "LapisPickaxe",
                    "MoreTools:LapisSword").getInt();
            int LapisShovelID = config.get("Items", "LapisShovel",
                    "MoreTools:LapisShovel").getInt();
            int LapisAxeID = config.get("Items", "LapisAxe", "MoreTools:LapisAxe")
                    .getInt();
            int LapisHoeID = config.get("Items", "LapisHoe", "MoreTools:LapisHoe")
                    .getInt();
            int LapisHelmetID = config.get("Armor", "LapisHelmet",
                    "MoreTools:LapisHelmet").getInt();
            int LapisChestplateID = config.get("Armor", "LapisChestplate",
                    "MoreTools:LapisChestplate").getInt();
            int LapisLeggingsID = config.get("Armor", "LapisLeggings",
                    "MoreTools:LapisLeggings").getInt();
            int LapisBootsID = config
                    .get("Armor", "LapisBoots", "MoreTools:LapisBoots").getInt();

            int ObsidianPickaxeID = config.get("Items", "ObsidianPickaxe",
                    "MoreTools:ObsidianPickaxe").getInt();
            int ObsidianSwordID = config.get("Items", "ObsidianPickaxe",
                    "MoreTools:ObsidianSword").getInt();
            int ObsidianShovelID = config.get("Items", "ObsidianShovel",
                    "MoreTools:ObsidianShovel").getInt();
            int ObsidianAxeID = config.get("Items", "ObsidianAxe",
                    "MoreTools:ObsidianAxe").getInt();
            int ObsidianHoeID = config.get("Items", "ObsidianHoe",
                    "MoreTools:ObsidianHoe").getInt();
            int ObsidianHelmetID = config.get("Armor", "ObsidianHelmet",
                    "MoreTools:ObsidianHelmet").getInt();
            int ObsidianChestplateID = config.get("Armor", "ObsidianChestplate",
                    "MoreTools:ObsidianChestplate").getInt();
            int ObsidianLeggingsID = config.get("Armor", "ObsidianLeggings",
                    "MoreTools:ObsidianLeggings").getInt();
            int ObsidianBootsID = config.get("Armor", "ObsidianBoots",
                    "MoreTools:ObsidianBoots").getInt();

            int CoalPickaxeID = config.get("Items", "CoalPickaxe",
                    "MoreTools:CoalPickaxe").getInt();
            int CoalSwordID = config.get("Items", "CoalPickaxe", "MoreTools:CoalSword")
                    .getInt();
            int CoalShovelID = config
                    .get("Items", "CoalShovel", "MoreTools:CoalShovel").getInt();
            int CoalAxeID = config.get("Items", "CoalAxe", "MoreTools:CoalAxe")
                    .getInt();
            int CoalHoeID = config.get("Items", "CoalHoe", "MoreTools:CoalHoe")
                    .getInt();
            int CoalHelmetID = config
                    .get("Armor", "CoalHelmet", "MoreTools:CoalHelmet").getInt();
            int CoalChestplateID = config.get("Armor", "CoalChestplate",
                    "MoreTools:CoalChestplate").getInt();
            int CoalLeggingsID = config.get("Armor", "CoalLeggings",
                    "MoreTools:CoalLeggings").getInt();
            int CoalBootsID = config.get("Armor", "CoalBoots", "MoreTools:CoalBoots")
                    .getInt();

            int WoolPickaxeID = config.get("Items", "WoolPickaxe",
                    "MoreTools:WoolPickaxe").getInt();
            int WoolSwordID = config.get("Items", "WoolPickaxe", "MoreTools:WoolSword")
                    .getInt();
            int WoolShovelID = config
                    .get("Items", "WoolShovel", "MoreTools:WoolShovel").getInt();
            int WoolAxeID = config.get("Items", "WoolAxe", "MoreTools:WoolAxe")
                    .getInt();
            int WoolHoeID = config.get("Items", "WoolHoe", "MoreTools:WoolHoe")
                    .getInt();
            int WoolHelmetID = config
                    .get("Armor", "WoolHelmet", "MoreTools:WoolHelmet").getInt();
            int WoolChestplateID = config.get("Armor", "WoolChestplate",
                    "MoreTools:WoolChestplate").getInt();
            int WoolLeggingsID = config.get("Armor", "WoolLeggings",
                    "MoreTools:WoolLeggings").getInt();
            int WoolBootsID = config.get("Armor", "WoolBoots", "MoreTools:WoolBoots")
                    .getInt();
            int RockWoolID = config.get("Blocks", "RockWool", "MoreTools:RockWool")
                    .getInt();

            int LonsdaleitePickaxeID = config.get("Items", "LonsdaleitePickaxe",
                    "MoreTools:LonsdaleitePickaxe").getInt();
            int LonsdaleiteSwordID = config.get("Items", "LonsdaleitePickaxe",
                    "MoreTools:LonsdaleiteSword").getInt();
            int LonsdaleiteShovelID = config.get("Items", "LonsdaleiteShovel",
                    "MoreTools:LonsdaleiteShovel").getInt();
            int LonsdaleiteAxeID = config.get("Items", "LonsdaleiteAxe",
                    "MoreTools:LonsdaleiteAxe").getInt();
            int LonsdaleiteHoeID = config.get("Items", "LonsdaleiteHoe",
                    "MoreTools:LonsdaleiteHoe").getInt();
            int LonsdaleiteHelmetID = config.get("Armor", "LonsdaleiteHelmet",
                    "MoreTools:LonsdaleiteHelmet").getInt();
            int LonsdaleiteChestplateID = config.get("Armor", "LonsdaleiteChestplate",
                    "MoreTools:LonsdaleiteChestplate").getInt();
            int LonsdaleiteLeggingsID = config.get("Armor", "LonsdaleiteLeggings",
                    "MoreTools:LonsdaleiteLeggings").getInt();
            int LonsdaleiteBootsID = config.get("Armor", "LonsdaleiteBoots",
                    "MoreTools:LonsdaleiteBoots").getInt();
            int LonsdaleiteGemID = config.get("Items", "LonsdaleiteGem",
                    "MoreTools:LonsdaleiteGem").getInt();
            int LonsdaleiteOreID = config.get("Blocks", "LonsdaleiteOre",
                    "MoreTools:LonsdaleiteOre").getInt();
            int LonsdaleiteBlockID = config.get("Blocks", "LonsdaleiteBlock",
                    "MoreTools:LonsdaleiteBlock").getInt();

            int BedrockPickaxeID = config.get("Items", "BedrockPickaxe",
                    "MoreTools:BedrockPickaxe").getInt();
            int BedrockSwordID = config.get("Items", "BedrockPickaxe",
                    "MoreTools:BedrockSword").getInt();
            int BedrockShovelID = config.get("Items", "BedrockShovel",
                    "MoreTools:BedrockShovel").getInt();
            int BedrockAxeID = config
                    .get("Items", "BedrockAxe", "MoreTools:BedrockAxe").getInt();
            int BedrockHoeID = config
                    .get("Items", "BedrockHoe", "MoreTools:BedrockHoe").getInt();
            int BedrockHelmetID = config.get("Armor", "BedrockHelmet",
                    "MoreTools:BedrockHelmet").getInt();
            int BedrockChestplateID = config.get("Armor", "BedrockChestplate",
                    "MoreTools:BedrockChestplate").getInt();
            int BedrockLeggingsID = config.get("Armor", "BedrockLeggings",
                    "MoreTools:BedrockLeggings").getInt();
            int BedrockBootsID = config.get("Armor", "BedrockBoots",
                    "MoreTools:BedrockBoots").getInt();
            int BedrockLumpID = config.get("Items", "BedrockLump",
                    "MoreTools:BedrockLump").getInt();
            int ObsidianLumpID = config.get("Items", "ObsidianLump",
                    "MoreTools:ObsidianLump").getInt();
            int ArtificialBedrockID = config.get("Blocks", "ArtificialBedrock",
                    "MoreTools:ArtificialBedrock").getInt();
            int DiamondStickID = config.get("Items", "DiamondStick",
                    "MoreTools:DiamondStick").getInt();

            int QuartzPickaxeID = config.get("Items", "QuartzPickaxe",
                    "MoreTools:QuartzPickaxe").getInt();
            int QuartzSwordID = config.get("Items", "QuartzPickaxe",
                    "MoreTools:QuartzSword").getInt();
            int QuartzShovelID = config.get("Items", "QuartzShovel",
                    "MoreTools:QuartzShovel").getInt();
            int QuartzAxeID = config.get("Items", "QuartzAxe", "MoreTools:QuartzAxe")
                    .getInt();
            int QuartzHoeID = config.get("Items", "QuartzHoe", "MoreTools:QuartzHoe")
                    .getInt();
            int QuartzHelmetID = config.get("Armor", "QuartzHelmet",
                    "MoreTools:QuartzHelmet").getInt();
            int QuartzChestplateID = config.get("Armor", "QuartzChestplate",
                    "MoreTools:QuartzChestplate").getInt();
            int QuartzLeggingsID = config.get("Armor", "QuartzLeggings",
                    "MoreTools:QuartzLeggings").getInt();
            int QuartzBootsID = config.get("Armor", "QuartzBoots",
                    "MoreTools:QuartzBoots").getInt();

            int ArmorPlaceHolderID = config.get("CreativeTabs", "ArmorPlaceHolder",
                    "MoreTools:ArmorPlaceHolder").getInt();
            int ToolsPlaceHolderID = config.get("CreativeTabs", "ToolsPlaceHolder",
                    "MoreTools:ToolsPlaceHolder").getInt();

            int DiamondFurnaceID = config.get("Blocks", "DiamondFurnace", "MoreTools:DiamondFurnace").getInt();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            config.save();
        }
    }
}
