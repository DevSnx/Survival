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
        event.setMotd("§b§lT§7uradox.eu §8- §a§lDein Citybuild Server!");
    }

}