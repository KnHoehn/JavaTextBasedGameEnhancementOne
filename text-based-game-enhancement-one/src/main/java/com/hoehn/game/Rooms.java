/**Package contains all game files */
package com.hoehn.game;

import java.util.HashMap;
import java.util.Map;

public final class Rooms {

	/** Key for room name. */
	private static final String NAME = "Name";
	/** Key for room item. */
	private static final String ITEM = "Item";
	/** Key for room description. */
	private static final String ITEM_DESCRIPTION = "Item Description";
	/** Key for direction north.  */
	private static final String NORTH = "North";
	/** Key for direction south.  */
	private static final String SOUTH = "South";
	/** Key for direction east.  */
	private static final String EAST = "East";
	/** Key for direction west.  */
	private static final String WEST = "West";
	/** Value for the Engine Room.  */
	private static final String ENGINE_ROOM = "Engine Room";
	/** Value for the Control Room.  */
	private static final String CONTROL_ROOM = "Control Room";
	/** Value for the Common Area. */
	private static final String COMMON_AREA = "Common Area";
	/** Value for the Kitchen. */
	private static final String KITCHEN = "Kitchen";
	/** Value for the Armory.  */
	private static final String ARMORY = "Armory";
	/** Value for the Gym. */
	private static final String GYM = "Gym";
	/** Value for the Crew Quarters.  */
	private static final String CREW_QUARTERS = "Crew Quarters";
	/** Value for the Entrance Vestibule.  */
	private static final String ENTRANCE_VESTIBULE = "Entrance Vestibule";

	private Rooms() {}

	/** This method creates the rooms mapping and stores it into a nested hashmap.
	 *
	 * @return the nested hashmap for the room mapping. */
	public static Map<String, Map<String, String>> createRooms() {
		
		Map<String, Map<String, String>> rooms = new HashMap<>();
		Map<String, String> engineRoom = new HashMap<>();
		Map<String, String> controlRoom = new HashMap<>();
		Map<String, String> commonArea = new HashMap<>();
		Map<String, String> kitchen = new HashMap<>();
		Map<String, String> gym = new HashMap<>();
		Map<String, String> crewQuarters = new HashMap<>();
		Map<String, String> armory = new HashMap<>();
		Map<String, String> entranceVestibule = new HashMap<>();
		
		engineRoom.put(NAME, ENGINE_ROOM);
		engineRoom.put(SOUTH, CONTROL_ROOM);
		
		controlRoom.put(NAME, CONTROL_ROOM);
		controlRoom.put(NORTH, ENGINE_ROOM);
		controlRoom.put(WEST, COMMON_AREA);
		controlRoom.put(ITEM, "Infodisk");
		controlRoom.put(ITEM_DESCRIPTION, "You see an Infodisk laying on the command center");
		
		commonArea.put(NAME, COMMON_AREA);
		commonArea.put(EAST, CONTROL_ROOM);
		commonArea.put(WEST, KITCHEN);
		commonArea.put(NORTH, ARMORY);
		commonArea.put(SOUTH, GYM);
		commonArea.put(ITEM, "Space Phone");
		commonArea.put(ITEM_DESCRIPTION, "You see a Space Phone laying on the table");
		
		kitchen.put(NAME, KITCHEN);
		kitchen.put(EAST, COMMON_AREA);
		kitchen.put(ITEM, "Marshmallow Moonies");
		kitchen.put(ITEM_DESCRIPTION, "You see a bowl of Marshmallow Moonies sitting on the counter");
		
		gym.put(NAME, GYM);
		gym.put(NORTH, COMMON_AREA);
		gym.put(EAST, CREW_QUARTERS);
		gym.put(ITEM, "Weight");
		gym.put(ITEM_DESCRIPTION, "You see a Weight sitting on the workout bench");
		
		crewQuarters.put(NAME, CREW_QUARTERS);
		crewQuarters.put(WEST, GYM);
		crewQuarters.put(ITEM, "Space Boots");
		crewQuarters.put(ITEM_DESCRIPTION, "You see a pair of Space Boots in the closet");
		
		armory.put(NAME, ARMORY);
		armory.put(SOUTH, COMMON_AREA);
		armory.put(EAST, ENTRANCE_VESTIBULE);
		armory.put(ITEM, "Space Blaster");
		armory.put(ITEM_DESCRIPTION, "You see a Space Blaster hanging on the wall");
		
		entranceVestibule.put(NAME, ENTRANCE_VESTIBULE);
		
		rooms.put(ENGINE_ROOM, engineRoom);
		rooms.put(CONTROL_ROOM, controlRoom);
		rooms.put(COMMON_AREA, commonArea);
		rooms.put(KITCHEN, kitchen);
		rooms.put(GYM, gym);
		rooms.put(CREW_QUARTERS, crewQuarters);
		rooms.put(ARMORY, armory);
		rooms.put(ENTRANCE_VESTIBULE, entranceVestibule);
		
		return rooms;
	}
}
