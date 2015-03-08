package pl.antycheat.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class AntyAura implements Listener{

	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof Player){
			if(e.getDamager() instanceof Player){
				Location l1 = e.getEntity().getLocation();
				Location l2 = e.getDamager().getLocation();
				if(l1.distance(l2) > 5){
					Bukkit.broadcastMessage(ChatColor.GOLD+">> "+ChatColor.RED+""+((Player)e.getDamager()).getName()+" "+ChatColor.GOLD+"Jest podejzewany o Killaure!");
				}
			}
		}
	}
}