/**Package contains all game files. */
package com.hoehn.game;

public final class Opening {

	private Opening() {}

	/** This class prints the opening story and instructions. */
	public static void printOpening() {
		
		System.out.println("Alien Text Adventure Game");
	    System.out.println("------------------------------");
	    System.out.println("You and your crew are on a mission on Mars when your spaceship is invaded by an Alien.");
	    System.out.println("You will need to defeat the Alien before your crew becomes its’ dinner,");
	    System.out.println("but first you will need a collection of items to aid you in your fight.");
	    System.out.println("You will need a space blaster to shoot the alien,");
	    System.out.println("a space phone to call the base station for back up,");
	    System.out.println("space boots for gravitational manipulation to help dodge the aliens’ attacks,");
	    System.out.print("a bowl of Marshmallow Moonies for the energy you will need for the battle,");
	    System.out.print("an infodisk to learn the aliens’ weaknesses,");
	    System.out.println("and a weight to buff yourself up for battle.\n");
	    System.out.println("Movement commands: Go North, Go South, Go East, Go West");
	    System.out.println("Add to inventory: Get <item name>");
	    System.out.println("Type 'Exit' to exit game");
	    System.out.println("Type 'I' to show instructions again");
	}

}
