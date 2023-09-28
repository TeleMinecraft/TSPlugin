package ts.lobby;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import ts.lobby.commands.*;
import ts.lobby.utils.MessageUtils;

import java.util.Objects;

public class TSLobby extends JavaPlugin {

    public static String prefix = ChatColor.translateAlternateColorCodes('&', "&7[&bTSLobby&7] &r");
    public String version = getDescription().getVersion();

    public void onEnable() {
        registerCommands();
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix + "&aHas been enabled! &7Version: &b" + version));
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix + "&cHas been disabled! &7Version: &b" + version));
    }

    public void registerCommands() {
        Objects.requireNonNull(this.getCommand("ayuda")).setExecutor(new AyudaCommand());
        Objects.requireNonNull(this.getCommand("help")).setExecutor(new HelpCommand());
        Objects.requireNonNull(this.getCommand("rangos")).setExecutor(new RangosCommand());
        Objects.requireNonNull(this.getCommand("reglas")).setExecutor(new ReglasCommand());
        Objects.requireNonNull(this.getCommand("rules")).setExecutor(new RulesCommand());
        Objects.requireNonNull(this.getCommand("servers")).setExecutor(new ServersCommand());
        Objects.requireNonNull(this.getCommand("survival")).setExecutor(new SurvivalCommand());
        Objects.requireNonNull(this.getCommand("telejuegos")).setExecutor(new TelejuegosCommand());
        Objects.requireNonNull(this.getCommand("usm")).setExecutor(new UsmCommand());
        Objects.requireNonNull(this.getCommand("vip")).setExecutor(new VipCommand());
    }
}
