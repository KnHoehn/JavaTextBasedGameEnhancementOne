/**Package contains all game files. */
package com.hoehn.game;

import java.util.List;
import java.util.Map;

public final class InventoryManagement {

	private InventoryManagement() {}

	/** This method processes the logic to add items to your inventory and remove the item from the room.
	 *
	 * @param inventory the player's current inventory.
	 * @param commandTwo the item the player wants to pick up.
	 * @param currentRoom the room the player currently resides in.
	 */
	public static void manageInventory(final List<String> inventory, final String commandTwo, final Map<String, String> currentRoom) {

		if (commandTwo.equals(currentRoom.get("Item"))) {
			String item = currentRoom.get("Item");
			inventory.add(item);
			currentRoom.remove("Item");
		} else {
			System.out.println("No such item Found!");
		}
	}
}
