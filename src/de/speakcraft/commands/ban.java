package de.speakcraft.classes;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class ban implements Listener {

	public void onChat(PlayerChatEvent e) {
		Player p = e.getPlayer();
		// Gibt den Spieler an, der benutzt werden soll!
		if (e.getMessage().equalsIgnoreCase("!ban")) {
			// Abfrage des Befehls
			e.setCancelled(true);
			p.sendMessage(Main.Prefix + "§cBitte gebe eine Ip-Adresse an (!ban [IP-Adresse]");
		}
	}

	public void getIp(String[] args) {
		if (args.length == 0) {
			if (e.getMessage().equalsIgnoreCase("!check")) {
				p.sendMessage("§cBitte nutze !check [InGameName]");
			}
		} else if (args.length == 1) {
			Player t = e.getPlayer(args[0]);
			p.sendMessage(t.getName());
			p.sendMessage(t.getAddress());
		}
	}

}
