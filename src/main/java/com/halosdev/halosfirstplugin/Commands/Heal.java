package com.halosdev.halosfirstplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            player.sendMessage("Your Health Has been restored");
            player.setHealth(20);
        }


        return false;
    }
}
