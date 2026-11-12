package sample2;

import java.util.ArrayList;

public class World {
	public static ArrayList<Room>rooms=new ArrayList<>();
	public static Room buildWorld() {
		Items light=new Flashlight();
		Items safe=new Safe();
		Items couch=new Items("couch", true);
		Items musicbox=new Items("musicbox", false);
		Items knife=new Items("knife", true);
		Items orb=new Items("theorb", true);
		Items bed=new Items("bed", false);
	
		theNPC BOBO=new theNPC("bobo");
		BOBO.setCharName("bobo");
		
		Room livingRoom=new Room("Living Room", "This is a small living room with a couch and coffee table and a TV.", false);
		Room Kitchen=new Room("The Kitchen", "where you make food", true);
		Room Office=new Room("The Office", "to get stuff done", false);
		Room Bedroom=new Room("The Bedroom", "to rest in", true);
		Room Attic=new Room("Attic", "lots of old stuff", false);
		Room Garage=new Room("Garage", "somethings", true);
		
		livingRoom.addItem(musicbox);
		Kitchen.addItem(knife);
		Kitchen.addItem(light);
		Kitchen.addItem(orb);
		Bedroom.addItem(bed);
		livingRoom.addItem(couch);
		livingRoom.addItem(safe); //for testing
		
		livingRoom.addExit(Bedroom, 2);
		livingRoom.addExit(Office, 1);
		livingRoom.addExit(Kitchen, 0);
		Kitchen.addExit(Garage, 3);
		Kitchen.addExit(livingRoom, 1);
		Garage.addExit(Kitchen, 2);
		Office.addExit(livingRoom, 0);
		Bedroom.addExit(livingRoom, 3);
		Bedroom.addExit(Attic, 4);
		Attic.addExit(Bedroom, 5);
		
		return livingRoom;
	}
}