package com.halosdev.halosfirstplugin.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveEvent implements Listener {


    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {

        e.setCancelled(true);
        e.getPlayer().sendMessage("Stop moving.");
    }
}
