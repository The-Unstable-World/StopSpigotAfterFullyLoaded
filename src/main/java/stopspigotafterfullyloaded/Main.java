package stopspigotafterfullyloaded;
public class Main extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener {
  @Override
  public void onEnable() { getServer().getPluginManager().registerEvents(this, this); }
  @org.bukkit.event.EventHandler
  public void onServerLoad(org.bukkit.event.server.ServerLoadEvent event) { getServer().shutdown(); }}
