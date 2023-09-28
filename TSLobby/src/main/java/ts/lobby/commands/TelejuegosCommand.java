package ts.lobby.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ts.lobby.TSLobby;
import ts.lobby.utils.MessageUtils;

public class TelejuegosCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(MessageUtils.getColoredMessage(TSLobby.prefix + "&cYou must be a player to execute this command!"));
        }
        return true;
    }
}
