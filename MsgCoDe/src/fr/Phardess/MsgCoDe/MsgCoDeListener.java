package fr.Phardess.MsgCoDe;
 
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

 
public class MsgCoDeListener extends JavaPlugin implements Listener{

    public FileConfiguration config;
    public String l1;
 
    public void onDisable() {
        this.save();
        this.saveConfig();
    }
    @Override
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(this, this);
        config = getConfig();
        this.CreateBase();
        config.options().copyDefaults(true);
        this.saveConfig();
        l1 = config.getString("Line1");
    }
 
 
    private void CreateBase() {
		// TODO Auto-generated method stub
		
	}
	private void save() {
 
    }
}