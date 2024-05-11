package skyss0fly.Welcomer;


import org.bukkit.event.player.PlayerJoinEvent;
import org.bukki.event.plugin.PluginBase;

class Main extends PluginBase(){
public void onJoin(PlayerJoinEvent event){
  name event().getName();
this.getServer().broadcastMessage(name , " has Joined the Server");
  }

}
