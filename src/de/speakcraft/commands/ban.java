//#####################################
//#    Klasse wurde Programmiert      #
//#              von                  #
//#        	Lars und Max              #
//#####################################
//#  Diese Klasse ist für das Bannen  #
//#  eines Clients auf dem Minecraft  #
//#  Server und enthält die Befehle   #
//#    !ban      und       !check     #
//#####################################

package de.speakcraft.classes;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class ban implements Listener {

	public void onChat(PlayerChatEvent e) {
		Player p = e.getPlayer();
		
		if(p instanceof Player) {
	//Fragt den Absender ob dies ein Spieler ist
			
			if(p.hasPermission("TS3.USE")) {
	//Fragt den Spieler ob dieser das Recht "TS3.USE" hat,			
		
				if (e.getMessage().equalsIgnoreCase("!ban")) {
	//Abfrage vom Befehl !ban
			
					e.setCancelled(true);
			p.sendMessage(Main.Prefix + "§cBitte gebe eine Ip-Adresse an (!ban [IP-Adresse]");
	//Ausgabe des Befehles
		}
	

	public void getIp(String[] args) {
		if (args.length == 0) {
		//Argument 0 ist !check	
			if (e.getMessage().equalsIgnoreCase("!check")) {
				p.sendMessage("§cBitte nutze !check [InGameName]");
			}
		} else if (args.length == 1) {
		//Argument 1 ist der Spieler (!check [Spieler])
			Player t = e.getPlayer(args[0]);  //Setzt eine Variable 
											  //für den auszugebenen Spieler
			
			p.sendMessage(t.getName());    //Gibt den Namen des Spielers aus
			p.sendMessage(t.getAddress()); //Gibt die Adresse (IP) des Spielers aus
		}
	}
}
}else{
	
}
	
	
	
	
}
}