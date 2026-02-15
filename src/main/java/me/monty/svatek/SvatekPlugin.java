package me.monty.svatek;

import org.bukkit.plugin.java.JavaPlugin;

public class SvatekPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Kontrola, jestli je na serveru PlaceholderAPI
        if (getServer().getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new SvatekExpansion().register();
            getLogger().info("SvatekPlugin (me.monty.svatek) byl uspesne zapnut!");
        } else {
            getLogger().severe("PlaceholderAPI nebyl nalezen! Plugin nebude fungovat.");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("SvatekPlugin se vypina.");
    }
}