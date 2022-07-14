package aus.downunder.common.block;

import aus.downunder.DownUnder;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;

public class DownUnderBlocks {

    public static final Block EUCALYPTUS_LOG = createLogBlock();

    public static void registerBlocks() {
        registerBlock("eucalyptus_log", EUCALYPTUS_LOG, ItemGroup.BUILDING_BLOCKS);
    }


    private static void registerBlock(String id, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(DownUnder.MODID, id), block);
    }

    private static void registerBlock(String id, Block block, ItemGroup group) {
        Registry.register(Registry.BLOCK, new Identifier(DownUnder.MODID, id), block);
        Registry.register(Registry.ITEM, new Identifier(DownUnder.MODID, id), new BlockItem(block, new Item.Settings().group(group)));
    }

    // Similar to the Blocks class file registry.
    private static PillarBlock createLogBlock() {
        return new PillarBlock(AbstractBlock.Settings.of(Material.WOOD).strength(2.0F).sounds(BlockSoundGroup.WOOD));
    }

}
