package org.example.bungee;

import net.md_5.bungee.api.plugin.Plugin;
import ninja.mcstats.api.McStatsNinja;
import ninja.mcstats.api.Ninja;

public class ExampleBungeeNinja extends Plugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello, world!");

        Ninja ninja = McStatsNinja.init("demo#bungee");
        
    }

}
