package ts.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import ts.plugin.TSPlugin;
import ts.plugin.utils.MessageUtils;

public class Rules implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(MessageUtils.getColoredMessage(TSPlugin.prefix + "&cYou must be a player to execute this command!"));
            return true;
        }
        if (args.length > 1) {
            sender.sendMessage(MessageUtils.getColoredMessage(TSPlugin.prefix + "&cUso: /rules <1/2/3>"));
            return true;
        }
        if (args.length == 0 || args[0].equalsIgnoreCase("1")) {
            sender.sendMessage(MessageUtils.getColoredMessage("&7&l&m----------&7&l[&6&lReglas del &3&lTele&b&lServer &f1/3&7&l]&7&l&m----------"));
            sender.sendMessage(MessageUtils.getColoredMessage("#FFEC00●&7 Tener un mínimo de respeto con los demás jugadores."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FFEC00●&7 No usar hacks ni clientes modificados."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FFEC00●&7 No abusar de bugs u otras mecánicas."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FFEC00●&7 No hacer spam en el chat o en el discord."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FFEC00●&7 No promocionar otros servidores."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FFEC00●&7 No intentes dañar o bloquear el spawn."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FFEC00●&7 No duplicar items, bloques ni TNT."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FFEC00●&7 No usar mods prohibidos."));
            sender.sendMessage(MessageUtils.getColoredMessage("#AEFFF1◆ &fUsa &o/rules 2 &fpara ver más #AEFFF1◆"));
        } else if (args[0].equalsIgnoreCase("2")) {
            sender.sendMessage(MessageUtils.getColoredMessage("&7&l&m----------&7&l[&6&lReglas del &3&lTele&b&lServer &f2/3&7&l]&7&l&m----------"));
            sender.sendMessage(MessageUtils.getColoredMessage("#FF0000◆ Mods prohibidos ◆"));
            sender.sendMessage(MessageUtils.getColoredMessage("#FF0000● &7Mods que te den ventajas sobre los demás."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FF0000● &7Cualquier tipo de Auto-Clicker."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FF0000● &7Cualquier tipo de CheatEngine."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FF0000● &7X-ray o variaciones."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FF0000● &7ReplayMod."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FF0000● &7Damage Indicator."));
            sender.sendMessage(MessageUtils.getColoredMessage("#FF0000● &7Schematica Mod."));
            sender.sendMessage(MessageUtils.getColoredMessage("#AEFFF1◆ &fUsa &o/rules 3 &fpara ver más #AEFFF1◆"));
        } else if (args[0].equalsIgnoreCase("3")) {
            sender.sendMessage(MessageUtils.getColoredMessage("&7&l&m----------&7&l[&6&lReglas del &3&lTele&b&lServer &f3/3&7&l]&7&l&m----------"));
            sender.sendMessage(MessageUtils.getColoredMessage("#0FCA00◆ Mods permitidos ◆"));
            sender.sendMessage(MessageUtils.getColoredMessage("#0FCA00● &7Optifine y Shaders."));
            sender.sendMessage(MessageUtils.getColoredMessage("#0FCA00● &7Mods que ayuden al rendimiento de tu PC."));
            sender.sendMessage(MessageUtils.getColoredMessage("#0FCA00● &7Mods de minimapas."));
            sender.sendMessage(MessageUtils.getColoredMessage("#0FCA00● &7Mods para crear atajos en el teclado."));
            sender.sendMessage(MessageUtils.getColoredMessage("#0FCA00● &7Mods que solo afecten la estética."));
            sender.sendMessage(MessageUtils.getColoredMessage("#0FCA00● &7MineCapes Mod."));
            sender.sendMessage(MessageUtils.getColoredMessage("#0FCA00● &7NotEnoughItems (NEI)."));
            sender.sendMessage(MessageUtils.getColoredMessage("#AEFFF1◆ &fSi tienes dudas, escríbenos por nuestras redes sociales! #AEFFF1◆"));
        } else {
            sender.sendMessage(MessageUtils.getColoredMessage(TSPlugin.prefix + "&cUsage: /rules <1/2/3>"));
            return true;
        }
        return true;
    }
}
