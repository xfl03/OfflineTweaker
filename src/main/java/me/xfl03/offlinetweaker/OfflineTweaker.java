package me.xfl03.offlinetweaker;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(
        modid = "offlinetweaker",
        name = "OfflineTweaker",
        version = "0.3.3",
        acceptedMinecraftVersions = "[1.8,)",
        serverSideOnly = true
)
public class OfflineTweaker {
    @EventHandler
    public void onServerStart(FMLServerStartingEvent e) {
        e.getServer().setOnlineMode(false);
    }
}
