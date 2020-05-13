package fr.maxlego08.shop.zshop.factories;

import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;

import fr.maxlego08.shop.zshop.categories.Category;

public interface Categories{

	/**
	 * Allows you to retrieve all available categories
	 * 
	 * @return an array of int and category
	 */
	Map<Integer, Category> getCategories();

	/**
	 * Allows you to retrieve a category based on an id
	 * 
	 * @param category
	 *            id
	 * @return category according to the id
	 */
	Category getCategory(int id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	List<Category> getCategories(int... id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	List<Category> getCategories(List<Integer> id);
	
	/**
	 * @param name
	 * @return
	 */
	Category getCategory(String name);

	/**
	 * 
	 * @return
	 */
	List<String> toTabCompleter();
	
	/**
	 * @param commandSender
	 */
	void showInformation(Player sender);


	void load();
	
	void save();
	
	void saveDefault();
	
}
