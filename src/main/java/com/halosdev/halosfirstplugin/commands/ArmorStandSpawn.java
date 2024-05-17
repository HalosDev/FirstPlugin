package com.halosdev.halosfirstplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ArmorStandSpawn implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {


        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            ArmorStand stand = (ArmorStand) Bukkit.getWorld("world").spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);

        }

        return false;
    }
}
