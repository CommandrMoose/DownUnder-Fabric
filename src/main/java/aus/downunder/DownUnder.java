package aus.downunder;

import aus.downunder.common.block.DownUnderBlocks;
import net.fabricmc.api.ModInitializer;

public class DownUnder implements ModInitializer {

    public static final String MODID = "downunder";

    @Override
    public void onInitialize() {
        DownUnderBlocks.registerBlocks();
    }
}
