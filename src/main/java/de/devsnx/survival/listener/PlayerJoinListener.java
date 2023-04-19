package de.devsnx.survival.listener;

import de.devsnx.survival.Survival;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author DevSnx
 * @since 18.04.2023
 */
public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage("§7[§a+§7] §b" + event.getPlayer().getName());
        Survival.getScoreboardManager().createNewScoreboard(event.getPlayer());
        Survival.getScoreboardManager().updateAllScoreboards(false, true);
    }

}