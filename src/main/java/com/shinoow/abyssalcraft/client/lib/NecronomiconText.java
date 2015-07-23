/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2015 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.client.lib;

import net.minecraft.util.StatCollector;

/**
 * That one place where you keep a billion Strings representing stuff
 * @author shinoow
 *
 */
public class NecronomiconText {

	public static String NECRONOMICON_PAGE_1 = translate("necronomicon.text.necronomicon.1");
	public static String NECRONOMICON_PAGE_2 = translate("necronomicon.text.necronomicon.2");
	public static String NECRONOMICON_PAGE_3 = translate("necronomicon.text.necronomicon.3");
	public static String NECRONOMICON_PAGE_4 = translate("necronomicon.text.necronomicon.4");

	public static String ABYSSALNOMICON_PAGE_1 = translate("necronomicon.text.abyssalnomicon.1");
	public static String ABYSSALNOMICON_PAGE_2 = translate("necronomicon.text.abyssalnomicon.2");

	public static String INFORMATION_ABYSSALCRAFT_PAGE_1 = translate("necronomicon.text.abyssalcraft.1");
	public static String INFORMATION_ABYSSALCRAFT_PAGE_2 = translate("necronomicon.text.abyssalcraft.2");
	public static String INFORMATION_ABYSSALCRAFT_PAGE_3 = translate("necronomicon.text.abyssalcraft.3");
	public static String INFORMATION_ABYSSALCRAFT_PAGE_4 = translate("necronomicon.text.abyssalcraft.4");

	public static String AZATHOTH_1 = translate("necronomicon.text.azathoth.1");
	public static String AZATHOTH_2 = translate("necronomicon.text.azathoth.2");
	public static String NYARLATHOTEP_1 = translate("necronomicon.text.nyarlathotep.1");
	public static String NYARLATHOTEP_2 = translate("necronomicon.text.nyarlathotep.2");
	public static String YOG_SOTHOTH_1 = translate("necronomicon.text.yog-sothoth.1");
	public static String YOG_SOTHOTH_2 = translate("necronomicon.text.yog-sothoth.1");
	public static String SHUB_NIGGURATH_1 = translate("necronomicon.text.shub-niggurath.1");
	public static String SHUB_NIGGURATH_2 = translate("necronomicon.text.shub-niggurath.2");
	public static String CTHULHU_1 = translate("necronomicon.text.cthulhu.1");
	public static String CTHULHU_2 = translate("necronomicon.text.cthulhu.2");
	public static String HASTUR_1 = translate("necronomicon.text.hastur.1");
	public static String HASTUR_2 = translate("necronomicon.text.hastur.2");
	public static String JZAHAR_1 = translate("necronomicon.text.jzahar.1");
	public static String JZAHAR_2 = translate("necronomicon.text.jzahar.2");

	public static String INFORMATION_GREAT_OLD_ONES = translate("necronomicon.text.greatoldones");

	public static String INFORMATION_ABYSSALNOMICON = translate("necronomicon.text.abyssalnomicon_info");

	public static String INFORMATION_INTEGRATION = translate("necronomicon.text.integration");

	public static String INFORMATION_OVERWORLD = translate("necronomicon.text.overworld");
	public static String INFORMATION_ABYSSAL_WASTELAND = translate("necronomicon.text.abyssal");
	public static String INFORMATION_DREADLANDS = translate("necronomicon.text.dreadlands");
	public static String INFORMATION_OMOTHOL = translate("necronomicon.text.omothol");
	public static String INFORMATION_DARK_REALM = translate("necronomicon.text.darkrealm");

	public static String MATERIAL_ABYSSALNITE_1 = translate("necronomicon.text.materials.abyssalnite.1");
	public static String MATERIAL_ABYSSALNITE_2 = translate("necronomicon.text.materials.abyssalnite.2");
	public static String MATERIAL_DARKSTONE_1 = translate("necronomicon.text.materials.darkstone.1");
	public static String MATERIAL_DARKSTONE_2 = translate("necronomicon.text.materials.darkstone.2");
	public static String MATERIAL_CORALIUM_1 = translate("necronomicon.text.materials.coralium.1");
	public static String MATERIAL_CORALIUM_2 = translate("necronomicon.text.materials.coralium.2");
	public static String MATERIAL_DARKLANDS_OAK_1 = translate("necronomicon.text.materials.darklandsoak.1");
	public static String MATERIAL_DARKLANDS_OAK_2 = translate("necronomicon.text.materials.darklandsoak.2");
	public static String MATERIAL_NITRE_1 = translate("necronomicon.text.materials.nitre.1");
	public static String MATERIAL_NITRE_2 = translate("necronomicon.text.materials.nitre.2");
	public static String MATERIAL_LIQUID_ANTIMATTER_1 = translate("necronomicon.text.materials.liquidantimatter.1");
	public static String MATERIAL_LIQUID_ANTIMATTER_2 = translate("necronomicon.text.materials.liquidantimatter.2");
	public static String MATERIAL_DARKLANDS_GRASS_1 = translate("necronomicon.text.materials.darklandsgrass.1");
	public static String MATERIAL_DARKLANDS_GRASS_2 = translate("necronomicon.text.materials.darklandsgrass.2");
	public static String MATERIAL_ABYSSAL_STONE_1 = translate("necronomicon.text.materials.abyssalstone.1");
	public static String MATERIAL_ABYSSAL_STONE_2 = translate("necronomicon.text.materials.abyssalstone.2");
	public static String MATERIAL_ABYSSAL_ORES_1 = translate("necronomicon.text.materials.abyssalores.1");
	public static String MATERIAL_ABYSSAL_ORES_2 = translate("necronomicon.text.materials.abyssalores.2");
	public static String MATERIAL_ABYSSAL_CORALIUM_1 = translate("necronomicon.text.materials.abyssalcoralium.1");
	public static String MATERIAL_ABYSSAL_CORALIUM_2 = translate("necronomicon.text.materials.abyssalcoralium.2");
	public static String MATERIAL_LIQUIFIED_CORALIUM_1 = translate("necronomicon.text.materials.liquifiedcoralium.1");
	public static String MATERIAL_LIQUIFIED_CORALIUM_2 = translate("necronomicon.text.materials.liquifiedcoralium.2");
	public static String MATERIAL_PEARLESCENT_CORALIUM_1 = translate("necronomicon.text.materials.pearlescentcoralium.1");
	public static String MATERIAL_PEARLESCENT_CORALIUM_2 = translate("necronomicon.text.materials.pearlescentcoralium.2");
	public static String MATERIAL_LIQUID_CORALIUM_1 = translate("necronomicon.text.materials.liquidcoralium.1");
	public static String MATERIAL_LIQUID_CORALIUM_2 = translate("necronomicon.text.materials.liquidcoralium.2");
	public static String MATERIAL_DREADLANDS_INFUSED_POWERSTONE_1 = translate("necronomicon.text.materials.powerstonedreadlands.1");
	public static String MATERIAL_DREADLANDS_INFUSED_POWERSTONE_2 = translate("necronomicon.text.materials.powerstonedreadlands.2");
	public static String MATERIAL_DREADSTONE_1 = translate("necronomicon.text.materials.dreadstone.1");
	public static String MATERIAL_DREADSTONE_2 = translate("necronomicon.text.materials.dreadstone.2");
	public static String MATERIAL_ABYSSALNITE_STONE_1 = translate("necronomicon.text.materials.abyssalnitestone.1");
	public static String MATERIAL_ABYSSALNITE_STONE_2 = translate("necronomicon.text.materials.abyssalnitestone.2");
	public static String MATERIAL_DREADLANDS_ABYSSALNITE_1 = translate("necronomicon.text.materials.dreadlandsabyssalnite.1");
	public static String MATERIAL_DREADLANDS_ABYSSALNITE_2 = translate("necronomicon.text.materials.dreadlandsabyssalnite.2");
	public static String MATERIAL_DREADED_ABYSSALNITE_1 = translate("necronomicon.text.materials.dreadedabyssalnite.1");
	public static String MATERIAL_DREADED_ABYSSALNITE_2 = translate("necronomicon.text.materials.dreadedabyssalnite.2");
	public static String MATERIAL_DREADLANDS_GRASS_1 = translate("necronomicon.text.materials.dreadlandsgrass.1");
	public static String MATERIAL_DREADLANDS_GRASS_2 = translate("necronomicon.text.materials.dreadlandsgrass.2");
	public static String MATERIAL_DREADLANDS_TREE_1 = translate("necronomicon.text.materials.dreadlandstree.1");
	public static String MATERIAL_DREADLANDS_TREE_2 = translate("necronomicon.text.materials.dreadlandstree.2");
	public static String MATERIAL_OMOTHOL_STONE_1 = translate("necronomicon.text.materials.omotholstone.1");
	public static String MATERIAL_OMOTHOL_STONE_2 = translate("necronomicon.text.materials.omotholstone.2");
	public static String MATERIAL_ETHAXIUM_1 = translate("necronomicon.text.materials.ethaxium.1");
	public static String MATERIAL_ETHAXIUM_2 = translate("necronomicon.text.materials.ethaxium.2");
	public static String MATERIAL_DARK_ETHAXIUM_1 = translate("necronomicon.text.materials.darkethaxium.1");
	public static String MATERIAL_DARK_ETHAXIUM_2 = translate("necronomicon.text.materials.darkethaxium.2");

	public static String CRAFTING_CORALIUM_INFUSED_STONE_1 = translate("necronomicon.text.crafting.coraliuminfusedstone.1");
	public static String CRAFTING_CORALIUM_INFUSED_STONE_2 = translate("necronomicon.text.crafting.coraliuminfusedstone.2");
	public static String CRAFTING_SHADOW_GEM_1 = translate("necronomicon.text.crafting.shadowgem.1");
	public static String CRAFTING_SHADOW_GEM_2 = translate("necronomicon.text.crafting.shadowgem.2");
	public static String CRAFTING_SHARD_OF_OBLIVION = translate("necronomicon.text.crafting.oblivionshard");
	public static String CRAFTING_GATEWAY_KEY = translate("necronomicon.text.crafting.gk1");
	public static String CRAFTING_NECRONOMICON_C = translate("necronomicon.text.crafting.necro_c");
	public static String CRAFTING_ALTAR_1 = translate("necronomicon.text.crafting.altar.1");
	public static String CRAFTING_ALTAR_2 = translate("necronomicon.text.crafting.altar.2");
	public static String CRAFTING_POWERSTONE_TRACKER = translate("necronomicon.text.crafting.psdltracker");
	public static String CRAFTING_ASORAH_GATEWAY_KEY = translate("necronomicon.text.crafting.gk2");
	public static String CRAFTING_NECRONOMICON_D = translate("necronomicon.text.crafting.necro_d");
	public static String CRAFTING_TRANSMUTATOR_1 = translate("necronomicon.text.crafting.transmutator.1");
	public static String CRAFTING_TRANSMUTATOR_2 = translate("necronomicon.text.crafting.transmutator.2");
	public static String CRAFTING_CRYSTALLIZER_1 = translate("necronomicon.text.crafting.crystallizer.1");
	public static String CRAFTING_CRYSTALLIZER_2 = translate("necronomicon.text.crafting.crystallizer.2");
	public static String CRAFTING_DREAD_ALTAR_BOTTOM_1 = translate("necronomicon.text.crafting.dreadaltarbot.1");
	public static String CRAFTING_DREAD_ALTAR_BOTTOM_2 = translate("necronomicon.text.crafting.dreadaltarbot.2");
	public static String CRAFTING_DREAD_ALTAR_TOP = translate("necronomicon.text.crafting.dreadaltartop");
	public static String CRAFTING_NECRONOMICON_O = translate("necronomicon.text.crafting.necro_o");
	public static String CRAFTING_LIFE_CRYSTAL_1 = translate("necronomicon.text.crafting.lifecrystal.1");
	public static String CRAFTING_LIFE_CRYSTAL_2 = translate("necronomicon.text.crafting.lifecrystal.2");
	public static String CRAFTING_ETHAXIUM_INGOT_1 = translate("necronomicon.text.crafting.ethaxiumingot.1");
	public static String CRAFTING_ETHAXIUM_INGOT_2 = translate("necronomicon.text.crafting.ethaxiumingot.2");
	public static String CRAFTING_BLANK_ENGRAVING_1 = translate("necronomicon.text.crafting.engravingblank.1");
	public static String CRAFTING_BLANK_ENGRAVING_2 = translate("necronomicon.text.crafting.engravingblank.2");
	public static String CRAFTING_COIN = translate("necronomicon.text.crafting.coin");
	public static String CRAFTING_ENGRAVER = translate("necronomicon.text.crafting.engraver");
	public static String CRAFTING_CRYSTAL_BAG_1 = translate("necronomicon.text.crafting.crystalbag.1");
	public static String CRAFTING_CRYSTAL_BAG_2 = translate("necronomicon.text.crafting.crystalbag.2");
	public static String CRAFTING_MATERIALIZER_1 = translate("necronomicon.text.crafting.materializer.1");
	public static String CRAFTING_MATERIALIZER_2 = translate("necronomicon.text.crafting.materializer.2");
	public static String CRAFTING_ABYSSALNOMICON_1 = translate("necronomicon.text.crafting.abyssalnomicon.1");
	public static String CRAFTING_ABYSSALNOMICON_2 = translate("necronomicon.text.crafting.abyssalnomicon.2");

	public static String PROGRESSION_OVERWORLD_1 = translate("necronomicon.text.overworld.progression.1");
	public static String PROGRESSION_OVERWORLD_2 = translate("necronomicon.text.overworld.progression.2");
	public static String PROGRESSION_OVERWORLD_3 = translate("necronomicon.text.overworld.progression.3");
	public static String PROGRESSION_OVERWORLD_4 = translate("necronomicon.text.overworld.progression.4");
	public static String PROGRESSION_OVERWORLD_5 = translate("necronomicon.text.overworld.progression.5");
	public static String PROGRESSION_OVERWORLD_6 = translate("necronomicon.text.overworld.progression.6");

	public static String PROGRESSION_ABYSSAL_1 = translate("necronomicon.text.abyssal.progression.1");
	public static String PROGRESSION_ABYSSAL_2 = translate("necronomicon.text.abyssal.progression.2");
	public static String PROGRESSION_ABYSSAL_3 = translate("necronomicon.text.abyssal.progression.3");
	public static String PROGRESSION_ABYSSAL_4 = translate("necronomicon.text.abyssal.progression.4");
	public static String PROGRESSION_ABYSSAL_5 = translate("necronomicon.text.abyssal.progression.5");
	public static String PROGRESSION_ABYSSAL_6 = translate("necronomicon.text.abyssal.progression.6");

	public static String PROGRESSION_DREADLANDS_1 = translate("necronomicon.text.dreadlands.progression.1");
	public static String PROGRESSION_DREADLANDS_2 = translate("necronomicon.text.dreadlands.progression.2");
	public static String PROGRESSION_DREADLANDS_3 = translate("necronomicon.text.dreadlands.progression.3");
	public static String PROGRESSION_DREADLANDS_4 = translate("necronomicon.text.dreadlands.progression.4");
	public static String PROGRESSION_DREADLANDS_5 = translate("necronomicon.text.dreadlands.progression.5");
	public static String PROGRESSION_DREADLANDS_6 = translate("necronomicon.text.dreadlands.progression.6");

	public static String PROGRESSION_OMOTHOL_1 = translate("necronomicon.text.omothol.progression.1");
	public static String PROGRESSION_OMOTHOL_2 = translate("necronomicon.text.omothol.progression.2");
	public static String PROGRESSION_OMOTHOL_3 = translate("necronomicon.text.omothol.progression.3");
	public static String PROGRESSION_OMOTHOL_4 = translate("necronomicon.text.omothol.progression.4");
	public static String PROGRESSION_OMOTHOL_5 = translate("necronomicon.text.omothol.progression.5");
	public static String PROGRESSION_OMOTHOL_6 = translate("necronomicon.text.omothol.progression.6");

	public static String PROGRESSION_DARK_REALM_1 = translate("necronomicon.text.darkrealm.progression.1");
	public static String PROGRESSION_DARK_REALM_2 = translate("necronomicon.text.darkrealm.progression.2");

	public static String ENTITY_ANTI_1 = translate("necronomicon.text.entity.anti.1");
	public static String ENTITY_ANTI_2 = translate("necronomicon.text.entity.anti.2");
	public static String ENTITY_EVIL_PIG_1 = translate("necronomicon.text.entity.evilpig.1");
	public static String ENTITY_EVIL_PIG_2 = translate("necronomicon.text.entity.evilpig.2");
	public static String ENTITY_ABYSSAL_ZOMBIE_1 = translate("necronomicon.text.entity.abyssalzombie.1");
	public static String ENTITY_ABYSSAL_ZOMBIE_2 = translate("necronomicon.text.entity.abyssalzombie.2");
	public static String ENTITY_DEPTHS_GHOUL_1 = translate("necronomicon.text.entity.depthsghoul.1");
	public static String ENTITY_DEPTHS_GHOUL_2 = translate("necronomicon.text.entity.depthsghoul.2");
	public static String ENTITY_SKELETON_GOLIATH_1 = translate("necronomicon.text.entity.skeletongoliath.1");
	public static String ENTITY_SKELETON_GOLIATH_2 = translate("necronomicon.text.entity.skeletongoliath.2");
	public static String ENTITY_SPECTRAL_DRAGON_1 = translate("necronomicon.text.entity.spectraldragon.1");
	public static String ENTITY_SPECTRAL_DRAGON_2 = translate("necronomicon.text.entity.spectraldragon.2");
	public static String ENTITY_ASORAH_1 = translate("necronomicon.text.entity.asorah.1");
	public static String ENTITY_ASORAH_2 = translate("necronomicon.text.entity.asorah.2");
	public static String ENTITY_ABYSSALNITE_GOLEM_1 = translate("necronomicon.text.entity.abyssalnitegolem.1");
	public static String ENTITY_ABYSSALNITE_GOLEM_2 = translate("necronomicon.text.entity.abyssalnitegolem.2");
	public static String ENTITY_DREADED_ABYSSALNITE_GOLEM_1 = translate("necronomicon.text.entity.dreadgolem.1");
	public static String ENTITY_DREADED_ABYSSALNITE_GOLEM_2 = translate("necronomicon.text.entity.dreadgolem.2");
	public static String ENTITY_DREADLING_1 = translate("necronomicon.text.entity.dreadling.1");
	public static String ENTITY_DREADLING_2 = translate("necronomicon.text.entity.dreadling.2");
	public static String ENTITY_DREAD_SPAWN_1 = translate("necronomicon.text.entity.dreadspawn.1");
	public static String ENTITY_DREAD_SPAWN_2 = translate("necronomicon.text.entity.dreadspawn.2");
	public static String ENTITY_DEMON_PIG_1 = translate("necronomicon.text.entity.demonpig.1");
	public static String ENTITY_DEMON_PIG_2 = translate("necronomicon.text.entity.demonpig.2");
	public static String ENTITY_SPAWN_OF_CHAGAROTH_1 = translate("necronomicon.text.entity.chagarothspawn.1");
	public static String ENTITY_SPAWN_OF_CHAGAROTH_2 = translate("necronomicon.text.entity.chagarothspawn.2");
	public static String ENTITY_FIST_OF_CHAGAROTH_1 = translate("necronomicon.text.entity.chagarothfist.1");
	public static String ENTITY_FIST_OF_CHAGAROTH_2 = translate("necronomicon.text.entity.chagarothfist.2");
	public static String ENTITY_DREADGUARD_1 = translate("necronomicon.text.entity.dreadguard.1");
	public static String ENTITY_DREADGUARD_2 = translate("necronomicon.text.entity.dreadguard.2");
	public static String ENTITY_CHAGAROTH_1 = translate("necronomicon.text.entity.chagaroth.1");
	public static String ENTITY_CHAGAROTH_2 = translate("necronomicon.text.entity.chagaroth.2");
	public static String ENTITY_REMNANT_1 = translate("necronomicon.text.entity.remnant.1");
	public static String ENTITY_REMNANT_2 = translate("necronomicon.text.entity.remnant.2");
	public static String ENTITY_OMOTHOL_GHOUL_1 = translate("necronomicon.text.entity.omotholghoul.1");
	public static String ENTITY_OMOTHOL_GHOUL_2 = translate("necronomicon.text.entity.omotholghoul.2");
	public static String ENTITY_OMOTHOL_WARDEN_1 = translate("necronomicon.text.entity.omotholwarden.1");
	public static String ENTITY_OMOTHOL_WARDEN_2 = translate("necronomicon.text.entity.omotholwarden.2");
	public static String ENTITY_MINION_OF_THE_GATEKEEPER_1 = translate("necronomicon.text.entity.gatekeeperminion.1");
	public static String ENTITY_MINION_OF_THE_GATEKEEPER_2 = translate("necronomicon.text.entity.gatekeeperminion.2");
	public static String ENTITY_JZAHAR_1 = translate("necronomicon.text.entity.jzahar.1");
	public static String ENTITY_JZAHAR_2 = translate("necronomicon.text.entity.jzahar.2");
	public static String ENTITY_LESSER_SHOGGOTH_1 = translate("necronomicon.text.entity.lessershoggoth.1");
	public static String ENTITY_LESSER_SHOGGOTH_2 = translate("necronomicon.text.entity.lessershoggoth.2");
	public static String ENTITY_SHADOW_CREATURE_1 = translate("necronomicon.text.entity.shadowcreature.1");
	public static String ENTITY_SHADOW_CREATURE_2 = translate("necronomicon.text.entity.shadowcreature.2");
	public static String ENTITY_SHADOW_MONSTER_1 = translate("necronomicon.text.entity.shadowmonster.1");
	public static String ENTITY_SHADOW_MONSTER_2 = translate("necronomicon.text.entity.shadowmonster.2");
	public static String ENTITY_SHADOW_BEAST_1 = translate("necronomicon.text.entity.shadowbeast.1");
	public static String ENTITY_SHADOW_BEAST_2 = translate("necronomicon.text.entity.shadowbeast.2");
	public static String ENTITY_SHADOW_TITAN_1 = translate("necronomicon.text.entity.shadowtitan.1");
	public static String ENTITY_SHADOW_TITAN_2 = translate("necronomicon.text.entity.shadowtitan.2");
	public static String ENTITY_SACTHOTH_1 = translate("necronomicon.text.entity.sacthoth.1");
	public static String ENTITY_SACTHOTH_2 = translate("necronomicon.text.entity.sacthoth.2");

	public static String INTEGRATION_NEI_1 = translate("necronomicon.text.integration.nei.1");
	public static String INTEGRATION_NEI_2 = translate("necronomicon.text.integration.nei.2");
	public static String INTEGRATION_NEI_3 = translate("necronomicon.text.integration.nei.3");
	public static String INTEGRATION_NEI_4 = translate("necronomicon.text.integration.nei.4");
	public static String INTEGRATION_NEI_5 = translate("necronomicon.text.integration.nei.5");
	public static String INTEGRATION_NEI_6 = translate("necronomicon.text.integration.nei.6");
	public static String INTEGRATION_NEI_7 = translate("necronomicon.text.integration.nei.7");
	public static String INTEGRATION_NEI_8 = translate("necronomicon.text.integration.nei.8");

	public static String INTEGRATION_TC_1 = translate("necronomicon.text.integration.tc.1");
	public static String INTEGRATION_TC_2 = translate("necronomicon.text.integration.tc.2");
	public static String INTEGRATION_TC_3 = translate("necronomicon.text.integration.tc.3");
	public static String INTEGRATION_TC_4 = translate("necronomicon.text.integration.tc.4");
	public static String INTEGRATION_TC_5 = translate("necronomicon.text.integration.tc.5");
	public static String INTEGRATION_TC_6 = translate("necronomicon.text.integration.tc.6");
	public static String INTEGRATION_TC_7 = translate("necronomicon.text.integration.tc.7");
	public static String INTEGRATION_TC_8 = translate("necronomicon.text.integration.tc.8");

	public static String INTEGRATION_MORPH_1 = translate("necronomicon.text.integration.morph.1");
	public static String INTEGRATION_MORPH_2 = translate("necronomicon.text.integration.morph.2");

	public static String INTEGRATION_INVTWEAKS_1 = translate("necronomicon.text.integration.invtweaks.1");

	public static String RITUAL_INFO = translate("necronomicon.text.rituals.info");

	public static String RITUAL_TUT_1 = translate("necronomicon.text.rituals.1");
	public static String RITUAL_TUT_2 = translate("necronomicon.text.rituals.2");
	public static String RITUAL_TUT_3 = translate("necronomicon.text.rituals.3");
	public static String RITUAL_TUT_4 = translate("necronomicon.text.rituals.4");
	public static String RITUAL_TUT_5 = translate("necronomicon.text.rituals.5");
	public static String RITUAL_TUT_6 = translate("necronomicon.text.rituals.6");

	public static String[] OUTER_GODS = {AZATHOTH_1, AZATHOTH_2, NYARLATHOTEP_1, NYARLATHOTEP_2, YOG_SOTHOTH_1, YOG_SOTHOTH_2,
		SHUB_NIGGURATH_1, SHUB_NIGGURATH_2};

	public static String[] GREAT_OLD_ONES = {CTHULHU_1, CTHULHU_2, HASTUR_1, HASTUR_2, JZAHAR_1, JZAHAR_2};

	public static String[] OVERWORLD_MATERIALS = {MATERIAL_ABYSSALNITE_1, MATERIAL_ABYSSALNITE_2, MATERIAL_DARKSTONE_1,
		MATERIAL_DARKSTONE_2, MATERIAL_CORALIUM_1, MATERIAL_CORALIUM_2, MATERIAL_DARKLANDS_OAK_1, MATERIAL_DARKLANDS_OAK_2,
		MATERIAL_NITRE_1, MATERIAL_NITRE_2, MATERIAL_LIQUID_ANTIMATTER_1, MATERIAL_LIQUID_ANTIMATTER_2, MATERIAL_DARKLANDS_GRASS_1,
		MATERIAL_DARKLANDS_GRASS_2};
	public static String[] ABYSSAL_WASTELAND_MATERIALS = {MATERIAL_ABYSSAL_STONE_1, MATERIAL_ABYSSAL_STONE_2, MATERIAL_ABYSSAL_ORES_1,
		MATERIAL_ABYSSAL_ORES_2, MATERIAL_ABYSSAL_CORALIUM_1, MATERIAL_ABYSSAL_CORALIUM_2, MATERIAL_LIQUIFIED_CORALIUM_1,
		MATERIAL_LIQUIFIED_CORALIUM_2, MATERIAL_PEARLESCENT_CORALIUM_1, MATERIAL_PEARLESCENT_CORALIUM_2, MATERIAL_LIQUID_CORALIUM_1,
		MATERIAL_LIQUID_CORALIUM_2, MATERIAL_DREADLANDS_INFUSED_POWERSTONE_1, MATERIAL_DREADLANDS_INFUSED_POWERSTONE_2};
	public static String[] DREADLANDS_MATERIALS = {MATERIAL_DREADSTONE_1, MATERIAL_DREADSTONE_2, MATERIAL_ABYSSALNITE_STONE_1,
		MATERIAL_ABYSSALNITE_STONE_2, MATERIAL_DREADLANDS_ABYSSALNITE_1, MATERIAL_DREADLANDS_ABYSSALNITE_2, MATERIAL_DREADED_ABYSSALNITE_1,
		MATERIAL_DREADED_ABYSSALNITE_2, MATERIAL_DREADLANDS_GRASS_1, MATERIAL_DREADLANDS_GRASS_2, MATERIAL_DREADLANDS_TREE_1,
		MATERIAL_DREADLANDS_TREE_2};
	public static String[] OMOTHOL_MATERIALS = {MATERIAL_OMOTHOL_STONE_1, MATERIAL_OMOTHOL_STONE_2, MATERIAL_ETHAXIUM_1, MATERIAL_ETHAXIUM_2,
		MATERIAL_DARK_ETHAXIUM_1, MATERIAL_DARK_ETHAXIUM_2};
	public static String[] DARK_REALM_MATERIALS = {MATERIAL_DARKSTONE_1, MATERIAL_DARKSTONE_2};

	public static String[] OVERWORLD_CRAFTING = {CRAFTING_CORALIUM_INFUSED_STONE_1, CRAFTING_CORALIUM_INFUSED_STONE_2,
		CRAFTING_SHADOW_GEM_1, CRAFTING_SHADOW_GEM_2, CRAFTING_SHARD_OF_OBLIVION, "", CRAFTING_GATEWAY_KEY, "",
		CRAFTING_NECRONOMICON_C, ""};
	public static String[] ABYSSAL_WASTELAND_CRAFTING = {CRAFTING_ALTAR_1, CRAFTING_ALTAR_2, CRAFTING_POWERSTONE_TRACKER, "",
		CRAFTING_ASORAH_GATEWAY_KEY, "", CRAFTING_NECRONOMICON_D, ""};
	public static String[] DREADLANDS_CRAFTING = {CRAFTING_TRANSMUTATOR_1, CRAFTING_TRANSMUTATOR_2, CRAFTING_CRYSTALLIZER_1,
		CRAFTING_CRYSTALLIZER_2, CRAFTING_DREAD_ALTAR_BOTTOM_1, CRAFTING_DREAD_ALTAR_BOTTOM_2, CRAFTING_DREAD_ALTAR_TOP, "",
		CRAFTING_NECRONOMICON_O, ""};
	public static String[] OMOTHOL_CRAFTING = {CRAFTING_LIFE_CRYSTAL_1, CRAFTING_LIFE_CRYSTAL_2, CRAFTING_ETHAXIUM_INGOT_1,
		CRAFTING_ETHAXIUM_INGOT_2, CRAFTING_BLANK_ENGRAVING_1, CRAFTING_BLANK_ENGRAVING_2, CRAFTING_COIN, "", CRAFTING_ENGRAVER, "",
		CRAFTING_CRYSTAL_BAG_1, CRAFTING_CRYSTAL_BAG_2, CRAFTING_MATERIALIZER_1, CRAFTING_MATERIALIZER_2, CRAFTING_ABYSSALNOMICON_1,
		CRAFTING_ABYSSALNOMICON_2};

	public static String[] OVERWORLD_PROGRESSION = {PROGRESSION_OVERWORLD_1, PROGRESSION_OVERWORLD_2, PROGRESSION_OVERWORLD_3,
		PROGRESSION_OVERWORLD_4, PROGRESSION_OVERWORLD_5, PROGRESSION_OVERWORLD_6};
	public static String[] ABYSSAL_WASTELAND_PROGRESSION = {PROGRESSION_ABYSSAL_1, PROGRESSION_ABYSSAL_2, PROGRESSION_ABYSSAL_3,
		PROGRESSION_ABYSSAL_4, PROGRESSION_ABYSSAL_5, PROGRESSION_ABYSSAL_6};
	public static String[] DREADLANDS_PROGRESSION = {PROGRESSION_DREADLANDS_1, PROGRESSION_DREADLANDS_2, PROGRESSION_DREADLANDS_3,
		PROGRESSION_DREADLANDS_4, PROGRESSION_DREADLANDS_5, PROGRESSION_DREADLANDS_6};
	public static String[] OMOTHOL_PROGRESSION = {PROGRESSION_OMOTHOL_1, PROGRESSION_OMOTHOL_2};
	public static String[] DARK_REALM_PROGRESSION = {PROGRESSION_DARK_REALM_1, PROGRESSION_DARK_REALM_2};

	public static String[] OVERWORLD_ENTITIES = {ENTITY_ABYSSAL_ZOMBIE_1, ENTITY_ABYSSAL_ZOMBIE_2, ENTITY_DEPTHS_GHOUL_1, ENTITY_DEPTHS_GHOUL_2,
		ENTITY_SHADOW_CREATURE_1, ENTITY_SHADOW_CREATURE_2, ENTITY_SHADOW_MONSTER_1, ENTITY_SHADOW_MONSTER_2, ENTITY_SHADOW_BEAST_1,
		ENTITY_SHADOW_BEAST_2, ENTITY_ANTI_1, ENTITY_ANTI_2, ENTITY_EVIL_PIG_1, ENTITY_EVIL_PIG_2};
	public static String[] ABYSSAL_WASTELAND_ENTITIES = {ENTITY_ABYSSAL_ZOMBIE_1, ENTITY_ABYSSAL_ZOMBIE_2, ENTITY_DEPTHS_GHOUL_1,
		ENTITY_DEPTHS_GHOUL_2, ENTITY_SKELETON_GOLIATH_1, ENTITY_SKELETON_GOLIATH_2, ENTITY_SPECTRAL_DRAGON_1, ENTITY_SPECTRAL_DRAGON_2,
		ENTITY_ASORAH_1, ENTITY_ASORAH_2};
	public static String[] DREADLANDS_ENTITIES = {ENTITY_ABYSSALNITE_GOLEM_1, ENTITY_ABYSSALNITE_GOLEM_2, ENTITY_DREADED_ABYSSALNITE_GOLEM_1,
		ENTITY_DREADED_ABYSSALNITE_GOLEM_2, ENTITY_DREADLING_1, ENTITY_DREADLING_2, ENTITY_DREAD_SPAWN_1, ENTITY_DREAD_SPAWN_2,
		ENTITY_DEMON_PIG_1, ENTITY_DEMON_PIG_2, ENTITY_SPAWN_OF_CHAGAROTH_1, ENTITY_SPAWN_OF_CHAGAROTH_2, ENTITY_FIST_OF_CHAGAROTH_1,
		ENTITY_FIST_OF_CHAGAROTH_2, ENTITY_DREADGUARD_1, ENTITY_DREADGUARD_2, ENTITY_CHAGAROTH_1, ENTITY_CHAGAROTH_2};
	public static String[] OMOTHOL_ENTITIES = {ENTITY_REMNANT_1, ENTITY_REMNANT_2, ENTITY_OMOTHOL_GHOUL_1, ENTITY_OMOTHOL_GHOUL_2,
		ENTITY_OMOTHOL_WARDEN_1, ENTITY_OMOTHOL_WARDEN_2, ENTITY_MINION_OF_THE_GATEKEEPER_1, ENTITY_MINION_OF_THE_GATEKEEPER_2,
		ENTITY_JZAHAR_1, ENTITY_JZAHAR_2, ENTITY_LESSER_SHOGGOTH_1, ENTITY_LESSER_SHOGGOTH_2};
	public static String[] DARK_REALM_ENTITIES = {ENTITY_SHADOW_CREATURE_1, ENTITY_SHADOW_CREATURE_2, ENTITY_SHADOW_MONSTER_1,
		ENTITY_SHADOW_MONSTER_2, ENTITY_SHADOW_BEAST_1, ENTITY_SHADOW_BEAST_2, ENTITY_SHADOW_TITAN_1, ENTITY_SHADOW_TITAN_2,
		ENTITY_SACTHOTH_1, ENTITY_SACTHOTH_2};

	public static String[] NEI_INTEGRATION = {INTEGRATION_NEI_1, INTEGRATION_NEI_2, INTEGRATION_NEI_3, INTEGRATION_NEI_4,
		INTEGRATION_NEI_5, INTEGRATION_NEI_6, INTEGRATION_NEI_7, INTEGRATION_NEI_8};
	public static String[] TC_INTEGRATION = {INTEGRATION_TC_1, INTEGRATION_TC_2, INTEGRATION_TC_3, INTEGRATION_TC_4,
		INTEGRATION_TC_5, INTEGRATION_TC_6, INTEGRATION_TC_7, INTEGRATION_TC_8};

	public static String WIP = translate("necronomicon.text.wip");

	/** Text limit */
	public static String TEST = "Lorem ipsum dolor sit amet, ad dicit prompta ullamcorper nam, quando ubique intellegat "
			+ "nam eu, ad dolore mollis has. Sint debet eum te. At dicunt liberavisse mea. Ea minimum sententiae ius, ei "
			+ "duo timeam virtute. Aliquid graecis eu usu, ea dignissim conse.";

	public static String LABEL_TEST = "Lorem ipsum";

	public static String LABEL_INDEX = translate("necronomicon.index");
	public static String LABEL_INFORMATION = translate("necronomicon.information");
	public static String LABEL_SPELLBOOK = translate("necronomicon.spells");
	public static String LABEL_RITUALS = translate("necronomicon.rituals");
	public static String LABEL_HUH = translate("necronomicon.huh");
	public static String LABEL_INFORMATION_ABYSSALCRAFT = translate("necronomicon.information.ac");
	public static String LABEL_INFORMATION_GREAT_OLD_ONES = translate("necronomicon.information.goo");
	public static String LABEL_INFORMATION_ABYSSALNOMICON = translate("necronomicon.information.abyssalnomicon");
	public static String LABEL_INFORMATION_OVERWORLD = translate("necronomicon.information.overworld");
	public static String LABEL_INFORMATION_OVERWORLD_TITLE = translate("necronomicon.information.overworld.title");
	public static String LABEL_INFORMATION_ABYSSAL_WASTELAND = translate("necronomicon.information.abyssal");
	public static String LABEL_INFORMATION_ABYSSAL_WASTELAND_TITLE = translate("necronomicon.information.abyssal.title");
	public static String LABEL_INFORMATION_DREADLANDS = translate("necronomicon.information.dreadlands");
	public static String LABEL_INFORMATION_DREADLANDS_TITLE = translate("necronomicon.information.dreadlands.title");
	public static String LABEL_INFORMATION_OMOTHOL = translate("necronomicon.information.omothol");
	public static String LABEL_INFORMATION_OMOTHOL_TITLE = translate("necronomicon.information.omothol.title");
	public static String LABEL_INFORMATION_DARK_REALM = translate("necronomicon.information.darkrealm");
	public static String LABEL_INFORMATION_DARK_REALM_TITLE = translate("necronomicon.information.darkrealm.title");
	public static String LABEL_INFORMATION_MATERIALS = translate("necronomicon.information.materials");
	public static String LABEL_INFORMATION_PROGRESSION = translate("necronomicon.information.progression");
	public static String LABEL_INFORMATION_INTEGRATION = translate("necronomicon.information.integration");
	public static String LABEL_INFORMATION_ENTITIES = translate("necronomicon.information.entities");
	public static String LABEL_INTEGRATION_NEI = "Not Enough Items";
	public static String LABEL_INTEGRATION_TC = "Thaumcraft";
	public static String LABEL_INTEGRATION_MORPH = "Morph";
	public static String LABEL_INTEGRATION_INVTWEAKS = "Inventory Tweaks";
	public static String LABEL_OUTER_GODS = translate("necronomicon.information.outergods");
	public static String LABEL_OTHER = translate("necronomicon.other");
	public static String LABEL_LOCKED = translate("necronomicon.locked");
	public static String LABEL_INFORMATION_SPECIAL_MATERIALS = translate("necronomicon.information.specialmaterials");
	public static String LABEL_ANYWHERE = translate("necronomicon.anywhere");
	public static String LABEL_LOCATION = translate("necronomicon.location");
	public static String LABEL_INFO = translate("necronomicon.info");
	public static String LABEL_NORMAL = translate("necronomicon.normal");

	/**
	 * The best way to drown an array of strings with nonsense
	 * @param par1 How many Lorem Ipsums you would like to order
	 * @return A bag full of free Lorem Ipsums, take it and leave!
	 */
	public static String[] getIpsums(int par1){
		String[] temp = new String[par1];
		for(int i = 0; i < par1; i++)
			temp[i] = TEST;
		return temp;
	}

	private static String translate(String text){
		return StatCollector.translateToLocal(text);
	}
}