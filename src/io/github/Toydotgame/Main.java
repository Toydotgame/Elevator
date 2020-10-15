package io.github.Toydotgame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Plugin successfully enabled");
	}
	
	@Override
	public void onDisable() {

	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("resetcost") && sender instanceof Player) {
			sender.sendMessage("Command successfully executed.");
			return true;
		} else {
			getLogger().info("/resetcost can only be run by a player. Not the command line.");
		}
		return false;
	}
}
