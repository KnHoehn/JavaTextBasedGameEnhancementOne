/**Package contains all game files. */
package com.hoehn.game;

import java.util.List;

public final class Battle {

	/** Number of items needed to be in inventory to win the game. */
	private static final int NUM_ITEMS_TO_WIN = 6;

	private Battle() {}

	/** This method determine if the user won or lost against the alien.
	 *
	 * @param inventory of the player.
	 * @return the string to be printed depending on if the player wins or loses.
	 * */
	public static String initiateBattle(final List<String> inventory) {

		String playerWins = "Congratulations! You defeated the Alien!\nThank you for playing!";
		String playerLoses = "You were eaten by the Alien! Game over";
		int totalInventory = inventory.size();
		System.out.println("You see the Alien");
		System.out.println("A battle ensues");
		System.out.println("...");
		// If player has all obtainable items, player wins
		if (totalInventory == NUM_ITEMS_TO_WIN) {
			return playerWins;
			// Else loses
		} else {
			return playerLoses;
		}
	}
}
