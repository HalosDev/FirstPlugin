package com.halosdev.halosfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Permission implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (player.hasPermission("halosplugin.use")){
                player.sendMessage(ChatColor.GREEN + "You have permission to use this");
            } else {
                player.sendMessage(ChatColor.RED + "You do not have persmison to use this command.");
            }
        }

        return false;
    }
}
