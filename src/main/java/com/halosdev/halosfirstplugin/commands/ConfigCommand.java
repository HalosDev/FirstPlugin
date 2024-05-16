package com.halosdev.halosfirstplugin.commands;

import com.halosdev.halosfirstplugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ConfigCommand implements CommandExecutor {

    private Main main;
    public ConfigCommand(Main main) {
        this.main = main;

    }



    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.sendMessage(main.getConfig().getString("Word"));
            player.sendMessage(main.getConfig().getString("Number")+ "");
            if (main.getConfig().getBoolean("Boolean")) {
                player.sendMessage("This feature is enabled.");
            }
            for (String string : main.getConfig().getStringList("String-list")) {
                player.sendMessage(string);
            }

        }

        return false;
    }
}
