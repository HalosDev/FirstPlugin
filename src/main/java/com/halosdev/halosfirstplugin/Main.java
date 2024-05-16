package com.halosdev.halosfirstplugin;

import com.halosdev.halosfirstplugin.commands.*;
import com.halosdev.halosfirstplugin.events.EggThrow;
import com.halosdev.halosfirstplugin.events.MoveEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();
        System.out.println("Halos First Plugin has enabled.");
        Bukkit.getPluginManager().registerEvents(new MoveEvent(), this);
        Bukkit.getPluginManager().registerEvents(new EggThrow(), this);
        getCommand("heal").setExecutor(new Heal());
        getCommand("hello").setExecutor(new Hello());
        getCommand("console").setExecutor(new ConsoleCommand());
        getCommand("config").setExecutor(new ConfigCommand(this));
        getCommand("word").setExecutor(new SetWord(this));

    }

    @Override
    public void onDisable() {
        System.out.println("Halos First Plugin Has Disabled.");
    }
}
