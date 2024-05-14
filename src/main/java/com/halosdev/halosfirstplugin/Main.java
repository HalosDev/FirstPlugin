package com.halosdev.halosfirstplugin;

import com.halosdev.halosfirstplugin.Commands.Heal;
import com.halosdev.halosfirstplugin.Events.EggThrow;
import com.halosdev.halosfirstplugin.Events.MoveEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Halos First Plugin has enabled.");
        Bukkit.getPluginManager().registerEvents(new MoveEvent(), this);
        Bukkit.getPluginManager().registerEvents(new EggThrow(), this);
        getCommand("heal").setExecutor(new Heal());

    }

    @Override
    public void onDisable() {
        System.out.println("Halos First Plugin Has Disabled.");
    }
}
