/**Package contains all game files. */
package com.hoehn.game;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementTest {

    @Test
    void testAddToInventory() {

        List<String> inventory = new ArrayList<>();
        Map<String, String> kitchen = new HashMap<>();

        kitchen.put("Name", "kitchen");
        kitchen.put("Item", "Marshmallow Moonies");

        InventoryManagement.manageInventory(inventory, "Marshmallow Moonies", kitchen);

        assertNull(kitchen.get("Item"));
        assertTrue(inventory.contains("Marshmallow Moonies"));
    }

    @Test
    void testNotAddedToInventory() {

        List<String> inventory = new ArrayList<>();
        Map<String, String> kitchen = new HashMap<>();

        kitchen.put("Name", "kitchen");
        kitchen.put("Item", "Marshmallow Moonies");

        InventoryManagement.manageInventory(inventory, "Infodisk", kitchen);

        assertNotNull(kitchen.get("Item"));
        assertFalse(inventory.contains("Infodisk"));
    }
}
