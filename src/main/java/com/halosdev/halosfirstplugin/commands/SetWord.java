package com.halosdev.halosfirstplugin.commands;

import com.halosdev.halosfirstplugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SetWord implements CommandExecutor {

    private Main main;

    public SetWord(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        Player player = (Player) commandSender;

        main.getConfig().set("Word", "Cake");

        List<String> list = main.getConfig().getStringList("String-list");
        list.add("New value!");
        main.getConfig().set("String-list", list);
        main.saveConfig();



        return false;
    }
}
