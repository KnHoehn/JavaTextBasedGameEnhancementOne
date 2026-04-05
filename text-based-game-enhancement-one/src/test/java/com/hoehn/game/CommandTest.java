/**Package contains all game files. */
package com.hoehn.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    List<String> inventory = new ArrayList<>();
    List<String> commands = new ArrayList<>();
    Map<String, Map<String, String>> rooms = new HashMap<>();
    Map<String, String> commonArea = new HashMap<>();
    Map<String, String> kitchen = new HashMap<>();

    @BeforeEach
    void setUp() {
        commands.add("Go East");
        commands.add("Go West");
        commonArea.put("Name", "Common Area");
        commonArea.put("West", "Kitchen");
        commonArea.put("Item", "Space Phone");
        kitchen.put("Name", "Kitchen");
        kitchen.put("East", "Common Area");
        rooms.put("Common Area", commonArea);
        rooms.put("Kitchen", kitchen);
    }

    @Test
    void testMoveRooms() {

        Map<String, String> currentRoom = rooms.get("Common Area");

        currentRoom = Command.processCommand(rooms, currentRoom, commands, inventory, "Go West");

        assertEquals("Kitchen", currentRoom.get("Name"));
    }

    @Test
    void testRoomsNotMoved() {

        Map<String, String> currentRoom = rooms.get("Common Area");

        currentRoom = Command.processCommand(rooms, currentRoom, commands, inventory, "Go North");

        assertEquals("Common Area", currentRoom.get("Name"));
    }

    @Test
    void testItemPickUp() {

        Map<String, String> currentRoom = rooms.get("Common Area");

        currentRoom = Command.processCommand(rooms, currentRoom, commands, inventory, "Get Space Phone");

        assertEquals("Common Area", currentRoom.get("Name"));
        assertNull(commonArea.get("Item"));
        assertTrue(inventory.contains("Space Phone"));
    }

    @Test
    void testItemNotPickedUp() {

        Map<String, String> currentRoom = rooms.get("Common Area");

        currentRoom = Command.processCommand(rooms, currentRoom, commands, inventory, "Get Weight");

        assertEquals("Common Area", currentRoom.get("Name"));
        assertNotNull(commonArea.get("Item"));
        assertFalse(inventory.contains("Space Phone"));
    }


}
