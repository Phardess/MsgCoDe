package fr.Phardess.MsgCoDe;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class MsgCoDeListener
  implements Listener
{
  private MsgCoDe plugin;

  public MsgCoDeListener(MsgCoDe plugin)
  {
    this.plugin = plugin;
  }
  @EventHandler(priority=EventPriority.NORMAL)
  public void onPlayerJoin(PlayerJoinEvent e) {
    e.setJoinMessage(ChatColor.YELLOW + e.getPlayer().getName() + " vient de se connecter.");
  }
  @EventHandler(priority=EventPriority.NORMAL)
  public void onPlayerQuit(PlayerQuitEvent e) {
    e.setQuitMessage(ChatColor.YELLOW + e.getPlayer().getName() + " vient de se deconnecter.");
  }
}
