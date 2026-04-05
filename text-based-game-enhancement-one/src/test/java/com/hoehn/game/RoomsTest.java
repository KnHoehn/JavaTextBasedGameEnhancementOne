/**Package contains all game files. */
package com.hoehn.game;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RoomsTest {

    @Test
    void testCreateRooms() {
        Map<String, Map<String, String>> rooms = Rooms.createRooms();

        assertTrue(rooms.containsKey("Engine Room"));
        assertTrue(rooms.containsKey("Control Room"));
        assertTrue(rooms.containsKey("Kitchen"));
        assertTrue(rooms.containsKey("Common Area"));
        assertTrue(rooms.containsKey("Armory"));
        assertTrue(rooms.containsKey("Crew Quarters"));
        assertTrue(rooms.containsKey("Gym"));
        assertTrue(rooms.containsKey("Entrance Vestibule"));
    }
}
