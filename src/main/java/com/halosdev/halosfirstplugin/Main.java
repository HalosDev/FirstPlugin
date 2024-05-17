package com.halosdev.halosfirstplugin;

import com.halosdev.halosfirstplugin.commands.*;
import com.halosdev.halosfirstplugin.events.EggThrow;
import com.halosdev.halosfirstplugin.events.MoveEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Config Stuff
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        // Startup Out Put
        System.out.println("Halos First Plugin has enabled.");
        // Events register
        Bukkit.getPluginManager().registerEvents(new MoveEvent(), this);
        Bukkit.getPluginManager().registerEvents(new EggThrow(), this);
        // Command Registers
        getCommand("heal").setExecutor(new Heal());
        getCommand("hello").setExecutor(new Hello());
        getCommand("console").setExecutor(new ConsoleCommand());
        getCommand("config").setExecutor(new ConfigCommand(this));
        getCommand("word").setExecutor(new SetWord(this));
        getCommand("permission").setExecutor(new Permission());

    }

    @Override
    public void onDisable() {
        System.out.println("Halos First Plugin Has Disabled.");
    }
}
