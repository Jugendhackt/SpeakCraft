package de.speakcraft.classes;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.speakcraft.commands.ban;

public class Main extends JavaPlugin{
	
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§b####################");
		Bukkit.getConsoleSender().sendMessage("§b#     Plugin       #");
		Bukkit.getConsoleSender().sendMessage("§b#      by          #");
		Bukkit.getConsoleSender().sendMessage("§b#    Jugend        #");
		Bukkit.getConsoleSender().sendMessage("§b#     Hackt        #");
		Bukkit.getConsoleSender().sendMessage("§b#    Schwerin      #");
		Bukkit.getConsoleSender().sendMessage("§b####################");
		
		
		
		Bukkit.getPluginManager().registerEvents(new ban(), this);
		
		
		
		
		
		
		
	}
	
	
	public void onDisable() {
		
		
		
		
		
		
	}
	

}
