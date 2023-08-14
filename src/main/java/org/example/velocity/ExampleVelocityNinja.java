package org.example.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import ninja.mcstats.api.McStatsNinja;
import ninja.mcstats.api.Ninja;

@Plugin(id = "joinme", name = "JoinMe", version = "@version@", description = "JoinMe plugin for Velocity", authors = {"Freddi"}, url = "https://joinme.freddi.io")
public class ExampleVelocityNinja {


    @Inject
    public void onProxyInitialize(ProxyInitializeEvent event) {
        System.out.println("Hello, world!");
        Ninja ninja = McStatsNinja.init("demo#velocity");

        
    }

}
