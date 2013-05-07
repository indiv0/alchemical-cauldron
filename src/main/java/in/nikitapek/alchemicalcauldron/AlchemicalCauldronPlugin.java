package in.nikitapek.alchemicalcauldron;

import in.nikitapek.alchemicalcauldron.events.AlchemicalCauldronListener;
import in.nikitapek.alchemicalcauldron.util.AlchemicalCauldronConfigurationContext;

import org.bukkit.Bukkit;

import com.amshulman.mbapi.MbapiPlugin;

public class AlchemicalCauldronPlugin extends MbapiPlugin {
    @Override
    public void onEnable() {
        AlchemicalCauldronConfigurationContext configurationContext = new AlchemicalCauldronConfigurationContext(this);

        registerEventHandler(new AlchemicalCauldronListener(configurationContext));

        super.onEnable();
    }

    @Override
    public void onDisable() {
        Bukkit.getScheduler().cancelTasks(this);
    }
}