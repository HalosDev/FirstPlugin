package com.halosdev.halosfirstplugin;

import com.halosdev.halosfirstplugin.Events.MoveEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Tests");
        Bukkit.getPluginManager().registerEvents(new MoveEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
