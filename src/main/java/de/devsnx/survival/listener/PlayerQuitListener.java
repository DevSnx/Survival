package de.devsnx.survival.listener;

import de.devsnx.survival.Survival;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * @author DevSnx
 * @since 18.04.2023
 */
public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        event.setQuitMessage("§7[§c-§7] §b" + event.getPlayer().getName());
        Survival.getScoreboardManager().removePlayerScoreboard(event.getPlayer());
        Survival.getScoreboardManager().updateAllScoreboards(false, true);
    }

}