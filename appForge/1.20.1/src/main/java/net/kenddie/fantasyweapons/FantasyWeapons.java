package net.kenddie.fantasyweapons;

import net.kenddie.fantasyweapons.handlers.FWEventHandler;
import net.kenddie.fantasyweapons.item.FWCreativeModTabs;
import net.kenddie.fantasyweapons.item.FWItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static net.kenddie.fantasyweapons.item.FWItemManager.FW_ITEM_MANAGER;

@Mod(FantasyWeapons.MOD_ID)
public class FantasyWeapons {
    public static final String MOD_ID = "fantasy_weapons";

    public FantasyWeapons() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        var modEventHandler = new FWEventHandler();
        modEventBus.register(modEventHandler);
        FWItems.declare();
        FW_ITEM_MANAGER.register(modEventBus);
        FWCreativeModTabs.register(modEventBus);
    }
}
