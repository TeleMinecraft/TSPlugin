package ts.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import ts.plugin.TSPlugin;
import ts.plugin.utils.MessageUtils;

public class Survival implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(MessageUtils.getColoredMsg(TSPlugin.prefix + "&cYou must be a player to execute this command!"));
            return true;
        }
        if (!sender.hasPermission("ts.survival")) {
            sender.sendMessage(MessageUtils.getColoredMsg(TSPlugin.prefix + "&cNo puedes usar este comando aquí!"));
        }
        return true;
    }
}