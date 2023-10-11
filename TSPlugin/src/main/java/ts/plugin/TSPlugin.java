package ts.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import ts.plugin.commands.*;
import ts.plugin.utils.MessageUtils;

import java.util.Objects;

public class TSPlugin extends JavaPlugin {

    public static final String prefix = ChatColor.translateAlternateColorCodes('&', "&7[&3Tele&bServer&7] &r");
    public final String version = getDescription().getVersion();

    public void onEnable() {
        registerCommands();
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMsg(prefix + "&aHas been enabled! &7Version: &b" + version));
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMsg(prefix + "&cHas been disabled! &7Version: &b" + version));
    }

    public void registerCommands() {
        Objects.requireNonNull(this.getCommand("dinero")).setExecutor(new Dinero());
        Objects.requireNonNull(this.getCommand("help")).setExecutor(new Help());
        Objects.requireNonNull(this.getCommand("lobby")).setExecutor(new Lobby());
        Objects.requireNonNull(this.getCommand("ranks")).setExecutor(new Ranks());
        Objects.requireNonNull(this.getCommand("rules")).setExecutor(new Rules());
        Objects.requireNonNull(this.getCommand("servers")).setExecutor(new Servers());
        Objects.requireNonNull(this.getCommand("shops")).setExecutor(new Shops());
        Objects.requireNonNull(this.getCommand("stats")).setExecutor(new Stats());
        Objects.requireNonNull(this.getCommand("survival")).setExecutor(new Survival());
        Objects.requireNonNull(this.getCommand("telejuegos")).setExecutor(new Telejuegos());
        Objects.requireNonNull(this.getCommand("usm")).setExecutor(new Usm());
        Objects.requireNonNull(this.getCommand("vip")).setExecutor(new Vip());
    }
}
