package me.jumper251.replay.database.utils;





import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import me.jumper251.replay.database.DatabaseRegistry;

public class AutoReconnector extends BukkitRunnable{

	protected Plugin plugin;
	public AutoReconnector(Plugin plugin){
		this.plugin = plugin;
		this.runTaskTimerAsynchronously(plugin, 20*60, 20*60);
	}
	
	@Override
	public void run() {
		Database database = DatabaseRegistry.getDatabase();
		database.update("USE `"+database.getDatabase()+"`");
	}

}
