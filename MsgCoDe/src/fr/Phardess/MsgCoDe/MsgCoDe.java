package fr.Phardess.MsgCoDe;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MsgCoDe extends JavaPlugin
{
  public void onDisable()
  {
    System.out.println("[MsgCoDe] Unloaded !");
  }

  @SuppressWarnings("unused")
public void onEnable()
  {
    System.out.println("[MsgCoDe] Loaded !");

    PluginManager pm = getServer().getPluginManager();


  }
  public void loadConfig()
  {
      getConfig().options().header("========Partie configuration by julesm74=============");


      getConfig().addDefault("Message.join", " vient de se connecter.");
      getConfig().addDefault("Message.leave", " vient de se deconnecter.");

      getConfig().options().copyDefaults(true);
      saveConfig();
  }
}