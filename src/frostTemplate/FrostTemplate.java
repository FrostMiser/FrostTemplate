package frostTemplate;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;


public class FrostTemplate extends JavaPlugin {

	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerListener(),this);
		this.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[FrostTemplate] Plugin enabled.");
		return;		
	}

	public void onDisable() {
		this.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[FrostTemplate] Plugin disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player p;
		try {
			p = this.getServer().getPlayer(sender.getName());	
		}
		catch (Exception e) {
			return true;
		}
		
		if (cmd.getName().equalsIgnoreCase("Template") ) 
		{	
			p.sendMessage("Template");
		}
		return true;
	}
}
