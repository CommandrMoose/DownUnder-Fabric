package aus.downunder.registries;

import aus.downunder.DownUnder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DownUnderBlocks {

    public static final Block EUCALYPTUS_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG));
    public static final Block STRIPPED_EUCALYPTUS_LOG = new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG));
    public static final Block EUCALYPTUS_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));
    public static final SlabBlock EUCALYPTUS_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB));
    public static final FenceBlock EUCALYPTUS_FENCE = new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE));
    public static final StairsBlock EUCALYPTUS_STAIRS = new StairsBlock(EUCALYPTUS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS));
    public static final PressurePlateBlock EUCALYPTUS_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE));
    public static final DoorBlock EUCALYPTUS_DOOR = new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR));

    public static void registerBlocks() {
        registerBlock("eucalyptus_log", EUCALYPTUS_LOG, ItemGroup.BUILDING_BLOCKS);
        registerBlock("stripped_eucalyptus_log", STRIPPED_EUCALYPTUS_LOG, ItemGroup.BUILDING_BLOCKS);
        registerBlock("eucalyptus_planks", EUCALYPTUS_PLANKS, ItemGroup.BUILDING_BLOCKS);
        registerBlock("eucalyptus_slab", EUCALYPTUS_SLAB, ItemGroup.BUILDING_BLOCKS);
        registerBlock("eucalyptus_fence", EUCALYPTUS_FENCE, ItemGroup.BUILDING_BLOCKS);
        registerBlock("eucalyptus_stairs", EUCALYPTUS_STAIRS, ItemGroup.BUILDING_BLOCKS);
        registerBlock("eucalyptus_pressure_plate", EUCALYPTUS_PRESSURE_PLATE, ItemGroup.REDSTONE);
        registerBlock("eucalyptus_door", EUCALYPTUS_DOOR, ItemGroup.REDSTONE);
    }


    private static void registerBlock(String id, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(DownUnder.MODID, id), block);
    }

    private static void registerBlock(String id, Block block, ItemGroup group) {
        Registry.register(Registry.BLOCK, new Identifier(DownUnder.MODID, id), block);
        Registry.register(Registry.ITEM, new Identifier(DownUnder.MODID, id), new BlockItem(block, new Item.Settings().group(group)));
    }

}
