package fr.maxlego08.shop.example;

import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import fr.maxlego08.shop.zshop.factories.Boost;
import fr.maxlego08.shop.zshop.factories.Categories;
import fr.maxlego08.shop.zshop.factories.Items;
import fr.maxlego08.shop.zshop.factories.Shop;

public class ZShop extends JavaPlugin {

	@Override
	public void onEnable() {

		Items items = getProvider(Items.class);
		Categories categories = getProvider(Categories.class);
		Shop shop = getProvider(Shop.class);
		Boost boost = getProvider(Boost.class);
		
	}

	@Override
	public void onDisable() {

	}

	protected <T> T getProvider(Class<T> classz) {
		RegisteredServiceProvider<T> provider = getServer().getServicesManager().getRegistration(classz);
		if (provider == null)
			return null;
		return provider.getProvider() != null ? (T) provider.getProvider() : null;
	}

}
