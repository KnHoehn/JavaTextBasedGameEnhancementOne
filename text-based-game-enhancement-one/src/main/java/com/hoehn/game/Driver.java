/**Package contains all game files. */
package com.hoehn.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.text.WordUtils;

/** Author: Kayla Hoehn. */

public final class Driver {

	private Driver() {}

	/** This method holds the main method for the game.
	 *
	 * @param args unused.
	 * */
	public static void main (final String[] args) {

		boolean gameLoop = true;
		Scanner scanner = new Scanner(System.in);
		// Calls the Rooms class to create a nested hashmap of rooms
		Map<String, Map<String, String>> rooms = Rooms.createRooms();
		// Sets the current room to the Engine Room
		Map<String, String> currentRoom = rooms.get("Engine Room");
		List<String> inventory = new ArrayList<>();
		// Calls the Commands class to create a list of valid commands
		List<String> commands = Commands.createCommands();
		// Calls the Opening class to print the opening
		Opening.printOpening();
		
		// Game loop
		while (gameLoop) {
			
			// Calls the Status class to print the user's current status
			Status.printStatus(currentRoom.get("Name"), inventory);
			
			// If current room contains an item, print the item's description
			if (currentRoom.containsKey("Item")) {
				String itemDescription = currentRoom.get("Item Description");
				System.out.println(itemDescription);
			}
			// If the current room is the entrance vestibule, initiate the alien battle
			if (currentRoom.get("Name").equals("Entrance Vestibule")) {
				String endGameResult = Battle.initiateBattle(inventory);
				System.out.println(endGameResult);
				gameLoop = false;
				continue;
			}
			// Gets the command from the user
			System.out.print("Enter your command: ");
			String command = WordUtils.capitalizeFully(scanner.nextLine()).trim();
			// If user enters exit, exits the game
			if (command.equals("Exit")) {
				System.out.println("Thank you for playing!");
				gameLoop = false;
				// Otherwise calls the Command class to process their command
			} else {
				currentRoom = Command.processCommand(rooms, currentRoom, commands, inventory, command);
			}
		}
		scanner.close();
	}
}
