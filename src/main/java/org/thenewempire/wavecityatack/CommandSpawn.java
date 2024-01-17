package org.thenewempire.wavecityatack;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

import static org.bukkit.Bukkit.getPlayer;
import static org.bukkit.Bukkit.getWorlds;

public class CommandSpawn extends Command {

    protected CommandSpawn(@NotNull String name, @NotNull String description, @NotNull String usageMessage, @NotNull List<String> aliases) {
        super(name, description, usageMessage, aliases);
    }

    @Override
    public boolean execute(CommandSender sender, String param, String[] params) {
        Player player = getPlayer(sender.getName());
        int amount = (params != null) ? Integer.parseInt(params[0]) : 10;
        this.spawnCreature(player.getLocation(), EntityType.CREEPER, amount);
        return true;
    }

    private static void spawnCreature(Location loc, EntityType type, Integer amount) {
        for(int i = 0; i < amount; i++) {
            loc.getWorld().spawnEntity(loc, type);
        }
    }
}
