package de.devsnx.survival.utils;

import org.bukkit.ChatColor;

/**
 * @author DevSnx
 * @since 18.04.2023
 */
public class Utils {

    public static String formatTime(int secs) {
        int remainder = (secs/20) % 86400;

        int days = (secs/20) / 86400;
        int hours = remainder / 3600;
        int minutes = (remainder / 60) - (hours * 60);
        int seconds = (remainder % 3600) - (minutes * 60);

        if (days > 0) {
            return ChatColor.translateAlternateColorCodes('&', "&b" + days + "&fd &b" + hours + "&fh &b" + minutes + "&fm");
        } else if (hours > 0) {
            return ChatColor.translateAlternateColorCodes('&', "&b" + 0 + "&fd &b" + hours + "&fh &b" + minutes + "&fm");
        } else if (minutes > 0) {
            return ChatColor.translateAlternateColorCodes('&', "&b" + 0 + "&fd &b" + 0 + "&fh &b" + minutes + "&fm");
        } else {
            return String.valueOf("§b" + seconds + " §fs");
        }
    }
}