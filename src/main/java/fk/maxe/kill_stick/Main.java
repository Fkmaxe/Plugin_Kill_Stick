package fk.maxe.kill_stick;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        System.out.println("ça démarre gros iench");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new KillStickItem(),this);
    }
    public void onDisable(){
        System.out.println("je suis éteint salope");
    }
}
