/**Package contains all game files. */
package com.hoehn.game;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BattleTest {

    @Test
    void testScoreWhenPlayerWins() {

        List<String> inventory = new ArrayList<>();

        inventory.add("Item1");
        inventory.add("Item2");
        inventory.add("Item3");
        inventory.add("Item4");
        inventory.add("Item5");
        inventory.add("Item6");

        String endGameResult = Battle.initiateBattle(inventory);

        assertTrue(endGameResult.contains("Congratulations! You defeated the Alien!\nThank you for playing!"));
    }

    @Test
    void testScoreWhenPlayerLoses() {

        List<String> inventory = new ArrayList<>();

        inventory.add("Item1");
        inventory.add("Item2");

        String endGameResult = Battle.initiateBattle(inventory);

        assertTrue(endGameResult.contains("You were eaten by the Alien! Game over"));
    }
}
