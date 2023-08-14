package org.example.bukkit;

import ninja.mcstats.api.McStatsNinja;
import ninja.mcstats.api.Ninja;
import ninja.mcstats.api.exception.UnknownShurikenKeyException;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleBukkitNinja extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello, world!");

        Ninja ninja = McStatsNinja.init("demo#bukkit");

        try {
            ninja.addShuriken("test", new Ninja.Shuriken<Object>(() -> "test"));
        } catch (UnknownShurikenKeyException e) {
            throw new RuntimeException(e);
        }

    }
}
