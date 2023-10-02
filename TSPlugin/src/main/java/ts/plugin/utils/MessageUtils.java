package ts.plugin.utils;

import org.bukkit.ChatColor;

public class MessageUtils {
    public static String getColoredMessage(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
