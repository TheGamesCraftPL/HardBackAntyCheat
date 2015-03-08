package pl.antycheat;

import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.antycheat.Listeners.AntyAura;

public class Main extends JavaPlugin{

	private static Main inst;
	public List<String> msgs;
	
	public void onEnable(){
		inst = this;
		Bukkit.getPluginManager().registerEvents(new AntyAura(), this);
	}
	
	public static Main getInst(){
		return inst;
	}
}