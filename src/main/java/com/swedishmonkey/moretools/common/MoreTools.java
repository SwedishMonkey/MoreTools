package com.swedishmonkey.moretools.common;

import com.swedishmonkey.moretools.armor.*;
import com.swedishmonkey.moretools.axe.*;
import com.swedishmonkey.moretools.block.*;
import com.swedishmonkey.moretools.block.tileentity.DiamondFurnaceTileEntity;
import com.swedishmonkey.moretools.block.tileentity.TileEntitySmallLonsdaleiteMetorite;
import com.swedishmonkey.moretools.block.worldgen.BedrockWG;
import com.swedishmonkey.moretools.block.worldgen.SmallLonsdaleiteMetoriteWG;
import com.swedishmonkey.moretools.creativeTabs.TabArmor;
import com.swedishmonkey.moretools.creativeTabs.TabArmorPlaceHolder;
import com.swedishmonkey.moretools.creativeTabs.TabTools;
import com.swedishmonkey.moretools.creativeTabs.TabToolsPlaceHolder;
import com.swedishmonkey.moretools.entity.EntitySmallLonsdaleiteMetorite;
import com.swedishmonkey.moretools.gui.DiamondFurnaceGuiHandler;
import com.swedishmonkey.moretools.hoe.*;
import com.swedishmonkey.moretools.item.BedrockLump;
import com.swedishmonkey.moretools.item.DiamondStick;
import com.swedishmonkey.moretools.item.LonsdaleiteGem;
import com.swedishmonkey.moretools.item.ObsidianLump;
import com.swedishmonkey.moretools.pickaxe.*;
import com.swedishmonkey.moretools.shovel.*;
import com.swedishmonkey.moretools.sword.*;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.logging.Logger;

@Mod(modid = MoreTools.ID, name = MoreTools.NAME, version = MoreTools.VERSION, guiFactory = MoreTools.GUI_FACTORY_CLASS)
public class MoreTools<FMLInitialization> {
    public static final String ID = "MoreTools";
    public static final String NAME = "MoreTools";
    public static final String VERSION = "1.7.2-2.0.0";
    public static final String GUI_FACTORY_CLASS = "com.swedishmonkey.moretools.gui.GuiFactory";

    public static Logger logger;

    @Instance(MoreTools.ID)
    public static MoreTools instance;

    @SidedProxy(clientSide = "com.swedishmonkey.moretools.common.ClientProxy", serverSide = "com.swedishmonkey.moretools.common.ClientProxy")

    public static CommonProxy proxy;

    public static ToolMaterial toolDirt = EnumHelper.addToolMaterial("dirt", 0,
            20, 2.0F, 0.0F, 5);
    public static ToolMaterial toolEmerald = EnumHelper.addToolMaterial(
            "emerald", 4, 1800, 8.0F, 4.0F, 22);
    public static ToolMaterial toolRedstone = EnumHelper.addToolMaterial(
            "redstone", 2, 200, 15.0F, 2.0F, 15);
    public static ToolMaterial toolGlass = EnumHelper.addToolMaterial("glass",
            2, 200, 5.0F, 2.0F, 10);
    public static ToolMaterial toolLapis = EnumHelper.addToolMaterial("lapis",
            2, 600, 7.0F, 3.0F, 30);
    public static ToolMaterial toolObsidian = EnumHelper.addToolMaterial(
            "obsidian", 3, 1000, 5.0F, 2.0F, 10);
    public static ToolMaterial toolCoal = EnumHelper.addToolMaterial("coal", 1,
            150, 4.0F, 2.0F, 10);
    public static ToolMaterial toolWool = EnumHelper.addToolMaterial("wool", 1,
            100, 4.0F, 2.0F, 15);
    public static ToolMaterial toolLonsdaleite = EnumHelper.addToolMaterial(
            "lonsdaleite", 10, 5000, 6.0F, 5.0F, 30);
    public static ToolMaterial toolBedrock = EnumHelper.addToolMaterial(
            "bedrock", 12, 5000, 10.0F, 7.0F, 40);
    public static ToolMaterial toolQuartz = EnumHelper.addToolMaterial(
            "quartz", 2, 600, 5.0F, 4.0F, 20);
    public static ArmorMaterial armorDirt = EnumHelper.addArmorMaterial("dirt",
            20, new int[]{1, 2, 2, 1}, 5);
    public static ArmorMaterial armorGlass = EnumHelper.addArmorMaterial(
            "glass", 200, new int[]{3, 4, 4, 3}, 10);
    public static ArmorMaterial armorRedstone = EnumHelper.addArmorMaterial(
            "redstone", 200, new int[]{4, 5, 5, 4}, 15);
    public static ArmorMaterial armorLapis = EnumHelper.addArmorMaterial(
            "lapis", 600, new int[]{4, 5, 5, 4}, 30);
    public static ArmorMaterial armorEmerald = EnumHelper.addArmorMaterial(
            "emerald", 1800, new int[]{4, 6, 6, 4}, 22);
    public static ArmorMaterial armorObsidian = EnumHelper.addArmorMaterial(
            "obsidian", 1000, new int[]{4, 6, 6, 4}, 10);
    public static ArmorMaterial armorCoal = EnumHelper.addArmorMaterial("coal",
            150, new int[]{3, 4, 4, 3}, 10);
    public static ArmorMaterial armorWool = EnumHelper.addArmorMaterial("wool",
            100, new int[]{3, 4, 4, 3}, 15);
    public static ArmorMaterial armorLonsdaleite = EnumHelper.addArmorMaterial(
            "lonsdaleite", 5000, new int[]{5, 7, 7, 5}, 30);
    public static ArmorMaterial armorBedrock = EnumHelper.addArmorMaterial(
            "bedrock", 10000, new int[]{6, 8, 8, 6}, 40);
    public static ArmorMaterial armorQuartz = EnumHelper.addArmorMaterial(
            "quartz", 600, new int[]{4, 5, 5, 4}, 40);
    public static CreativeTabs tabTools = new TabTools(
            CreativeTabs.getNextID(), "Tools");
    public static CreativeTabs tabArmor = new TabArmor(
            CreativeTabs.getNextID(), "Armor");
    public static Item TabToolsPlaceHolder = new TabToolsPlaceHolder(
            ConfigurationHandler.ToolsPlaceHolderID)
            .setUnlocalizedName("TabToolsPlaceHolder").setTextureName(
                    "MoreTools:BedrockPickaxe");
    public static Item TabArmorPlaceHolder = new TabArmorPlaceHolder(
            ConfigurationHandler.ArmorPlaceHolderID)
            .setUnlocalizedName("TabArmorPlaceHolder").setTextureName(
                    "MoreTools:BedrockChestplate");
    public static SmallLonsdaleiteMetoriteWG LonsdaleiteWG = new SmallLonsdaleiteMetoriteWG();
    public static BedrockWG BedrockWG = new BedrockWG();
    public static Item DirtPickaxe = new DirtPickaxe(ConfigurationHandler.DirtPickaxeID,
            toolDirt).setUnlocalizedName("DirtPickaxe").setTextureName(
            "MoreTools:DirtPickaxe");
    public static Item DirtSword = new DirtSword(ConfigurationHandler.DirtSwordID, toolDirt)
            .setUnlocalizedName("DirtSword").setTextureName(
                    "MoreTools:DirtSword");
    public static Item DirtShovel = new DirtShovel(ConfigurationHandler.DirtShovelID,
            toolDirt).setUnlocalizedName("DirtShovel").setTextureName(
            "MoreTools:DirtShovel");
    public static Item DirtAxe = new DirtAxe(ConfigurationHandler.DirtAxeID, toolDirt)
            .setUnlocalizedName("DirtAxe").setTextureName("MoreTools:DirtAxe");
    public static Item DirtHoe = new DirtHoe(ConfigurationHandler.DirtHoeID, toolDirt)
            .setUnlocalizedName("DirtHoe").setTextureName("MoreTools:DirtHoe");
    public static Item EmeraldPickaxe = new EmeraldPickaxe(
            ConfigurationHandler.EmeraldPickaxeID, toolEmerald).setUnlocalizedName(
            "EmeraldPickaxe").setTextureName("MoreTools:EmeraldPickaxe");
    public static Item EmeraldSword = new EmeraldSword(ConfigurationHandler.EmeraldSwordID,
            toolEmerald).setUnlocalizedName("EmeraldSword").setTextureName(
            "MoreTools:EmeraldSword");
    public static Item EmeraldShovel = new EmeraldShovel(
            ConfigurationHandler.EmeraldShovelID, toolEmerald).setUnlocalizedName(
            "EmeraldShovel").setTextureName("MoreTools:EmeraldShovel");
    public static Item EmeraldAxe = new EmeraldAxe(ConfigurationHandler.EmeraldAxeID,
            toolEmerald).setUnlocalizedName("EmeraldAxe").setTextureName(
            "MoreTools:EmeraldAxe");
    public static Item EmeraldHoe = new EmeraldHoe(ConfigurationHandler.EmeraldHoeID,
            toolEmerald).setUnlocalizedName("EmeraldHoe").setTextureName(
            "MoreTools:EmeraldHoe");
    public static Item RedstonePickaxe = new RedstonePickaxe(
            ConfigurationHandler.RedstonePickaxeID, toolRedstone).setUnlocalizedName(
            "RedstonePickaxe").setTextureName("MoreTools:RedstonePickaxe");
    public static Item RedstoneSword = new RedstoneSword(
            ConfigurationHandler.RedstoneSwordID, toolRedstone).setUnlocalizedName(
            "RedstoneSword").setTextureName("MoreTools:RedstoneSword");
    public static Item RedstoneShovel = new RedstoneShovel(
            ConfigurationHandler.RedstoneShovelID, toolRedstone).setUnlocalizedName(
            "RedstoneShovel").setTextureName("MoreTools:RedstoneShovel");
    public static Item RedstoneAxe = new RedstoneAxe(ConfigurationHandler.RedstoneAxeID,
            toolRedstone).setUnlocalizedName("RedstoneAxe").setTextureName(
            "MoreTools:RedstoneAxe");
    public static Item RedstoneHoe = new RedstoneHoe(ConfigurationHandler.RedstoneHoeID,
            toolRedstone).setUnlocalizedName("RedstoneHoe").setTextureName(
            "MoreTools:RedstoneHoe");
    public static Item GlassPickaxe = new GlassPickaxe(ConfigurationHandler.GlassPickaxeID,
            toolGlass).setUnlocalizedName("GlassPickaxe").setTextureName(
            "MoreTools:GlassPickaxe");
    public static Item GlassSword = new GlassSword(ConfigurationHandler.GlassSwordID,
            toolGlass).setUnlocalizedName("GlassSword").setTextureName(
            "MoreTools:GlassSword");
    public static Item GlassShovel = new GlassShovel(ConfigurationHandler.GlassShovelID,
            toolGlass).setUnlocalizedName("GlassShovel").setTextureName(
            "MoreTools:GlassShovel");
    public static Item GlassAxe = new GlassAxe(ConfigurationHandler.GlassAxeID, toolGlass)
            .setUnlocalizedName("GlassAxe")
            .setTextureName("MoreTools:GlassAxe");
    public static Item GlassHoe = new GlassHoe(ConfigurationHandler.GlassHoeID, toolGlass)
            .setUnlocalizedName("GlassHoe")
            .setTextureName("MoreTools:GlassHoe");
    public static Block CompressedGlass = new CompressedGlass(
            ConfigurationHandler.CompressedGlassID, Material.glass).setBlockName(
            "CompressedGlass").setBlockTextureName("MoreTools:CompressedGlass");
    public static Block HardenedGlass = new HardenedGlass(
            ConfigurationHandler.HardenedGlassID, Material.glass).setBlockName(
            "HardenedGlass").setBlockTextureName("MoreTools:HardenedGlass");
    public static Block RefinedGlass = new RefinedGlass(ConfigurationHandler.RefinedGlassID,
            Material.glass).setBlockName("RefinedGlass").setBlockTextureName(
            "MoreTools:RefinedGlass");
    public static Item LapisPickaxe = new LapisPickaxe(ConfigurationHandler.LapisPickaxeID,
            toolLapis).setUnlocalizedName("LapisPickaxe").setTextureName(
            "MoreTools:LapisPickaxe");
    public static Item LapisSword = new LapisSword(ConfigurationHandler.LapisSwordID,
            toolLapis).setUnlocalizedName("LapisSword").setTextureName(
            "MoreTools:LapisSword");
    public static Item LapisShovel = new LapisShovel(ConfigurationHandler.LapisShovelID,
            toolLapis).setUnlocalizedName("LapisShovel").setTextureName(
            "MoreTools:LapisShovel");
    public static Item LapisAxe = new LapisAxe(ConfigurationHandler.LapisAxeID, toolLapis)
            .setUnlocalizedName("LapisAxe")
            .setTextureName("MoreTools:LapisAxe");
    public static Item LapisHoe = new LapisHoe(ConfigurationHandler.LapisHoeID, toolLapis)
            .setUnlocalizedName("LapisHoe")
            .setTextureName("MoreTools:LapisHoe");
    public static Item ObsidianPickaxe = new ObsidianPickaxe(
            ConfigurationHandler.ObsidianPickaxeID, toolObsidian).setUnlocalizedName(
            "ObsidianPickaxe").setTextureName("MoreTools:ObsidianPickaxe");
    public static Item ObsidianSword = new ObsidianSword(
            ConfigurationHandler.ObsidianSwordID, toolObsidian).setUnlocalizedName(
            "ObsidianSword").setTextureName("MoreTools:ObsidianSword");
    public static Item ObsidianShovel = new ObsidianShovel(
            ConfigurationHandler.ObsidianShovelID, toolObsidian).setUnlocalizedName(
            "ObsidianShovel").setTextureName("MoreTools:ObsidianShovel");
    public static Item ObsidianAxe = new ObsidianAxe(ConfigurationHandler.ObsidianAxeID,
            toolObsidian).setUnlocalizedName("ObsidianAxe").setTextureName(
            "MoreTools:ObsidianAxe");
    public static Item ObsidianHoe = new ObsidianHoe(ConfigurationHandler.ObsidianHoeID,
            toolObsidian).setUnlocalizedName("ObsidianHoe").setTextureName(
            "MoreTools:ObsidianHoe");
    public static Item CoalPickaxe = new CoalPickaxe(ConfigurationHandler.CoalPickaxeID,
            toolCoal).setUnlocalizedName("CoalPickaxe").setTextureName(
            "MoreTools:CoalPickaxe");
    public static Item CoalSword = new CoalSword(ConfigurationHandler.CoalSwordID, toolCoal)
            .setUnlocalizedName("CoalSword").setTextureName(
                    "MoreTools:CoalSword");
    public static Item CoalShovel = new CoalShovel(ConfigurationHandler.CoalShovelID,
            toolCoal).setUnlocalizedName("CoalShovel").setTextureName(
            "MoreTools:CoalShovel");
    public static Item CoalAxe = new CoalAxe(ConfigurationHandler.CoalAxeID, toolCoal)
            .setUnlocalizedName("CoalAxe").setTextureName("MoreTools:CoalAxe");
    public static Item CoalHoe = new CoalHoe(ConfigurationHandler.CoalHoeID, toolCoal)
            .setUnlocalizedName("CoalHoe").setTextureName("MoreTools:CoalHoe");
    public static Item WoolPickaxe = new WoolPickaxe(ConfigurationHandler.WoolPickaxeID,
            toolWool).setUnlocalizedName("WoolPickaxe").setTextureName(
            "MoreTools:WoolPickaxe");
    public static Item WoolSword = new WoolSword(ConfigurationHandler.WoolSwordID, toolWool)
            .setUnlocalizedName("WoolSword").setTextureName(
                    "MoreTools:WoolSword");
    public static Item WoolShovel = new WoolShovel(ConfigurationHandler.WoolShovelID,
            toolWool).setUnlocalizedName("WoolShovel").setTextureName(
            "MoreTools:WoolShovel");
    public static Item WoolAxe = new WoolAxe(ConfigurationHandler.WoolAxeID, toolWool)
            .setUnlocalizedName("WoolAxe").setTextureName("MoreTools:WoolAxe");
    public static Item WoolHoe = new WoolHoe(ConfigurationHandler.WoolHoeID, toolWool)
            .setUnlocalizedName("WoolHoe").setTextureName("MoreTools:WoolHoe");
    public static Block RockWool = new RockWool(ConfigurationHandler.RockWoolID,
            Material.ground).setBlockName("RockWool").setBlockTextureName(
            "MoreTools:RockWool");
    public static Item LonsdaleitePickaxe = new LonsdaleitePickaxe(
            ConfigurationHandler.LonsdaleitePickaxeID, toolLonsdaleite).setUnlocalizedName(
            "LonsdaleitePickaxe")
            .setTextureName("MoreTools:LonsdaleitePickaxe");
    public static Item LonsdaleiteSword = new LonsdaleiteSword(
            ConfigurationHandler.LonsdaleiteSwordID, toolLonsdaleite).setUnlocalizedName(
            "LonsdaleiteSword").setTextureName("MoreTools:LonsdaleiteSword");
    public static Item LonsdaleiteShovel = new LonsdaleiteShovel(
            ConfigurationHandler.LonsdaleiteShovelID, toolLonsdaleite).setUnlocalizedName(
            "LonsdaleiteShovel").setTextureName("MoreTools:LonsdaleiteShovel");
    public static Item LonsdaleiteAxe = new LonsdaleiteAxe(
            ConfigurationHandler.LonsdaleiteAxeID, toolLonsdaleite).setUnlocalizedName(
            "LonsdaleiteAxe").setTextureName("MoreTools:LonsdaleiteAxe");
    public static Item LonsdaleiteHoe = new LonsdaleiteHoe(
            ConfigurationHandler.LonsdaleiteHoeID, toolLonsdaleite).setUnlocalizedName(
            "LonsdaleiteHoe").setTextureName("MoreTools:LonsdaleiteHoe");
    public static Item LonsdaleiteGem = new LonsdaleiteGem(
            ConfigurationHandler.LonsdaleiteGemID).setUnlocalizedName("LonsdaleiteGem")
            .setTextureName("MoreTools:Lonsdaleite");
    public static Block LonsdaleiteOre = new LonsdaleiteOre(
            ConfigurationHandler.LonsdaleiteOreID, Material.ground).setBlockName(
            "LonsdaleiteOre").setBlockTextureName("MoreTools:LonsdaleiteOre");
    public static Block LonsdaleiteBlock = new LonsdaleiteBlock(
            ConfigurationHandler.LonsdaleiteBlockID, Material.dragonEgg).setBlockName(
            "LonsdaleiteBlock").setBlockTextureName(
            "MoreTools:LonsdaleiteBlock");
    public static Item BedrockPickaxe = new BedrockPickaxe(
            ConfigurationHandler.BedrockPickaxeID, toolBedrock).setUnlocalizedName(
            "BedrockPickaxe").setTextureName("MoreTools:BedrockPickaxe");
    public static Item BedrockSword = new BedrockSword(ConfigurationHandler.BedrockSwordID,
            toolBedrock).setUnlocalizedName("BedrockSword").setTextureName(
            "MoreTools:BedrockSword");
    public static Item BedrockShovel = new BedrockShovel(
            ConfigurationHandler.BedrockShovelID, toolBedrock).setUnlocalizedName(
            "BedrockShovel").setTextureName("MoreTools:BedrockShovel");
    public static Item BedrockAxe = new BedrockAxe(ConfigurationHandler.BedrockAxeID,
            toolBedrock).setUnlocalizedName("BedrockAxe").setTextureName(
            "MoreTools:BedrockAxe");
    public static Item BedrockHoe = new BedrockHoe(ConfigurationHandler.BedrockHoeID,
            toolBedrock).setUnlocalizedName("BedrockHoe").setTextureName(
            "MoreTools:BedrockHoe");
    public static Item BedrockLump = new BedrockLump(ConfigurationHandler.BedrockLumpID)
            .setUnlocalizedName("BedrockLump").setTextureName(
                    "MoreTools:BedrockLump");
    public static Item DiamondStick = new DiamondStick(ConfigurationHandler.DiamondStickID)
            .setUnlocalizedName("DiamondStick").setTextureName(
                    "MoreTools:DiamondStick");
    public static Item ObsidianLump = new ObsidianLump(ConfigurationHandler.ObsidianLumpID)
            .setUnlocalizedName("ObsidianLump").setTextureName(
                    "MoreTools:ObsidianLump");
    public static Block ArtificialBedrock = new ArtificialBedrock(
            ConfigurationHandler.ArtificialBedrockID, Material.ground).setBlockName(
            "ArtificialBedrock").setBlockTextureName("MoreTools:FakeBedrock");
    public static Item QuartzPickaxe = new QuartzPickaxe(
            ConfigurationHandler.QuartzPickaxeID, toolQuartz).setUnlocalizedName(
            "QuartzPickaxe").setTextureName("MoreTools:QuartzPickaxe");
    public static Item QuartzSword = new QuartzSword(ConfigurationHandler.QuartzSwordID,
            toolQuartz).setUnlocalizedName("QuartzSword").setTextureName(
            "MoreTools:QuartzSword");
    public static Item QuartzShovel = new QuartzShovel(ConfigurationHandler.QuartzShovelID,
            toolQuartz).setUnlocalizedName("QuartzShovel").setTextureName(
            "MoreTools:QuartzShovel");
    public static Item QuartzAxe = new QuartzAxe(ConfigurationHandler.QuartzAxeID, toolQuartz)
            .setUnlocalizedName("QuartzAxe").setTextureName(
                    "MoreTools:QuartzAxe");
    public static Item QuartzHoe = new QuartzHoe(ConfigurationHandler.QuartzHoeID, toolQuartz)
            .setUnlocalizedName("QuartzHoe").setTextureName(
                    "MoreTools:QuartzHoe");
    public static Item DirtHelmet = new DirtArmor(armorDirt,
            ConfigurationHandler.DirtHelmetID, 0).setUnlocalizedName("DirtHelmet")
            .setTextureName("MoreTools:DirtHelmet");
    public static Item DirtChestplate = new DirtArmor(armorDirt,
            ConfigurationHandler.DirtChestplateID, 1).setUnlocalizedName("DirtChestplate")
            .setTextureName("MoreTools:DirtChestplate");
    public static Item DirtLeggings = new DirtArmor(armorDirt,
            ConfigurationHandler.DirtLeggingsID, 2).setUnlocalizedName("DirtLeggings")
            .setTextureName("MoreTools:DirtLeggings");
    public static Item DirtBoots = new DirtArmor(armorDirt, ConfigurationHandler.DirtBootsID,
            3).setUnlocalizedName("DirtBoots").setTextureName(
            "MoreTools:DirtBoots");
    public static Item EmeraldHelmet = new EmeraldArmor(armorEmerald,
            ConfigurationHandler.EmeraldHelmetID, 0).setUnlocalizedName("EmeraldHelmet")
            .setTextureName("MoreTools:EmeraldHelmet");
    public static Item EmeraldChestplate = new EmeraldArmor(armorEmerald,
            ConfigurationHandler.EmeraldChestplateID, 1).setUnlocalizedName(
            "EmeraldChestplate").setTextureName("MoreTools:EmeraldChestplate");
    public static Item EmeraldLeggings = new EmeraldArmor(armorEmerald,
            ConfigurationHandler.EmeraldLeggingsID, 2).setUnlocalizedName("EmeraldLeggings")
            .setTextureName("MoreTools:EmeraldLeggings");
    public static Item EmeraldBoots = new EmeraldArmor(armorEmerald,
            ConfigurationHandler.EmeraldBootsID, 3).setUnlocalizedName("EmeraldBoots")
            .setTextureName("MoreTools:EmeraldBoots");
    public static Item RedstoneHelmet = new RedstoneArmor(armorRedstone,
            ConfigurationHandler.RedstoneHelmetID, 0).setUnlocalizedName("RedstoneHelmet")
            .setTextureName("MoreTools:RedstoneHelmet");
    public static Item RedstoneChestplate = new RedstoneArmor(armorRedstone,
            ConfigurationHandler.RedstoneChestplateID, 1).setUnlocalizedName(
            "RedstoneChestplate")
            .setTextureName("MoreTools:RedstoneChestplate");
    public static Item RedstoneLeggings = new RedstoneArmor(armorRedstone,
            ConfigurationHandler.RedstoneLeggingsID, 2)
            .setUnlocalizedName("RedstoneLeggings").setTextureName(
                    "MoreTools:RedstoneLeggings");
    public static Item RedstoneBoots = new RedstoneArmor(armorRedstone,
            ConfigurationHandler.RedstoneBootsID, 3).setUnlocalizedName("RedstoneBoots")
            .setTextureName("MoreTools:RedstoneBoots");
    public static Item GlassHelmet = new GlassArmor(armorGlass,
            ConfigurationHandler.GlassHelmetID, 0).setUnlocalizedName("GlassHelmet")
            .setTextureName("MoreTools:GlassHelmet");
    public static Item GlassChestplate = new GlassArmor(armorGlass,
            ConfigurationHandler.GlassChestplateID, 1).setUnlocalizedName("GlassChestplate")
            .setTextureName("MoreTools:GlassChestplate");
    public static Item GlassLeggings = new GlassArmor(armorGlass,
            ConfigurationHandler.GlassLeggingsID, 2).setUnlocalizedName("GlassLeggings")
            .setTextureName("MoreTools:GlassLeggings");
    public static Item GlassBoots = new GlassArmor(armorGlass,
            ConfigurationHandler.GlassBootsID, 3).setUnlocalizedName("GlassBoots")
            .setTextureName("MoreTools:GlassBoots");
    public static Item LapisHelmet = new LapisArmor(armorLapis,
            ConfigurationHandler.LapisHelmetID, 0).setUnlocalizedName("LapisHelmet")
            .setTextureName("MoreTools:LapisHelmet");
    public static Item LapisChestplate = new LapisArmor(armorLapis,
            ConfigurationHandler.LapisChestplateID, 1).setUnlocalizedName("LapisChestplate")
            .setTextureName("MoreTools:LapisChestplate");
    public static Item LapisLeggings = new LapisArmor(armorLapis,
            ConfigurationHandler.LapisLeggingsID, 2).setUnlocalizedName("LapisLeggings")
            .setTextureName("MoreTools:LapisLeggings");
    public static Item LapisBoots = new LapisArmor(armorLapis,
            ConfigurationHandler.LapisBootsID, 3).setUnlocalizedName("LapisBoots")
            .setTextureName("MoreTools:LapisBoots");
    public static Item ObsidianHelmet = new ObsidianArmor(armorObsidian,
            ConfigurationHandler.ObsidianHelmetID, 0).setUnlocalizedName("ObsidianHelmet")
            .setTextureName("MoreTools:ObsidianHelmet");
    public static Item ObsidianChestplate = new ObsidianArmor(armorObsidian,
            ConfigurationHandler.ObsidianChestplateID, 1).setUnlocalizedName(
            "ObsidianChestplate")
            .setTextureName("MoreTools:ObsidianChestplate");
    public static Item ObsidianLeggings = new ObsidianArmor(armorObsidian,
            ConfigurationHandler.ObsidianLeggingsID, 2)
            .setUnlocalizedName("ObsidianLeggings").setTextureName(
                    "MoreTools:ObsidianLeggings");
    public static Item ObsidianBoots = new ObsidianArmor(armorObsidian,
            ConfigurationHandler.ObsidianBootsID, 3).setUnlocalizedName("ObsidianBoots")
            .setTextureName("MoreTools:ObsidianBoots");
    public static Item CoalHelmet = new CoalArmor(armorCoal,
            ConfigurationHandler.CoalHelmetID, 0).setUnlocalizedName("CoalHelmet")
            .setTextureName("MoreTools:CoalHelmet");
    public static Item CoalChestplate = new CoalArmor(armorCoal,
            ConfigurationHandler.CoalChestplateID, 1).setUnlocalizedName("CoalChestplate")
            .setTextureName("MoreTools:CoalChestplate");
    public static Item CoalLeggings = new CoalArmor(armorCoal,
            ConfigurationHandler.CoalLeggingsID, 2).setUnlocalizedName("CoalLeggings")
            .setTextureName("MoreTools:CoalLeggings");
    public static Item CoalBoots = new CoalArmor(armorCoal, ConfigurationHandler.CoalBootsID,
            3).setUnlocalizedName("CoalBoots").setTextureName(
            "MoreTools:CoalBoots");
    public static Item WoolHelmet = new WoolArmor(armorWool,
            ConfigurationHandler.WoolHelmetID, 0).setUnlocalizedName("WoolHelmet")
            .setTextureName("MoreTools:WoolHelmet");
    public static Item WoolChestplate = new WoolArmor(armorWool,
            ConfigurationHandler.WoolChestplateID, 1).setUnlocalizedName("WoolChestplate")
            .setTextureName("MoreTools:WoolChestplate");
    public static Item WoolLeggings = new WoolArmor(armorWool,
            ConfigurationHandler.WoolLeggingsID, 2).setUnlocalizedName("WoolLeggings")
            .setTextureName("MoreTools:WoolLeggings");
    public static Item WoolBoots = new WoolArmor(armorWool, ConfigurationHandler.WoolBootsID,
            3).setUnlocalizedName("WoolBoots").setTextureName(
            "MoreTools:WoolBoots");
    public static Item LonsdaleiteHelmet = new LonsdaleiteArmor(
            armorLonsdaleite, ConfigurationHandler.LonsdaleiteHelmetID, 0)
            .setUnlocalizedName("LonsdaleiteHelmet").setTextureName(
                    "MoreTools:LonsdaleiteHelmet");
    public static Item LonsdaleiteChestplate = new LonsdaleiteArmor(
            armorLonsdaleite, ConfigurationHandler.LonsdaleiteChestplateID, 1)
            .setUnlocalizedName("LonsdaleiteChestplate").setTextureName(
                    "MoreTools:LonsdaleiteChestplate");
    public static Item LonsdaleiteLeggings = new LonsdaleiteArmor(
            armorLonsdaleite, ConfigurationHandler.LonsdaleiteLeggingsID, 2)
            .setUnlocalizedName("LonsdaleiteLeggings").setTextureName(
                    "MoreTools:LonsdaleiteLeggings");
    public static Item LonsdaleiteBoots = new LonsdaleiteArmor(
            armorLonsdaleite, ConfigurationHandler.LonsdaleiteBootsID, 3).setUnlocalizedName(
            "LonsdaleiteBoots").setTextureName("MoreTools:LonsdaleiteBoots");
    public static Item BedrockHelmet = new BedrockArmor(armorBedrock,
            ConfigurationHandler.BedrockHelmetID, 0).setUnlocalizedName("BedrockHelmet")
            .setTextureName("MoreTools:BedrockHelmet");
    public static Item BedrockChestplate = new BedrockArmor(armorBedrock,
            ConfigurationHandler.BedrockChestplateID, 1).setUnlocalizedName(
            "BedrockChestplate").setTextureName("MoreTools:BedrockChestplate");
    public static Item BedrockLeggings = new BedrockArmor(armorBedrock,
            ConfigurationHandler.BedrockLeggingsID, 2).setUnlocalizedName("BedrockLeggings")
            .setTextureName("MoreTools:BedrockLeggings");
    public static Item BedrockBoots = new BedrockArmor(armorBedrock,
            ConfigurationHandler.BedrockBootsID, 3).setUnlocalizedName("BedrockBoots")
            .setTextureName("MoreTools:BedrockBoots");
    public static Item QuartzHelmet = new QuartzArmor(armorQuartz,
            ConfigurationHandler.QuartzHelmetID, 0).setUnlocalizedName("QuartzHelmet")
            .setTextureName("MoreTools:QuartzHelmet");
    public static Item QuartzChestplate = new QuartzArmor(armorQuartz,
            ConfigurationHandler.QuartzChestplateID, 1)
            .setUnlocalizedName("QuartzChestplate").setTextureName(
                    "MoreTools:QuartzChestplate");
    public static Item QuartzLeggings = new QuartzArmor(armorQuartz,
            ConfigurationHandler.QuartzLeggingsID, 2).setUnlocalizedName("QuartzLeggings")
            .setTextureName("MoreTools:QuartzLeggings");
    public static Item QuartzBoots = new QuartzArmor(armorQuartz,
            ConfigurationHandler.QuartzBootsID, 3).setUnlocalizedName("QuartzBoots")
            .setTextureName("MoreTools:QuartzBoots");
    public static Block DiamondFurnace = new DiamondFurnace(ConfigurationHandler.DiamondFurnaceID, Material.iron).setBlockName("DiamondFurnace").setBlockTextureName("MoreTools:DiamondFurnace");
    public static Block SmallLonsdaleiteMetorite = new TileEntitySmallLonsdaleiteMetorite(ConfigurationHandler.SmallLonsdaleiteMetoriteID, Material.anvil).setBlockName("SmallLonsdaleiteMetorite").setBlockTextureName("MoreTools:SmallLonsdaleiteMetorite");

    public MoreTools() {

        GameRegistry.registerItem(TabToolsPlaceHolder, "TabToolsPlaceHolder");
        GameRegistry.registerItem(TabArmorPlaceHolder, "TabArmorPlaceHolder");

        // Bedrock Override
        if (!ConfigurationHandler.overrideBedrock) {
            Blocks.bedrock.setHardness(50.0F);
            Blocks.bedrock.setHarvestLevel("pickaxe", 10);
        }

        // Dirt
        if (!ConfigurationHandler.enableDirt) {
            GameRegistry.registerItem(DirtPickaxe, "DirtPickaxe");
            GameRegistry.registerItem(DirtSword, "DirtSword");
            GameRegistry.registerItem(DirtShovel, "DirtShovel");
            GameRegistry.registerItem(DirtAxe, "DirtAxe");
            GameRegistry.registerItem(DirtHoe, "DirtHoe");
            GameRegistry.registerItem(DirtHelmet, "DirtHelmet");
            GameRegistry.registerItem(DirtChestplate, "DirtChestplate");
            GameRegistry.registerItem(DirtLeggings, "DirtLeggings");
            GameRegistry.registerItem(DirtBoots, "DirtBoots");
        }

        // Emerald
        if (!ConfigurationHandler.enableEmerald) {
            GameRegistry.registerItem(EmeraldPickaxe, "EmeraldPickaxe");
            GameRegistry.registerItem(EmeraldSword, "EmeraldSword");
            GameRegistry.registerItem(EmeraldShovel, "EmeraldShovel");
            GameRegistry.registerItem(EmeraldAxe, "EmeraldAxe");
            GameRegistry.registerItem(EmeraldHoe, "EmeraldHoe");
            GameRegistry.registerItem(EmeraldHelmet, "EmeraldHelmet");
            GameRegistry.registerItem(EmeraldChestplate, "EmeraldChestplate");
            GameRegistry.registerItem(EmeraldLeggings, "EmeraldLeggings");
            GameRegistry.registerItem(EmeraldBoots, "EmeraldBoots");
        }

        // Redstone
        if (!ConfigurationHandler.enableRedstone) {
            GameRegistry.registerItem(RedstonePickaxe, "RedstonePickaxe");
            GameRegistry.registerItem(RedstoneSword, "RedstoneSword");
            GameRegistry.registerItem(RedstoneShovel, "RedstoneShovel");
            GameRegistry.registerItem(RedstoneAxe, "RedstoneAxe");
            GameRegistry.registerItem(RedstoneHoe, "RedstoneHoe");
            GameRegistry.registerItem(RedstoneHelmet, "RedstoneHelmet");
            GameRegistry.registerItem(RedstoneChestplate, "RedstoneChestplate");
            GameRegistry.registerItem(RedstoneLeggings, "RedstoneLeggings");
            GameRegistry.registerItem(RedstoneBoots, "RedstoneBoots");
        }

        // Glass
        if (!ConfigurationHandler.enableGlass) {
            GameRegistry.registerItem(GlassPickaxe, "GlassPickaxe");
            GameRegistry.registerItem(GlassSword, "GlassSword");
            GameRegistry.registerItem(GlassShovel, "GlassShovel");
            GameRegistry.registerItem(GlassAxe, "GlassAxe");
            GameRegistry.registerItem(GlassHoe, "GlassHoe");
            GameRegistry.registerItem(GlassHelmet, "GlassHelmet");
            GameRegistry.registerItem(GlassChestplate, "GlassChestplate");
            GameRegistry.registerItem(GlassLeggings, "GlassLeggings");
            GameRegistry.registerItem(GlassBoots, "GlassBoots");
            GameRegistry.registerBlock(CompressedGlass, "CompressedGlass");
            GameRegistry.registerBlock(HardenedGlass, "HardenedGlass");
            GameRegistry.registerBlock(RefinedGlass, "RefinedGlass");
        }

        // Lapis
        if (!ConfigurationHandler.enableLapis) {
            GameRegistry.registerItem(LapisPickaxe, "LapisPickaxe");
            GameRegistry.registerItem(LapisSword, "LapisSword");
            GameRegistry.registerItem(LapisShovel, "LapisShovel");
            GameRegistry.registerItem(LapisAxe, "LapisAxe");
            GameRegistry.registerItem(LapisHoe, "LapisHoe");
            GameRegistry.registerItem(LapisHelmet, "LapisHelmet");
            GameRegistry.registerItem(LapisChestplate, "LapisChestplate");
            GameRegistry.registerItem(LapisLeggings, "LapisLeggings");
            GameRegistry.registerItem(LapisBoots, "LapisBoots");
        }

        // Obsidian
        if (!ConfigurationHandler.enableObsidian) {
            GameRegistry.registerItem(ObsidianPickaxe, "ObsidianPickaxe");
            GameRegistry.registerItem(ObsidianSword, "ObsidianSword");
            GameRegistry.registerItem(ObsidianShovel, "ObsidianShovel");
            GameRegistry.registerItem(ObsidianAxe, "ObsidianAxe");
            GameRegistry.registerItem(ObsidianHoe, "ObsidianHoe");
            GameRegistry.registerItem(ObsidianHelmet, "ObsidianHelmet");
            GameRegistry.registerItem(ObsidianChestplate, "ObsidianChestplate");
            GameRegistry.registerItem(ObsidianLeggings, "ObsidianLeggings");
            GameRegistry.registerItem(ObsidianBoots, "ObsidianBoots");
        }

        // Coal
        if (!ConfigurationHandler.enableCoal) {
            GameRegistry.registerItem(CoalPickaxe, "CoalPickaxe");
            GameRegistry.registerItem(CoalSword, "CoalSword");
            GameRegistry.registerItem(CoalShovel, "CoalShovel");
            GameRegistry.registerItem(CoalAxe, "CoalAxe");
            GameRegistry.registerItem(CoalHoe, "CoalHoe");
            GameRegistry.registerItem(CoalHelmet, "CoalHelmet");
            GameRegistry.registerItem(CoalChestplate, "CoalChestplate");
            GameRegistry.registerItem(CoalLeggings, "CoalLeggings");
            GameRegistry.registerItem(CoalBoots, "CoalBoots");
        }

        // Wool
        if (!ConfigurationHandler.enableWool) {
            GameRegistry.registerItem(WoolPickaxe, "WoolPickaxe");
            GameRegistry.registerItem(WoolSword, "WoolSword");
            GameRegistry.registerItem(WoolShovel, "WoolShovel");
            GameRegistry.registerItem(WoolAxe, "WoolAxe");
            GameRegistry.registerItem(WoolHoe, "WoolHoe");
            GameRegistry.registerItem(WoolHelmet, "WoolHelmet");
            GameRegistry.registerItem(WoolChestplate, "WoolChestplate");
            GameRegistry.registerItem(WoolLeggings, "WoolLeggings");
            GameRegistry.registerItem(WoolBoots, "WoolBoots");
            GameRegistry.registerBlock(RockWool, "RockWool");
        }

        // Lonsdaleite
        if (!ConfigurationHandler.enableLonsdaleite) {
            GameRegistry.registerItem(LonsdaleitePickaxe, "LonsdaleitePickaxe");
            GameRegistry.registerItem(LonsdaleiteSword, "LonsdaleiteSword");
            GameRegistry.registerItem(LonsdaleiteShovel, "LonsdaleiteShovel");
            GameRegistry.registerItem(LonsdaleiteAxe, "LonsdaleiteAxe");
            GameRegistry.registerItem(LonsdaleiteHoe, "LonsdaleiteHoe");
            GameRegistry.registerItem(LonsdaleiteHelmet, "LonsdaleiteHelmet");
            GameRegistry.registerItem(LonsdaleiteChestplate,
                    "LonsdaleiteChestplate");
            GameRegistry.registerItem(LonsdaleiteLeggings,
                    "LonsdaleiteLeggings");
            GameRegistry.registerItem(LonsdaleiteBoots, "LonsdaleiteBoots");
            GameRegistry.registerItem(LonsdaleiteGem, "LonsdaleiteGem");
            GameRegistry.registerBlock(LonsdaleiteOre, "LonsdaleiteOre");
            GameRegistry.registerBlock(LonsdaleiteBlock, "LonsdaleiteBlock");
            GameRegistry.registerBlock(DiamondFurnace, "DiamondFurnace");
            GameRegistry.registerTileEntity(DiamondFurnaceTileEntity.class, "DiamondFurnaceTileEntity");
            GameRegistry.registerBlock(SmallLonsdaleiteMetorite, "SmallLonsdaleiteMetorite");
        }

        // Bedrock
        if (!ConfigurationHandler.enableBedrock) {
            GameRegistry.registerItem(BedrockPickaxe, "BedrockPickaxe");
            GameRegistry.registerItem(BedrockSword, "BedrockSword");
            GameRegistry.registerItem(BedrockShovel, "BedrockShovel");
            GameRegistry.registerItem(BedrockAxe, "BedrockAxe");
            GameRegistry.registerItem(BedrockHoe, "BedrockHoe");
            GameRegistry.registerItem(BedrockHelmet, "BedrockHelmet");
            GameRegistry.registerItem(BedrockChestplate, "BedrockChestplate");
            GameRegistry.registerItem(BedrockLeggings, "BedrockLeggings");
            GameRegistry.registerItem(BedrockBoots, "BedrockBoots");
            GameRegistry.registerItem(DiamondStick, "DiamondStick");
        }
        if (!ConfigurationHandler.enableFakeBedrock) {
            GameRegistry.registerBlock(ArtificialBedrock, "ArtificialBedrock");
            GameRegistry.registerItem(BedrockLump, "BedrockLump");
            GameRegistry.registerItem(ObsidianLump, "ObsidianLump");
        }

        // Quartz
        if (!ConfigurationHandler.enableQuartz) {
            GameRegistry.registerItem(QuartzPickaxe, "QuartzPickaxe");
            GameRegistry.registerItem(QuartzSword, "QuartzSword");
            GameRegistry.registerItem(QuartzShovel, "QuartzShovel");
            GameRegistry.registerItem(QuartzAxe, "QuartzAxe");
            GameRegistry.registerItem(QuartzHoe, "QuartzHoe");
            GameRegistry.registerItem(QuartzHelmet, "QuartzHelmet");
            GameRegistry.registerItem(QuartzChestplate, "QuartzChestplate");
            GameRegistry.registerItem(QuartzLeggings, "QuartzLeggings");
            GameRegistry.registerItem(QuartzBoots, "QuartzBoots");
        }

        // Misc
        if (!ConfigurationHandler.enableLonsdaleite) {
            GameRegistry.registerWorldGenerator(LonsdaleiteWG, 1);
        }
        if (!ConfigurationHandler.enableFakeBedrock) {
            GameRegistry.registerWorldGenerator(BedrockWG, 1);
        }

        // Recipes
        // Glass
        GameRegistry.addSmelting(CompressedGlass,
                (new ItemStack(HardenedGlass)), 10);
        GameRegistry.addSmelting(Blocks.glass, (new ItemStack(RefinedGlass)),
                10);

        // Lonsdaleite
        GameRegistry.addRecipe(new ItemStack(LonsdaleiteBlock, 1),
                new Object[]{"XXX", "XXX", "XXX", 'X', LonsdaleiteGem});

        // Bedrock
        GameRegistry
                .addRecipe(new ItemStack(ObsidianLump, 1), new Object[]{
                        "XXX", "X*X", "XXX", 'X', Blocks.obsidian, '*',
                        Items.diamond});

        GameRegistry.addRecipe(new ItemStack(BedrockLump, 1), new Object[]{
                "XXX", "X*X", "XXX", 'X', ObsidianLump, '*', LonsdaleiteGem});

        GameRegistry.addRecipe(new ItemStack(ArtificialBedrock, 1),
                new Object[]{"XXX", "X*X", "XXX", 'X', BedrockLump, '*',
                        LonsdaleiteBlock});
    }

    public static void addNames() {
    }

    /*
        public static void oreRegistration() {
            OreDictionary.registerOre("stickWood", Items.stick);
            OreDictionary.registerOre("blockDirt", Blocks.dirt);
            OreDictionary.registerOre("gemEmerald", Items.emerald);
            OreDictionary.registerOre("blockHardenedGlass", HardenedGlass);
            OreDictionary.registerOre("blockLapis", Blocks.lapis_block);
            OreDictionary.registerOre("blockObsidian", Blocks.obsidian);
            OreDictionary.registerOre("blockCoal", Blocks.coal_block);
            OreDictionary.registerOre("blockRockWool", RockWool);
            OreDictionary.registerOre("gemLonsdaleite", LonsdaleiteGem);
            OreDictionary.registerOre("blockBedrock", Blocks.bedrock);
            OreDictionary.registerOre("blockBedrock", ArtificialBedrock);
            OreDictionary.registerOre("blockQuartz", Blocks.quartz_block);
            OreDictionary.registerOre("blockRedstone", Blocks.redstone_block);
            OreDictionary.registerOre("stickDiamond", DiamondStick);
            OreDictionary.registerOre("blockWool", Blocks.wool);
            OreDictionary.registerOre("blockStone", Blocks.stone);
        }
    */
    public static void addOreRecipes() {
        // Dirt
        GameRegistry.addRecipe(new ShapedOreRecipe(DirtPickaxe, true,
                new Object[]{"XXX", " * ", " * ", Character.valueOf('X'),
                        "blockDirt", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(DirtSword, true,
                new Object[]{" X ", " X ", " * ", Character.valueOf('X'),
                        "blockDirt", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(DirtShovel, true,
                new Object[]{" X ", " * ", " * ", Character.valueOf('X'),
                        "blockDirt", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(DirtAxe, true, new Object[]{
                "XX ", "X* ", " * ", Character.valueOf('X'), "blockDirt",
                Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(DirtHoe, true, new Object[]{
                " XX", " * ", " * ", Character.valueOf('X'), "blockDirt",
                Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(DirtHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockDirt"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(DirtChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockDirt"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(DirtLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockDirt"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(DirtBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockDirt"}));

        // Emerald
        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldPickaxe, true,
                new Object[]{"XXX", " * ", " * ", Character.valueOf('X'),
                        "gemEmerald", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldSword, true,
                new Object[]{" X ", " X ", " * ", Character.valueOf('X'),
                        "gemEmerald", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldShovel, true,
                new Object[]{" X ", " * ", " * ", Character.valueOf('X'),
                        "gemEmerald", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldAxe, true,
                new Object[]{"XX ", "X* ", " * ", Character.valueOf('X'),
                        "gemEmerald", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldHoe, true,
                new Object[]{" XX", " * ", " * ", Character.valueOf('X'),
                        "gemEmerald", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "gemEmerald"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "gemEmerald"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "gemEmerald"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(EmeraldBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "gemEmerald"}));

        // Glass
        GameRegistry.addRecipe(new ShapedOreRecipe(GlassPickaxe, true,
                new Object[]{"XXX", " * ", " * ", Character.valueOf('X'),
                        "blockHardenedGlass", Character.valueOf('*'),
                        "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(GlassSword, true,
                new Object[]{" X ", " X ", " * ", Character.valueOf('X'),
                        "blockHardenedGlass", Character.valueOf('*'),
                        "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(GlassShovel, true,
                new Object[]{" X ", " * ", " * ", Character.valueOf('X'),
                        "blockHardenedGlass", Character.valueOf('*'),
                        "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(GlassAxe, true,
                new Object[]{"XX ", "X* ", " * ", Character.valueOf('X'),
                        "blockHardenedGlass", Character.valueOf('*'),
                        "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(GlassHoe, true,
                new Object[]{" XX", " * ", " * ", Character.valueOf('X'),
                        "blockHardenedGlass", Character.valueOf('*'),
                        "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(GlassHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockHardenedGlass"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(GlassChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockHardenedGlass"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(GlassLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockHardenedGlass"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(GlassBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockHardenedGlass"}));

        // Lapis
        GameRegistry.addRecipe(new ShapedOreRecipe(LapisPickaxe, true,
                new Object[]{"XXX", " * ", " * ", Character.valueOf('X'),
                        "blockLapis", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LapisSword, true,
                new Object[]{" X ", " X ", " * ", Character.valueOf('X'),
                        "blockLapis", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LapisShovel, true,
                new Object[]{" X ", " * ", " * ", Character.valueOf('X'),
                        "blockLapis", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LapisAxe, true,
                new Object[]{"XX ", "X* ", " * ", Character.valueOf('X'),
                        "blockLapis", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LapisHoe, true,
                new Object[]{" XX", " * ", " * ", Character.valueOf('X'),
                        "blockLapis", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LapisHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockLapis"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LapisChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockLapis"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LapisLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockLapis"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LapisBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockLapis"}));

        // Obsidian
        GameRegistry
                .addRecipe(new ShapedOreRecipe(ObsidianPickaxe, true,
                        new Object[]{"XXX", " * ", " * ",
                                Character.valueOf('X'), "blockObsidian",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(ObsidianSword, true,
                        new Object[]{" X ", " X ", " * ",
                                Character.valueOf('X'), "blockObsidian",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(ObsidianShovel, true,
                        new Object[]{" X ", " * ", " * ",
                                Character.valueOf('X'), "blockObsidian",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(ObsidianAxe, true, new Object[]{
                        "XX ", "X* ", " * ", Character.valueOf('X'),
                        "blockObsidian", Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(ObsidianHoe, true, new Object[]{
                        " XX", " * ", " * ", Character.valueOf('X'),
                        "blockObsidian", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(ObsidianHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockObsidian"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(ObsidianChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockObsidian"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(ObsidianLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockObsidian"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(ObsidianBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockObsidian"}));

        // Coal
        GameRegistry.addRecipe(new ShapedOreRecipe(CoalPickaxe, true,
                new Object[]{"XXX", " * ", " * ", Character.valueOf('X'),
                        "blockCoal", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(CoalSword, true,
                new Object[]{" X ", " X ", " * ", Character.valueOf('X'),
                        "blockCoal", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(CoalShovel, true,
                new Object[]{" X ", " * ", " * ", Character.valueOf('X'),
                        "blockCoal", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(CoalAxe, true, new Object[]{
                "XX ", "X* ", " * ", Character.valueOf('X'), "blockCoal",
                Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(CoalHoe, true, new Object[]{
                " XX", " * ", " * ", Character.valueOf('X'), "blockCoal",
                Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(CoalHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockCoal"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(CoalChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockCoal"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(CoalLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockCoal"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(CoalBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockCoal"}));

        // Wool
        GameRegistry
                .addRecipe(new ShapedOreRecipe(WoolPickaxe, true, new Object[]{
                        "XXX", " * ", " * ", Character.valueOf('X'),
                        "blockRockWool", Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(WoolSword, true, new Object[]{
                        " X ", " X ", " * ", Character.valueOf('X'),
                        "blockRockWool", Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(WoolShovel, true, new Object[]{
                        " X ", " * ", " * ", Character.valueOf('X'),
                        "blockRockWool", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(WoolAxe, true, new Object[]{
                "XX ", "X* ", " * ", Character.valueOf('X'), "blockRockWool",
                Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(WoolHoe, true, new Object[]{
                " XX", " * ", " * ", Character.valueOf('X'), "blockRockWool",
                Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(WoolHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockRockWool"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(WoolChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockRockWool"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(WoolLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockRockWool"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(WoolBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockRockWool"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(RockWool, true,
                new Object[]{"XXX", "X*X", "XXX", Character.valueOf('*'),
                        "blockWool", Character.valueOf('X'), "blockStone"}));

        // Lonsdaleite
        GameRegistry
                .addRecipe(new ShapedOreRecipe(LonsdaleitePickaxe, true,
                        new Object[]{"XXX", " * ", " * ",
                                Character.valueOf('X'), "gemLonsdaleite",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(LonsdaleiteSword, true,
                        new Object[]{" X ", " X ", " * ",
                                Character.valueOf('X'), "gemLonsdaleite",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(LonsdaleiteShovel, true,
                        new Object[]{" X ", " * ", " * ",
                                Character.valueOf('X'), "gemLonsdaleite",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(LonsdaleiteAxe, true,
                        new Object[]{"XX ", "X* ", " * ",
                                Character.valueOf('X'), "gemLonsdaleite",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LonsdaleiteHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "gemLonsdaleite"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LonsdaleiteChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "gemLonsdaleite"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LonsdaleiteLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "gemLonsdaleite"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(LonsdaleiteBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "gemLonsdaleite"}));

        // Bedrock
        GameRegistry
                .addRecipe(new ShapedOreRecipe(BedrockPickaxe, true,
                        new Object[]{"XXX", " * ", " * ",
                                Character.valueOf('X'), "blockBedrock",
                                Character.valueOf('*'), "stickDiamond"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(BedrockSword, true,
                        new Object[]{" X ", " X ", " * ",
                                Character.valueOf('X'), "blockBedrock",
                                Character.valueOf('*'), "stickDiamond"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(BedrockShovel, true,
                        new Object[]{" X ", " * ", " * ",
                                Character.valueOf('X'), "blockBedrock",
                                Character.valueOf('*'), "stickDiamond"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(BedrockAxe, true,
                        new Object[]{"XX ", "X* ", " * ",
                                Character.valueOf('X'), "blockBedrock",
                                Character.valueOf('*'), "stickDiamond"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(BedrockHoe, true,
                        new Object[]{" XX", " * ", " * ",
                                Character.valueOf('X'), "blockBedrock",
                                Character.valueOf('*'), "stickDiamond"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(BedrockHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockBedrock"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(BedrockChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockBedrock"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(BedrockLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockBedrock"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(BedrockBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockBedrock"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(DiamondStick, true,
                        new Object[]{"*X*", "*X*", "*X*",
                                Character.valueOf('X'), "blockObsidian",
                                Character.valueOf('*'), "gemLonsdaleite"}));

        // Quartz
        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzPickaxe, true,
                new Object[]{"XXX", " * ", " * ", Character.valueOf('X'),
                        "blockQuartz", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzSword, true,
                new Object[]{" X ", " X ", " * ", Character.valueOf('X'),
                        "blockQuartz", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzShovel, true,
                new Object[]{" X ", " * ", " * ", Character.valueOf('X'),
                        "blockQuartz", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzAxe, true,
                new Object[]{"XX ", "X* ", " * ", Character.valueOf('X'),
                        "blockQuartz", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzHoe, true,
                new Object[]{" XX", " * ", " * ", Character.valueOf('X'),
                        "blockQuartz", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockQuartz"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockQuartz"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockQuartz"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(QuartzBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockQuartz"}));

        // Redstone
        GameRegistry
                .addRecipe(new ShapedOreRecipe(RedstonePickaxe, true,
                        new Object[]{"XXX", " * ", " * ",
                                Character.valueOf('X'), "blockRedstone",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(RedstoneSword, true,
                        new Object[]{" X ", " X ", " * ",
                                Character.valueOf('X'), "blockRedstone",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(RedstoneShovel, true,
                        new Object[]{" X ", " * ", " * ",
                                Character.valueOf('X'), "blockRedstone",
                                Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(RedstoneAxe, true, new Object[]{
                        "XX ", "X* ", " * ", Character.valueOf('X'),
                        "blockRedstone", Character.valueOf('*'), "stickWood"}));

        GameRegistry
                .addRecipe(new ShapedOreRecipe(RedstoneHoe, true, new Object[]{
                        " XX", " * ", " * ", Character.valueOf('X'),
                        "blockRedstone", Character.valueOf('*'), "stickWood"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(RedstoneHelmet, true,
                new Object[]{"XXX", "X X", Character.valueOf('X'),
                        "blockRedstone"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(RedstoneChestplate, true,
                new Object[]{"X X", "XXX", "XXX", Character.valueOf('X'),
                        "blockRedstone"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(RedstoneLeggings, true,
                new Object[]{"XXX", "X X", "X X", Character.valueOf('X'),
                        "blockRedstone"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(RedstoneBoots, true,
                new Object[]{"X X", "X X", Character.valueOf('X'),
                        "blockRedstone"}));
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        new DiamondFurnaceGuiHandler();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new DiamondFurnaceGuiHandler());
        proxy.registerRenderThings();
        GameRegistry.registerTileEntity(EntitySmallLonsdaleiteMetorite.class, "EntitySmallLonsdaleiteMetorite");
        instance = this;
        addNames();
        //oreRegistration();
        addOreRecipes();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
