package holidayBooking;

public class Room {
	
	String type;
	double price;
	boolean hasWc;
	boolean hasShower;
	int numSingleRooms;
	int numDoubleRooms;
	
	Room() {
		
	}
	
	Room(String type, double price, boolean hasWc, boolean hasShower) {
		this.type = type;
		this.price = price;
		this.hasWc = hasWc;
		this.hasShower = hasShower;
	}
}
