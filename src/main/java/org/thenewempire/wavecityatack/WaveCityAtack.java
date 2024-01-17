package org.thenewempire.wavecityatack;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static org.bukkit.Bukkit.*;

public final class WaveCityAtack extends JavaPlugin {

    @Override
    public void onEnable() {
        CommandMap commandMap = getCommandMap();
        commandMap.register("mobspawn", new CommandSpawn("mobspawn", "spawn an monster.!?", "/mobspawn", new ArrayList<>()));
        getServer().getPluginManager().registerEvents(new PluginEventHandler(), this);
    }
    @Override
    public void onDisable() {
    }
}
