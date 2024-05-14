package com.halosdev.halosfirstplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Hello implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player) {
            // If the arg is true, then it will send a hello back.
            if (strings.length == 1) {
                if (strings[0].equalsIgnoreCase("true"));
                ((Player) commandSender).sendMessage(("Hello there."));
            }
        }


        return false;
    }
}
