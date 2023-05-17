package fk.maxe.kill_stick;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KillStickItem implements Listener {

    @EventHandler
    public void OnJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        ItemStack custom_stick = new ItemStack(Material.STICK);
        ItemMeta customS = custom_stick.getItemMeta();
        customS.setDisplayName("§c Kill Stick");
        customS.addEnchant(Enchantment.ARROW_DAMAGE, 1,true);
        custom_stick.setItemMeta(customS);

        player.getInventory().setItemInHand(custom_stick);
    }
    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack item = event.getItem();

        if(item == null)return;

        if(item.getType() == Material.STICK && item.hasItemMeta() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§c Kill Stick")){
            if(action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK){
                player.setHealth(0);
            }
        }
    }
}
