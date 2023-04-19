package de.devsnx.survival.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

/**
 * @author DevSnx
 * @since 18.04.2023
 */
public class ServerPingListListener implements Listener {

    @EventHandler
    public void onServerListPing(ServerListPingEvent event){
        event.setMaxPlayers(128);
        event.setMotd("§bD§7ie§bC§7rew§bL§7ine.de §8- §a§lModserver");
    }

}