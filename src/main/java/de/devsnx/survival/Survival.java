package de.devsnx.survival;

import de.devsnx.survival.listener.PlayerJoinListener;
import de.devsnx.survival.listener.PlayerQuitListener;
import de.devsnx.survival.listener.ServerPingListListener;
import de.devsnx.survival.manager.ScoreboardManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Survival extends JavaPlugin {

    public static Survival instance;
    public static ScoreboardManager scoreboardManager;

    @Override
    public void onEnable() {

        instance = this;
        scoreboardManager = new ScoreboardManager();
        load();

    }

    @Override
    public void onDisable() {

        instance = null;

    }

    private void load(){
        PluginManager pluginManager = Bukkit.getServer().getPluginManager();
        pluginManager.registerEvents(new ServerPingListListener(), this);
        pluginManager.registerEvents(new PlayerJoinListener(), this);
        pluginManager.registerEvents(new PlayerQuitListener(), this);

    }

    public static Survival getInstance() {
        return instance;
    }

    public static ScoreboardManager getScoreboardManager() {
        return scoreboardManager;
    }
}
