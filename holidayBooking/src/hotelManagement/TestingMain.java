package hotelManagement;

public class TestingMain {
	
	public static void main (String[] args) {
		Hotel newHotel = new Hotel("Brixton House", "32 Shropshire Road", true, true, true, true, true, true, true, true, true);
		Room newRoom1 = new Room(Room.roomType.ONE_BEDRM, 19.99, false, true, true);

		Booking booking1 = new Booking("Chris James", newHotel, newRoom1);
		
		System.out.println(booking1.getRoom());
	}
}