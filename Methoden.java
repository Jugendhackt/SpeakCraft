import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

public class Methoden {
	public static File config = new File("/plugins/SpeakCraft/config.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(config);
	
	
	
	
	public static getName(String Name) {
		
		cfg.set("NAME", Name);
		cfg.save(config);
		
		
		
		
		
		
	}
	public static getAdress(int IP) {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
