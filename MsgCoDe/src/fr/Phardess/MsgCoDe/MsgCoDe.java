package fr.Phardess.MsgCoDe;

import java.io.PrintStream;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MsgCoDe extends JavaPlugin
{
  public void onDisable()
  {
    System.out.println("[MsgCoDe] Unloaded !");
  }

  public void onEnable()
  {
    System.out.println("[MsgCoDe] Loaded !");

    PluginManager pm = getServer().getPluginManager();

    pm.registerEvents(new MsgCoDeListener(this), this);
  }
}
