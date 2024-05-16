package com.halosdev.halosfirstplugin;

import com.halosdev.halosfirstplugin.commands.ConfigCommand;
import com.halosdev.halosfirstplugin.commands.ConsoleCommand;
import com.halosdev.halosfirstplugin.commands.Heal;
import com.halosdev.halosfirstplugin.commands.Hello;
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

    }

    @Override
    public void onDisable() {
        System.out.println("Halos First Plugin Has Disabled.");
    }
}
