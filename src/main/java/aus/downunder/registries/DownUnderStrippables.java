package aus.downunder.registries;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class DownUnderStrippables {

    public static void registerStrippables() {
        StrippableBlockRegistry.register(DownUnderBlocks.EUCALYPTUS_LOG, DownUnderBlocks.STRIPPED_EUCALYPTUS_LOG);
    }

}
