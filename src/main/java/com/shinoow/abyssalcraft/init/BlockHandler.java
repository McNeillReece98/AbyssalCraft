/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2016 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.shinoow.abyssalcraft.AbyssalCraft;
import com.shinoow.abyssalcraft.api.AbyssalCraftAPI;
import com.shinoow.abyssalcraft.api.block.ACBlocks;
import com.shinoow.abyssalcraft.common.blocks.*;
import com.shinoow.abyssalcraft.common.blocks.itemblock.*;
import com.shinoow.abyssalcraft.common.blocks.tile.*;
import com.shinoow.abyssalcraft.common.world.gen.WorldGenDLT;
import com.shinoow.abyssalcraft.common.world.gen.WorldGenDrT;
import com.shinoow.abyssalcraft.lib.ACTabs;

public class BlockHandler implements ILifeCycleHandler {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		ACBlocks.darkstone = new BlockDarkstone().setCreativeTab(ACTabs.tabBlock).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkstone");
		ACBlocks.darkstone_brick = new BlockACBasic(Material.ROCK, 1.65F, 12.0F, SoundType.STONE).setUnlocalizedName("darkstone_brick");
		ACBlocks.darkstone_cobblestone = new BlockACBasic(Material.ROCK, 2.2F, 12.0F, SoundType.STONE).setUnlocalizedName("darkstone_cobble");
		ACBlocks.glowing_darkstone_bricks = new BlockACBasic(Material.ROCK, "pickaxe", 3, 55F, 3000F, SoundType.STONE).setLightLevel(1.0F).setUnlocalizedName("dsglow");
		ACBlocks.darkstone_brick_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkbrickslab1");
		AbyssalCraft.Darkbrickslab2 = new BlockACDoubleSlab(ACBlocks.darkstone_brick_slab, Material.ROCK).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkbrickslab2");
		ACBlocks.darkstone_cobblestone_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE).setHardness(1.65F) .setResistance(12.0F).setUnlocalizedName("darkcobbleslab1");
		AbyssalCraft.Darkcobbleslab2 = new BlockACDoubleSlab(ACBlocks.darkstone_cobblestone_slab, Material.ROCK).setHardness(1.65F) .setResistance(12.0F).setUnlocalizedName("darkcobbleslab2");
		ACBlocks.darklands_grass = new BlockDarklandsgrass().setCreativeTab(ACTabs.tabBlock).setHardness(0.4F).setUnlocalizedName("darkgrass");
		ACBlocks.darkstone_brick_stairs = new BlockACStairs(ACBlocks.darkstone_brick).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("dbstairs");
		ACBlocks.darkstone_cobblestone_stairs = new BlockACStairs(ACBlocks.darkstone_cobblestone).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("dcstairs");
		ACBlocks.darklands_oak_sapling = new BlockACSapling(new WorldGenDLT(true)).setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("dltsapling");
		ACBlocks.darklands_oak_leaves = new BlockACLeaves(ACBlocks.darklands_oak_sapling).setHardness(0.2F).setResistance(1.0F).setUnlocalizedName("dltleaves");
		ACBlocks.darklands_oak_wood = new BlockACLog().setHardness(2.0F).setResistance(1.0F).setUnlocalizedName("dltlog");
		ACBlocks.abyssal_stone = new BlockACBasic(Material.ROCK, "pickaxe", 2, 1.8F, 12.0F, SoundType.STONE).setUnlocalizedName("abystone");
		ACBlocks.abyssal_stone_brick = new BlockACBasic(Material.ROCK, "pickaxe", 2, 1.8F, 12.0F, SoundType.STONE).setUnlocalizedName("abybrick");
		ACBlocks.abyssal_stone_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 2, SoundType.STONE).setCreativeTab(ACTabs.tabBlock).setHardness(1.8F).setResistance(12.0F).setUnlocalizedName("abyslab1");
		AbyssalCraft.abyslab2 = new BlockACDoubleSlab(ACBlocks.abyssal_stone_brick_slab, Material.ROCK, "pickaxe", 2).setHardness(1.8F).setResistance(12.0F).setUnlocalizedName("abyslab2");
		ACBlocks.abyssal_stone_brick_stairs = new BlockACStairs(ACBlocks.abyssal_stone_brick, "pickaxe", 2).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("abystairs");
		ACBlocks.coralium_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("coraliumore");
		ACBlocks.abyssalnite_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abyore");
		ACBlocks.abyssal_stone_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 2, SoundType.STONE).setHardness(1.8F).setResistance(12.0F).setUnlocalizedName("abyfence");
		ACBlocks.darkstone_cobblestone_wall = new BlockDarkstonecobblewall(ACBlocks.darkstone_cobblestone).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("dscwall");
		ACBlocks.wooden_crate = new BlockCrate().setHardness(3.0F).setResistance(6.0F).setUnlocalizedName("crate");
		ACBlocks.oblivion_deathbomb = new BlockODB().setHardness(3.0F).setResistance(0F).setUnlocalizedName("odb");
		ACBlocks.block_of_abyssalnite = new IngotBlock(2).setUnlocalizedName("abyblock");
		ACBlocks.coralium_infused_stone = new BlockACOre(3, 3.0F, 6.0F).setUnlocalizedName("coraliumstone");
		ACBlocks.odb_core = new BlockODBcore().setHardness(3.0F).setResistance(0F).setUnlocalizedName("odbcore");
		ACBlocks.abyssal_gateway = new BlockAbyssPortal().setUnlocalizedName("abyportal");
		ACBlocks.darkstone_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE).setCreativeTab(ACTabs.tabBlock).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkstoneslab1");
		AbyssalCraft.Darkstoneslab2 = new BlockACDoubleSlab(ACBlocks.darkstone_slab, Material.ROCK).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("darkstoneslab2");
		ACBlocks.coralium_fire = new BlockCoraliumfire().setLightLevel(1.0F).setUnlocalizedName("coraliumfire");
		ACBlocks.darkstone_button = new BlockACButton(true, "DS").setHardness(0.6F).setResistance(12.0F).setUnlocalizedName("dsbutton");
		ACBlocks.darkstone_pressure_plate = new BlockACPressureplate("DS", Material.ROCK, BlockACPressureplate.Sensitivity.MOBS, SoundType.STONE).setHardness(0.6F).setResistance(12.0F).setUnlocalizedName("dspplate");
		ACBlocks.darklands_oak_planks = new BlockACBasic(Material.WOOD, 2.0F, 5.0F, SoundType.WOOD).setUnlocalizedName("dltplank");
		ACBlocks.darklands_oak_button = new BlockACButton(true, "DLTplank").setHardness(0.5F).setUnlocalizedName("dltbutton");
		ACBlocks.darklands_oak_pressure_plate = new BlockACPressureplate("DLTplank", Material.WOOD, BlockACPressureplate.Sensitivity.EVERYTHING, SoundType.WOOD).setHardness(0.5F).setUnlocalizedName("dltpplate");
		ACBlocks.darklands_oak_stairs = new BlockACStairs(ACBlocks.darklands_oak_planks).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("dltstairs");
		ACBlocks.darklands_oak_slab = new BlockACSingleSlab(Material.WOOD, SoundType.WOOD).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("dltslab1");
		AbyssalCraft.DLTslab2 = new BlockACDoubleSlab(ACBlocks.darklands_oak_slab, Material.WOOD).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("dltslab2");
		ACBlocks.block_of_coralium = new IngotBlock(5).setUnlocalizedName("corblock");
		ACBlocks.dreadlands_infused_powerstone = new BlockPSDL().setHardness(50.0F).setResistance(3000F).setCreativeTab(ACTabs.tabDecoration).setUnlocalizedName("psdl");
		ACBlocks.abyssal_coralium_ore = new BlockACOre(3, 3.0F, 6.0F).setUnlocalizedName("abycorore");
		AbyssalCraft.Altar = new BlockAltar().setHardness(4.0F).setResistance(300.0F).setUnlocalizedName("altar");
		ACBlocks.abyssal_stone_button = new BlockACButton(false, "pickaxe", 2, "AS").setHardness(0.8F).setResistance(12.0F).setUnlocalizedName("abybutton");
		ACBlocks.abyssal_stone_pressure_plate = new BlockACPressureplate("AS", Material.ROCK, BlockACPressureplate.Sensitivity.MOBS, "pickaxe", 2, SoundType.STONE).setHardness(0.8F).setResistance(12.0F).setUnlocalizedName("abypplate");
		ACBlocks.darkstone_brick_fence = new BlockACFence(Material.ROCK, SoundType.STONE).setHardness(1.65F).setResistance(12.0F).setUnlocalizedName("dsbfence");
		ACBlocks.darklands_oak_fence = new BlockACFence(Material.WOOD, SoundType.WOOD).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("dltfence");
		ACBlocks.dreaded_abyssalnite_ore = new BlockACOre(4, 2.5F, 20.0F).setUnlocalizedName("dreadore");
		ACBlocks.dreadlands_abyssalnite_ore = new BlockACOre(4, 2.5F, 20.0F).setUnlocalizedName("abydreadore");
		ACBlocks.dreadstone_brick = new BlockACBasic(Material.ROCK, "pickaxe", 4, 2.5F, 20.0F, SoundType.STONE).setUnlocalizedName("dreadbrick");
		ACBlocks.abyssalnite_stone_brick = new BlockACBasic(Material.ROCK, "pickaxe", 4, 2.5F, 20.0F, SoundType.STONE).setUnlocalizedName("abydreadbrick");
		ACBlocks.dreadlands_sapling = new BlockACSapling(new WorldGenDrT(true)).setHardness(0.0F).setResistance(0.0F).setUnlocalizedName("dreadsapling");
		ACBlocks.dreadlands_log = new BlockACLog().setHardness(2.0F).setResistance(12.0F).setUnlocalizedName("dreadlog");
		ACBlocks.dreadlands_leaves = new BlockACLeaves(ACBlocks.dreadlands_sapling).setHardness(0.2F).setResistance(1.0F).setUnlocalizedName("dreadleaves");
		ACBlocks.dreadlands_planks = new BlockACBasic(Material.WOOD, 2.0F, 5.0F, SoundType.WOOD).setUnlocalizedName("dreadplanks");
		ACBlocks.dreaded_gateway = new BlockDreadlandsPortal().setUnlocalizedName("dreadportal");
		ACBlocks.dreaded_fire = new BlockDreadFire().setLightLevel(1.0F).setUnlocalizedName("dreadfire");
		ACBlocks.depths_ghoul_head = new BlockDGhead(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityDGhead(); }}.setUnlocalizedName("dghead");
		ACBlocks.liquid_coralium = new BlockCLiquid().setResistance(500.0F).setLightLevel(1.0F).setUnlocalizedName("cwater");
		ACBlocks.dreadstone = new BlockACBasic(Material.ROCK, "pickaxe", 4, 2.5F, 20.0F, SoundType.STONE).setUnlocalizedName("dreadstone");
		ACBlocks.abyssalnite_stone = new BlockACBasic(Material.ROCK, "pickaxe", 4, 2.5F, 20.0F, SoundType.STONE).setUnlocalizedName("abydreadstone");
		ACBlocks.dreadlands_grass = new BlockDreadGrass().setHardness(0.4F).setUnlocalizedName("dreadgrass");
		ACBlocks.pete_head = new BlockDGhead(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityPhead(); }}.setUnlocalizedName("phead");
		ACBlocks.mr_wilson_head = new BlockDGhead(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityWhead(); }}.setUnlocalizedName("whead");
		ACBlocks.dr_orange_head = new BlockDGhead(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityOhead(); }}.setUnlocalizedName("ohead");
		ACBlocks.dreadstone_brick_stairs = new BlockACStairs(ACBlocks.dreadstone_brick, "pickaxe", 4).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("dreadbrickstairs");
		ACBlocks.dreadstone_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 4, SoundType.STONE).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("dreadbrickfence");
		ACBlocks.dreadstone_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 4, SoundType.STONE).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("dreadbrickslab1");
		AbyssalCraft.dreadbrickslab2 = new BlockACDoubleSlab(ACBlocks.dreadstone_brick_slab, Material.ROCK, "pickaxe", 4).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("dreadbrickslab2");
		ACBlocks.abyssalnite_stone_brick_stairs = new BlockACStairs(ACBlocks.abyssalnite_stone_brick, "pickaxe", 4).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("abydreadbrickstairs");
		ACBlocks.abyssalnite_stone_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 4, SoundType.STONE).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("abydreadbrickfence");
		ACBlocks.abyssalnite_stone_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 4, SoundType.STONE).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("abydreadbrickslab1");
		AbyssalCraft.abydreadbrickslab2 = new BlockACDoubleSlab(ACBlocks.abyssalnite_stone_brick_slab, Material.ROCK, "pickaxe", 4).setHardness(2.5F).setResistance(20.0F).setUnlocalizedName("abydreadbrickslab2");
		ACBlocks.liquid_antimatter = new BlockAntiliquid().setResistance(500.0F).setLightLevel(0.5F).setUnlocalizedName("antiwater");
		ACBlocks.coralium_stone = new BlockCoraliumstone().setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstone");
		ACBlocks.coralium_stone_brick = new BlockACBasic(Material.ROCK, 1.5F, 10.0F, SoundType.STONE).setUnlocalizedName("cstonebrick");
		ACBlocks.coralium_stone_brick_fence = new BlockACFence(Material.ROCK, SoundType.STONE).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstonebrickfence");
		ACBlocks.coralium_stone_brick_slab = new BlockACSingleSlab(Material.ROCK, SoundType.STONE).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstonebrickslab1");
		AbyssalCraft.cstonebrickslab2 = new BlockACDoubleSlab(ACBlocks.coralium_stone_brick_slab, Material.ROCK).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstonebrickslab2");
		ACBlocks.coralium_stone_brick_stairs = new BlockACStairs(ACBlocks.coralium_stone_brick, "pickaxe", 0).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("cstonebrickstairs");
		ACBlocks.coralium_stone_button = new BlockACButton(false, "cstone").setHardness(0.6F).setResistance(12.0F).setUnlocalizedName("cstonebutton");
		ACBlocks.coralium_stone_pressure_plate = new BlockACPressureplate("cstone", Material.ROCK, BlockACPressureplate.Sensitivity.MOBS, SoundType.STONE).setHardness(0.6F).setResistance(12.0F).setUnlocalizedName("cstonepplate");
		ACBlocks.chagaroth_altar_top = new BlockDreadAltarTop().setHardness(30.0F).setResistance(300.0F).setCreativeTab(ACTabs.tabDecoration).setUnlocalizedName("dreadaltartop");
		ACBlocks.chagaroth_altar_bottom = new BlockDreadAltarBottom().setHardness(30.0F).setResistance(300.0F).setCreativeTab(ACTabs.tabDecoration).setUnlocalizedName("dreadaltarbottom");
		ACBlocks.crystallizer_idle = new BlockCrystallizer(false).setHardness(2.5F).setResistance(12.0F).setUnlocalizedName("crystallizer");
		ACBlocks.crystallizer_active = new BlockCrystallizer(true).setHardness(2.5F).setResistance(12.0F).setLightLevel(0.875F).setUnlocalizedName("crystallizer_on");
		ACBlocks.block_of_dreadium = new IngotBlock(6).setUnlocalizedName("dreadiumblock");
		ACBlocks.transmutator_idle = new BlockTransmutator(false).setHardness(2.5F).setResistance(12.0F).setUnlocalizedName("transmutator");
		ACBlocks.transmutator_active = new BlockTransmutator(true).setHardness(2.5F).setResistance(12.0F).setLightLevel(0.875F).setUnlocalizedName("transmutator_on");
		ACBlocks.dreadguard_spawner = new BlockDreadguardSpawner().setUnlocalizedName("dreadguardspawner");
		ACBlocks.chagaroth_spawner = new BlockChagarothSpawner().setUnlocalizedName("chagarothspawner");
		ACBlocks.dreadlands_wood_fence = new BlockACFence(Material.WOOD, SoundType.WOOD).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("drtfence");
		ACBlocks.nitre_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("nitreore");
		ACBlocks.abyssal_iron_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abyiroore");
		ACBlocks.abyssal_gold_ore = new BlockACOre(2, 5.0F, 10.0F).setUnlocalizedName("abygolore");
		ACBlocks.abyssal_diamond_ore = new BlockACOre(2, 5.0F, 10.0F).setUnlocalizedName("abydiaore");
		ACBlocks.abyssal_nitre_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abynitore");
		ACBlocks.abyssal_tin_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abytinore");
		ACBlocks.abyssal_copper_ore = new BlockACOre(2, 3.0F, 6.0F).setUnlocalizedName("abycopore");
		ACBlocks.pearlescent_coralium_ore = new BlockACOre(5, 8.0F, 10.0F).setUnlocalizedName("abypcorore");
		ACBlocks.liquified_coralium_ore = new BlockACOre(4, 10.0F, 12.0F).setUnlocalizedName("abylcorore");
		ACBlocks.solid_lava = new BlockSolidLava("solidlava");
		ACBlocks.ethaxium = new BlockACBasic(Material.ROCK, "pickaxe", 8, 100.0F, Float.MAX_VALUE, SoundType.STONE).setUnlocalizedName("ethaxium");
		ACBlocks.ethaxium_brick = new BlockEthaxiumBrick(100.0F).setUnlocalizedName("ethaxiumbrick");
		ACBlocks.ethaxium_pillar = new BlockEthaxiumPillar(100.0F).setUnlocalizedName("ethaxiumpillar");
		ACBlocks.ethaxium_brick_stairs = new BlockACStairs(ACBlocks.ethaxium_brick, "pickaxe", 8).setHardness(100.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumbrickstairs");
		ACBlocks.ethaxium_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 8, SoundType.STONE).setHardness(100.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumbrickslab1");
		AbyssalCraft.ethaxiumslab2 = new BlockACDoubleSlab(ACBlocks.ethaxium_brick_slab, Material.ROCK, "pickaxe", 8).setHardness(100.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumbrickslab2");
		ACBlocks.ethaxium_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 8, SoundType.STONE).setHardness(100.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumfence");
		ACBlocks.omothol_stone = new BlockACBasic(Material.ROCK, "pickaxe", 6, 10.0F, 12.0F, SoundType.STONE).setUnlocalizedName("omotholstone");
		ACBlocks.block_of_ethaxium = new IngotBlock(8).setResistance(Float.MAX_VALUE).setUnlocalizedName("ethaxiumblock");
		ACBlocks.omothol_gateway = new BlockOmotholPortal().setUnlocalizedName("omotholportal");
		ACBlocks.omothol_fire = new BlockOmotholFire().setLightLevel(1.0F).setUnlocalizedName("omotholfire");
		ACBlocks.engraver = new BlockEngraver().setHardness(2.5F).setResistance(12.0F).setUnlocalizedName("engraver");
		AbyssalCraft.house = new BlockHouse().setHardness(1.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("engraver_on");
		ACBlocks.materializer = new BlockMaterializer().setUnlocalizedName("materializer");
		ACBlocks.dark_ethaxium_brick = new BlockEthaxiumBrick(150.0F).setUnlocalizedName("darkethaxiumbrick");
		ACBlocks.dark_ethaxium_pillar = new BlockEthaxiumPillar(150.0F).setUnlocalizedName("darkethaxiumpillar");
		ACBlocks.dark_ethaxium_brick_stairs = new BlockACStairs(ACBlocks.dark_ethaxium_brick, "pickaxe", 8).setHardness(150.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrickstairs");
		ACBlocks.dark_ethaxium_brick_slab = new BlockACSingleSlab(Material.ROCK, "pickaxe", 8, SoundType.STONE).setHardness(150.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrickslab1");
		AbyssalCraft.darkethaxiumslab2 = new BlockACDoubleSlab(ACBlocks.dark_ethaxium_brick_slab, Material.ROCK, "pickaxe", 8).setHardness(150.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrickslab2");
		ACBlocks.dark_ethaxium_brick_fence = new BlockACFence(Material.ROCK, "pickaxe", 8, SoundType.STONE).setHardness(150.0F).setResistance(Float.MAX_VALUE).setUnlocalizedName("darkethaxiumbrickfence");
		ACBlocks.ritual_altar = new BlockRitualAltar().setUnlocalizedName("ritualaltar");
		ACBlocks.ritual_pedestal = new BlockRitualPedestal().setUnlocalizedName("ritualpedestal");
		ACBlocks.shoggoth_ooze = new BlockShoggothOoze().setUnlocalizedName("shoggothblock");
		ACBlocks.cthulhu_statue = new BlockStatue(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityCthulhuStatue(); }}.setUnlocalizedName("cthulhustatue");
		ACBlocks.hastur_statue = new BlockStatue(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityHasturStatue(); }}.setUnlocalizedName("hasturstatue");
		ACBlocks.jzahar_statue = new BlockStatue(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityJzaharStatue(); }}.setUnlocalizedName("jzaharstatue");
		ACBlocks.azathoth_statue = new BlockStatue(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityAzathothStatue(); }}.setUnlocalizedName("azathothstatue");
		ACBlocks.nyarlathotep_statue = new BlockStatue(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityNyarlathotepStatue(); }}.setUnlocalizedName("nyarlathotepstatue");
		ACBlocks.yog_sothoth_statue = new BlockStatue(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityYogsothothStatue(); }}.setUnlocalizedName("yogsothothstatue");
		ACBlocks.shub_niggurath_statue = new BlockStatue(){ @Override public TileEntity createNewTileEntity(World worldIn, int meta) { return new TileEntityShubniggurathStatue(); }}.setUnlocalizedName("shubniggurathstatue");
		ACBlocks.monolith_stone = new BlockACBasic(Material.ROCK, 6.0F, 24.0F, SoundType.STONE).setUnlocalizedName("monolithstone");
		ACBlocks.shoggoth_biomass = new BlockShoggothBiomass();
		ACBlocks.energy_pedestal = new BlockEnergyPedestal();
		ACBlocks.monolith_pillar = new BlockMonolithPillar();
		ACBlocks.sacrificial_altar = new BlockSacrificialAltar();
		ACBlocks.tiered_energy_pedestal = new BlockTieredEnergyPedestal();
		ACBlocks.tiered_sacrificial_altar = new BlockTieredSacrificialAltar();
		ACBlocks.jzahar_spawner = new BlockJzaharSpawner().setUnlocalizedName("jzaharspawner");
		ACBlocks.minion_of_the_gatekeeper_spawner = new BlockGatekeeperMinionSpawner().setUnlocalizedName("gatekeeperminionspawner");
		ACBlocks.mimic_fire = new BlockMimicFire().setUnlocalizedName("fire");
		ACBlocks.decorative_cthulhu_statue = new BlockDecorativeStatue().setUnlocalizedName("cthulhustatue");
		ACBlocks.decorative_hastur_statue = new BlockDecorativeStatue().setUnlocalizedName("hasturstatue");
		ACBlocks.decorative_jzahar_statue = new BlockDecorativeStatue().setUnlocalizedName("jzaharstatue");
		ACBlocks.decorative_azathoth_statue = new BlockDecorativeStatue().setUnlocalizedName("azathothstatue");
		ACBlocks.decorative_nyarlathotep_statue = new BlockDecorativeStatue().setUnlocalizedName("nyarlathotepstatue");
		ACBlocks.decorative_yog_sothoth_statue = new BlockDecorativeStatue().setUnlocalizedName("yogsothothstatue");
		ACBlocks.decorative_shub_niggurath_statue = new BlockDecorativeStatue().setUnlocalizedName("shubniggurathstatue");
		ACBlocks.crystal_cluster = new BlockCrystalCluster().setUnlocalizedName("crystalcluster");

		((BlockShoggothOoze) ACBlocks.shoggoth_ooze).initBlacklist();

		GameRegistry.registerTileEntity(TileEntityCrate.class, "tileEntityCrate");
		GameRegistry.registerTileEntity(TileEntityDGhead.class, "tileEntityDGhead");
		GameRegistry.registerTileEntity(TileEntityPhead.class, "tileEntityPhead");
		GameRegistry.registerTileEntity(TileEntityWhead.class, "tileEntityWhead");
		GameRegistry.registerTileEntity(TileEntityOhead.class, "tileEntityOhead");
		GameRegistry.registerTileEntity(TileEntityCrystallizer.class, "tileEntityCrystallizer");
		GameRegistry.registerTileEntity(TileEntityTransmutator.class, "tileEntityTransmutator");
		GameRegistry.registerTileEntity(TileEntityDreadguardSpawner.class, "tileEntityDradguardSpawner");
		GameRegistry.registerTileEntity(TileEntityChagarothSpawner.class, "tileEntityChagarothSpawner");
		GameRegistry.registerTileEntity(TileEntityEngraver.class, "tileEntityEngraver");
		GameRegistry.registerTileEntity(TileEntityMaterializer.class, "tileEntityMaterializer");
		GameRegistry.registerTileEntity(TileEntityRitualAltar.class, "tileEntityRitualAltar");
		GameRegistry.registerTileEntity(TileEntityRitualPedestal.class, "tileEntityRitualPedestal");
		GameRegistry.registerTileEntity(TileEntityCthulhuStatue.class, "tileEntityCthulhuStatue");
		GameRegistry.registerTileEntity(TileEntityHasturStatue.class, "tileEntityHasturStatue");
		GameRegistry.registerTileEntity(TileEntityJzaharStatue.class, "tileEntityJzaharStatue");
		GameRegistry.registerTileEntity(TileEntityAzathothStatue.class, "tileEntityAzathothStatue");
		GameRegistry.registerTileEntity(TileEntityNyarlathotepStatue.class, "tileEntityNyarlathotepStatue");
		GameRegistry.registerTileEntity(TileEntityYogsothothStatue.class, "tileEntityyogsothothStatue");
		GameRegistry.registerTileEntity(TileEntityShubniggurathStatue.class, "tileEntityShubniggurathStatue");
		GameRegistry.registerTileEntity(TileEntityShoggothBiomass.class, "tileEntityShoggothBiomass");
		GameRegistry.registerTileEntity(TileEntityEnergyPedestal.class, "tileEntityEnergyPedestal");
		GameRegistry.registerTileEntity(TileEntitySacrificialAltar.class, "tileEntitySacrificialAltar");
		GameRegistry.registerTileEntity(TileEntityTieredEnergyPedestal.class, "tileEntityTieredEnergyPedestal");
		GameRegistry.registerTileEntity(TileEntityTieredSacrificialAltar.class, "tileEntityTieredSacrificialAltar");
		GameRegistry.registerTileEntity(TileEntityJzaharSpawner.class, "tileEntityJzaharSpawner");
		GameRegistry.registerTileEntity(TileEntityGatekeeperMinionSpawner.class, "tileEntityGatekeeperMinionSpawner");

		registerBlock(ACBlocks.darkstone, "darkstone");
		registerBlock(ACBlocks.darkstone_cobblestone, "darkstone_cobble");
		registerBlock(ACBlocks.darkstone_brick, "darkstone_brick");
		registerBlock(ACBlocks.glowing_darkstone_bricks, "dsglow");
		registerBlock(ACBlocks.darkstone_brick_slab, new ItemDarkbrickSlab(ACBlocks.darkstone_brick_slab), "darkbrickslab1");
		registerBlock(AbyssalCraft.Darkbrickslab2, new ItemDarkbrickSlab(AbyssalCraft.Darkbrickslab2), "darkbrickslab2");
		registerBlock(ACBlocks.darkstone_cobblestone_slab, new ItemDarkcobbleSlab(ACBlocks.darkstone_cobblestone_slab), "darkcobbleslab1");
		registerBlock(AbyssalCraft.Darkcobbleslab2, new ItemDarkcobbleSlab(AbyssalCraft.Darkcobbleslab2), "darkcobbleslab2");
		registerBlock(ACBlocks.darklands_grass, "darkgrass");
		registerBlock(ACBlocks.darkstone_brick_stairs, "dbstairs");
		registerBlock(ACBlocks.darkstone_cobblestone_stairs, "dcstairs");
		registerBlock(ACBlocks.darklands_oak_leaves, "dltleaves");
		registerBlock(ACBlocks.darklands_oak_wood, "dltlog");
		registerBlock(ACBlocks.darklands_oak_sapling, "dltsapling");
		registerBlock(ACBlocks.abyssal_stone, new ItemBlockColorName(ACBlocks.abyssal_stone), "abystone");
		registerBlock(ACBlocks.abyssal_stone_brick, new ItemBlockColorName(ACBlocks.abyssal_stone_brick), "abybrick");
		registerBlock(ACBlocks.abyssal_stone_brick_slab, new ItemAbySlab(ACBlocks.abyssal_stone_brick_slab), "abyslab1");
		registerBlock(AbyssalCraft.abyslab2, new ItemAbySlab(AbyssalCraft.abyslab2), "abyslab2");
		registerBlock(ACBlocks.abyssal_stone_brick_stairs, new ItemBlockColorName(ACBlocks.abyssal_stone_brick_stairs), "abystairs");
		registerBlock(ACBlocks.coralium_ore, "coraliumore");
		registerBlock(ACBlocks.abyssalnite_ore, "abyore");
		registerBlock(ACBlocks.abyssal_stone_brick_fence, new ItemBlockColorName(ACBlocks.abyssal_stone_brick_fence), "abyfence");
		registerBlock(ACBlocks.darkstone_cobblestone_wall, "dscwall");
		registerBlock(ACBlocks.oblivion_deathbomb, new ItemODB(ACBlocks.oblivion_deathbomb), "odb");
		registerBlock(ACBlocks.block_of_abyssalnite, new ItemBlockColorName(ACBlocks.block_of_abyssalnite), "abyblock");
		registerBlock(ACBlocks.coralium_infused_stone, "coraliumstone");
		registerBlock(ACBlocks.odb_core, new ItemBlockColorName(ACBlocks.odb_core), "odbcore");
		registerBlock(ACBlocks.wooden_crate, "crate");
		registerBlock(ACBlocks.abyssal_gateway, "abyportal");
		registerBlock(ACBlocks.darkstone_slab, new ItemDarkstoneSlab(ACBlocks.darkstone_slab), "darkstoneslab1");
		registerBlock(AbyssalCraft.Darkstoneslab2, new ItemDarkstoneSlab(AbyssalCraft.Darkstoneslab2), "darkstoneslab2");
		registerBlock(ACBlocks.coralium_fire, "coraliumfire");
		registerBlock(ACBlocks.darkstone_button, "dsbutton");
		registerBlock(ACBlocks.darkstone_pressure_plate, "dspplate");
		registerBlock(ACBlocks.darklands_oak_planks, "dltplank");
		registerBlock(ACBlocks.darklands_oak_button, "dltbutton");
		registerBlock(ACBlocks.darklands_oak_pressure_plate, "dltpplate");
		registerBlock(ACBlocks.darklands_oak_stairs, "dltstairs");
		registerBlock(ACBlocks.darklands_oak_slab, new ItemDLTSlab(ACBlocks.darklands_oak_slab), "dltslab1");
		registerBlock(AbyssalCraft.DLTslab2, new ItemDLTSlab(AbyssalCraft.DLTslab2), "dltslab2");
		registerBlock(ACBlocks.liquid_coralium, "cwater");
		registerBlock(ACBlocks.block_of_coralium, new ItemBlockColorName(ACBlocks.block_of_coralium), "corblock");
		registerBlock(ACBlocks.dreadlands_infused_powerstone, "psdl");
		registerBlock(ACBlocks.abyssal_coralium_ore, "abycorore");
		registerBlock(AbyssalCraft.Altar, "altar");
		registerBlock(ACBlocks.abyssal_stone_button, new ItemBlockColorName(ACBlocks.abyssal_stone_button), "abybutton");
		registerBlock(ACBlocks.abyssal_stone_pressure_plate, new ItemBlockColorName(ACBlocks.abyssal_stone_pressure_plate), "abypplate");
		registerBlock(ACBlocks.darkstone_brick_fence, "dsbfence");
		registerBlock(ACBlocks.darklands_oak_fence, "dltfence");
		registerBlock(ACBlocks.dreadstone, "dreadstone");
		registerBlock(ACBlocks.abyssalnite_stone, "abydreadstone");
		registerBlock(ACBlocks.dreadlands_abyssalnite_ore, "abydreadore");
		registerBlock(ACBlocks.dreaded_abyssalnite_ore, "dreadore");
		registerBlock(ACBlocks.dreadstone_brick, "dreadbrick");
		registerBlock(ACBlocks.abyssalnite_stone_brick, "abydreadbrick");
		registerBlock(ACBlocks.dreadlands_grass, "dreadgrass");
		registerBlock(ACBlocks.dreadlands_log, "dreadlog");
		registerBlock(ACBlocks.dreadlands_leaves, "dreadleaves");
		registerBlock(ACBlocks.dreadlands_sapling, "dreadsapling");
		registerBlock(ACBlocks.dreadlands_planks, "dreadplanks");
		registerBlock(ACBlocks.dreaded_gateway, "dreadportal");
		registerBlock(ACBlocks.dreaded_fire, "dreadfire");
		registerBlock(ACBlocks.depths_ghoul_head, "dghead");
		registerBlock(ACBlocks.pete_head, "phead");
		registerBlock(ACBlocks.mr_wilson_head, "whead");
		registerBlock(ACBlocks.dr_orange_head, "ohead");
		registerBlock(ACBlocks.dreadstone_brick_stairs, "dreadbrickstairs");
		registerBlock(ACBlocks.dreadstone_brick_fence, "dreadbrickfence");
		registerBlock(ACBlocks.dreadstone_brick_slab, new ItemDreadbrickSlab(ACBlocks.dreadstone_brick_slab), "dreadbrickslab1");
		registerBlock(AbyssalCraft.dreadbrickslab2, new ItemDreadbrickSlab(AbyssalCraft.dreadbrickslab2), "dreadbrickslab2");
		registerBlock(ACBlocks.abyssalnite_stone_brick_stairs, "abydreadbrickstairs");
		registerBlock(ACBlocks.abyssalnite_stone_brick_fence, "abydreadbrickfence");
		registerBlock(ACBlocks.abyssalnite_stone_brick_slab, new ItemAbyDreadbrickSlab(ACBlocks.abyssalnite_stone_brick_slab), "abydreadbrickslab1");
		registerBlock(AbyssalCraft.abydreadbrickslab2, new ItemAbyDreadbrickSlab(AbyssalCraft.abydreadbrickslab2), "abydreadbrickslab2");
		registerBlock(ACBlocks.liquid_antimatter, "antiwater");
		registerBlock(ACBlocks.coralium_stone, "cstone");
		registerBlock(ACBlocks.coralium_stone_brick, "cstonebrick");
		registerBlock(ACBlocks.coralium_stone_brick_fence, "cstonebrickfence");
		registerBlock(ACBlocks.coralium_stone_brick_slab, new ItemCstonebrickSlab(ACBlocks.coralium_stone_brick_slab), "cstonebrickslab1");
		registerBlock(AbyssalCraft.cstonebrickslab2, new ItemCstonebrickSlab(AbyssalCraft.cstonebrickslab2), "cstonebrickslab2");
		registerBlock(ACBlocks.coralium_stone_brick_stairs, "cstonebrickstairs");
		registerBlock(ACBlocks.coralium_stone_button, "cstonebutton");
		registerBlock(ACBlocks.coralium_stone_pressure_plate, "cstonepplate");
		registerBlock(ACBlocks.chagaroth_altar_top, "dreadaltartop");
		registerBlock(ACBlocks.chagaroth_altar_bottom, "dreadaltarbottom");
		registerBlock(ACBlocks.crystallizer_idle, "crystallizer");
		registerBlock(ACBlocks.crystallizer_active, "crystallizer_on");
		registerBlock(ACBlocks.block_of_dreadium, new ItemBlockColorName(ACBlocks.block_of_dreadium), "dreadiumblock");
		registerBlock(ACBlocks.transmutator_idle, "transmutator");
		registerBlock(ACBlocks.transmutator_active, "transmutator_on");
		registerBlock(ACBlocks.dreadguard_spawner, "dreadguardspawner");
		registerBlock(ACBlocks.chagaroth_spawner, "chagarothspawner");
		registerBlock(ACBlocks.dreadlands_wood_fence, "drtfence");
		registerBlock(ACBlocks.nitre_ore, "nitreore");
		registerBlock(ACBlocks.abyssal_iron_ore, "abyiroore");
		registerBlock(ACBlocks.abyssal_gold_ore, "abygolore");
		registerBlock(ACBlocks.abyssal_diamond_ore, "abydiaore");
		registerBlock(ACBlocks.abyssal_nitre_ore, "abynitore");
		registerBlock(ACBlocks.abyssal_tin_ore, "abytinore");
		registerBlock(ACBlocks.abyssal_copper_ore, "abycopore");
		registerBlock(ACBlocks.pearlescent_coralium_ore, "abypcorore");
		registerBlock(ACBlocks.liquified_coralium_ore, "abylcorore");
		registerBlock(ACBlocks.solid_lava, "solidlava");
		registerBlock(ACBlocks.ethaxium, new ItemBlockColorName(ACBlocks.ethaxium), "ethaxium");
		registerBlock(ACBlocks.ethaxium_brick, new ItemMetadataBlock(ACBlocks.ethaxium_brick), "ethaxiumbrick");
		registerBlock(ACBlocks.ethaxium_pillar, new ItemBlockColorName(ACBlocks.ethaxium_pillar), "ethaxiumpillar");
		registerBlock(ACBlocks.ethaxium_brick_stairs, new ItemBlockColorName(ACBlocks.ethaxium_brick_stairs), "ethaxiumbrickstairs");
		registerBlock(ACBlocks.ethaxium_brick_slab, new ItemEthaxiumSlab(ACBlocks.ethaxium_brick_slab), "ethaxiumbrickslab1");
		registerBlock(AbyssalCraft.ethaxiumslab2, new ItemEthaxiumSlab(AbyssalCraft.ethaxiumslab2), "ethaxiumbrickslab2");
		registerBlock(ACBlocks.ethaxium_brick_fence, new ItemBlockColorName(ACBlocks.ethaxium_brick_fence), "ethaxiumfence");
		registerBlock(ACBlocks.block_of_ethaxium, new ItemBlockColorName(ACBlocks.block_of_ethaxium), "ethaxiumblock");
		registerBlock(ACBlocks.omothol_stone, "omotholstone");
		registerBlock(ACBlocks.omothol_gateway, "omotholportal");
		registerBlock(ACBlocks.omothol_fire, "omotholfire");
		registerBlock(ACBlocks.engraver, "engraver");
		registerBlock(AbyssalCraft.house, "engraver_on");
		registerBlock(ACBlocks.materializer, "materializer");
		registerBlock(ACBlocks.dark_ethaxium_brick, new ItemMetadataBlock(ACBlocks.dark_ethaxium_brick), "darkethaxiumbrick");
		registerBlock(ACBlocks.dark_ethaxium_pillar, new ItemBlockColorName(ACBlocks.dark_ethaxium_pillar), "darkethaxiumpillar");
		registerBlock(ACBlocks.dark_ethaxium_brick_stairs, new ItemBlockColorName(ACBlocks.dark_ethaxium_brick_stairs), "darkethaxiumbrickstairs");
		registerBlock(ACBlocks.dark_ethaxium_brick_slab, new ItemDarkEthaxiumSlab(ACBlocks.dark_ethaxium_brick_slab), "darkethaxiumbrickslab1");
		registerBlock(AbyssalCraft.darkethaxiumslab2, new ItemDarkEthaxiumSlab(AbyssalCraft.darkethaxiumslab2), "darkethaxiumbrickslab2");
		registerBlock(ACBlocks.dark_ethaxium_brick_fence, new ItemBlockColorName(ACBlocks.dark_ethaxium_brick_fence), "darkethaxiumbrickfence");
		registerBlock(ACBlocks.ritual_altar, new ItemRitualBlock(ACBlocks.ritual_altar), "ritualaltar");
		registerBlock(ACBlocks.ritual_pedestal, new ItemRitualBlock(ACBlocks.ritual_pedestal), "ritualpedestal");
		registerBlock(ACBlocks.shoggoth_ooze, "shoggothblock");
		registerBlock(ACBlocks.cthulhu_statue, "cthulhustatue");
		registerBlock(ACBlocks.hastur_statue, "hasturstatue");
		registerBlock(ACBlocks.jzahar_statue, "jzaharstatue");
		registerBlock(ACBlocks.azathoth_statue, "azathothstatue");
		registerBlock(ACBlocks.nyarlathotep_statue, "nyarlathotepstatue");
		registerBlock(ACBlocks.yog_sothoth_statue, "yogsothothstatue");
		registerBlock(ACBlocks.shub_niggurath_statue, "shubniggurathstatue");
		registerBlock(ACBlocks.monolith_stone, "monolithstone");
		registerBlock(ACBlocks.shoggoth_biomass, "shoggothbiomass");
		registerBlock(ACBlocks.energy_pedestal, "energypedestal");
		registerBlock(ACBlocks.monolith_pillar, "monolithpillar");
		registerBlock(ACBlocks.sacrificial_altar, "sacrificialaltar");
		registerBlock(ACBlocks.tiered_energy_pedestal, new ItemMetadataBlock(ACBlocks.tiered_energy_pedestal), "tieredenergypedestal");
		registerBlock(ACBlocks.tiered_sacrificial_altar, new ItemMetadataBlock(ACBlocks.tiered_sacrificial_altar), "tieredsacrificialaltar");
		registerBlock(ACBlocks.jzahar_spawner, "jzaharspawner");
		registerBlock(ACBlocks.minion_of_the_gatekeeper_spawner, "gatekeeperminionspawner");
		registerBlock(ACBlocks.mimic_fire, "fire");
		registerBlock(ACBlocks.decorative_cthulhu_statue, new ItemDecorativeStatueBlock(ACBlocks.decorative_cthulhu_statue), "decorativecthulhustatue");
		registerBlock(ACBlocks.decorative_hastur_statue, new ItemDecorativeStatueBlock(ACBlocks.decorative_hastur_statue), "decorativehasturstatue");
		registerBlock(ACBlocks.decorative_jzahar_statue, new ItemDecorativeStatueBlock(ACBlocks.decorative_jzahar_statue), "decorativejzaharstatue");
		registerBlock(ACBlocks.decorative_azathoth_statue, new ItemDecorativeStatueBlock(ACBlocks.decorative_azathoth_statue), "decorativeazathothstatue");
		registerBlock(ACBlocks.decorative_nyarlathotep_statue, new ItemDecorativeStatueBlock(ACBlocks.decorative_nyarlathotep_statue), "decorativenyarlathotepstatue");
		registerBlock(ACBlocks.decorative_yog_sothoth_statue, new ItemDecorativeStatueBlock(ACBlocks.decorative_yog_sothoth_statue), "decorativeyogsothothstatue");
		registerBlock(ACBlocks.decorative_shub_niggurath_statue, new ItemDecorativeStatueBlock(ACBlocks.decorative_shub_niggurath_statue), "decorativeshubniggurathstatue");
		registerBlock(ACBlocks.crystal_cluster, new ItemCrystalClusterBlock(ACBlocks.crystal_cluster), "crystalcluster");
	}

	@Override
	public void init(FMLInitializationEvent event) {
		AbyssalCraftAPI.addCrystal(new ItemStack(ACBlocks.crystal_cluster, 1, OreDictionary.WILDCARD_VALUE));
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		((BlockCLiquid) ACBlocks.liquid_coralium).addBlocks();
	}

	private static void registerItem(Item item, String name){
		GameRegistry.register(item.setRegistryName(new ResourceLocation(AbyssalCraft.modid, name)));
	}

	private static void registerBlock(Block block, String name){
		registerBlock(block, new ItemBlock(block), name);
	}

	private static void registerBlock(Block block, ItemBlock item, String name){
		GameRegistry.register(block.setRegistryName(new ResourceLocation(AbyssalCraft.modid, name)));
		registerItem(item, name);
	}
}
