package org.example.bukkit;

import ninja.mcstats.api.McStatsNinja;
import ninja.mcstats.api.Ninja;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleBukkitNinja extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello, world!");

        Ninja ninja = McStatsNinja.init("demo#bukkit");

    }
}
