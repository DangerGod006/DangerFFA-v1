package me.danger.ffa;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DangerFFA Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DangerFFA Plugin Disabled!");
    }
}
