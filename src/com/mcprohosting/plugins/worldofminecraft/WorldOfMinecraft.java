package com.mcprohosting.plugins.worldofminecraft;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class WorldOfMinecraft extends JavaPlugin { 
	ConsoleCommandSender console = Bukkit.getConsoleSender();
	
	public void onEnable() {
		console.sendMessage("Bob?");
	}
	
	public void onDisable() {
		
	}

}
