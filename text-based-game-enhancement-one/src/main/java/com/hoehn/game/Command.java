/**Package contains all game files. */
package com.hoehn.game;

import java.util.List;
import java.util.Map;

public final class Command {

	private Command() {}

	/** This method determines what to do next given the user's command
	 *
	 * @param rooms the map of the game world.
	 * @param currentRoom the room the players currently resides in.
	 * @param commands list of valid commands the player can take.
	 * @param inventory the player's current inventory.
	 * @param command the command the player entered.
	 * @return the room the player enters next given the command.
	 */
	public static Map<String, String> processCommand(final Map<String, Map<String, String>> rooms, final Map<String, String> currentRoom, final List<String> commands, final List<String> inventory, final String command) {

		Map<String, String> nextRoom = currentRoom;
		String commandTwo = null;
		String[] splitCommand = command.split(" ", 2);
		String commandOne = splitCommand[0];
		
		if (splitCommand.length > 1) {
			commandTwo = splitCommand[1];
		}
		// If command is valid
		if (commands.contains(command)) {
			// If first word is "Go"
			if (commandOne.equals("Go") && commandTwo != null) {
				// Goes the direction the user input
				if (currentRoom.containsKey(commandTwo)) {
					nextRoom = rooms.get(currentRoom.get(commandTwo));
				} else {
					System.out.println("Can't go that way!");
				}
				// Else if user types "I", prints the instructions
			} else if (command.equals("I")) {
				Instructions.printInstructions();
			} else {
				System.out.println("Invalid Move!");
			}
			// Else if the first word is "Get", call the InventoryManagement class to add the item to the players inventory
		} else if (commandOne.equals("Get") && commandTwo != null) {
			InventoryManagement.manageInventory(inventory, commandTwo, currentRoom);
		} else {
			System.out.println("Invalid Move!");
		}
		return nextRoom;
	}
}
