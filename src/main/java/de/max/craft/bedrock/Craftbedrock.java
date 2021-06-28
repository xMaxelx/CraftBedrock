package de.max.craft.bedrock;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class Craftbedrock extends JavaPlugin {

    private static Craftbedrock plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getConsoleSender().sendMessage("§6CraftBedrock §8| §aWurde geladen");
        Bukkit.getConsoleSender().sendMessage("§6CraftBedrock §8| §bAuthor: §cxMaxelx");
        recipe();
    }

    @Override
    public void onDisable() {
        plugin = null;
    }

    public ShapedRecipe crafting() {
        ItemStack itemStack = new ItemStack(Material.BEDROCK);

        NamespacedKey namespacedKey = new NamespacedKey(this, "bedrock");

        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey, itemStack);

        shapedRecipe.shape("ABA", "BDB", "ABA");
        shapedRecipe.setIngredient('A' , Material.CRYING_OBSIDIAN);
        shapedRecipe.setIngredient('B', Material.OBSIDIAN);
        shapedRecipe.setIngredient('D', Material.CRAFTING_TABLE);
        return shapedRecipe;
    }

    private void recipe() {
        Bukkit.addRecipe(crafting());
    }
}
