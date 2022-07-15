package aus.downunder;

import aus.downunder.registries.DownUnderBlocks;
import aus.downunder.registries.DownUnderStrippables;
import net.fabricmc.api.ModInitializer;

public class DownUnder implements ModInitializer {

    public static final String MODID = "downunder";

    @Override
    public void onInitialize() {
        DownUnderBlocks.registerBlocks();
        DownUnderStrippables.registerStrippables();
    }
}
