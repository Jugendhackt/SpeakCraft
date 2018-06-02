package de.speakcraft.classes;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.speakcraft.commands.ban;

public class Main extends JavaPlugin{
	
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§a***************");
		Bukkit.getConsoleSender().sendMessage("§6* Plugin by   *");
		Bukkit.getConsoleSender().sendMessage("§6* Jugendhackt *");
		Bukkit.getConsoleSender().sendMessage("§a***************");
		this.getCommand("test").setExecutor(new ban());
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void onDisable() {
		
		
		
		
		
		
	}
	

}
