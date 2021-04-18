package hotelManagement;

public class TestingMain {

	public static void main (String[] args) {
		
		//String inputFile = "./CSVfiles/hotelRoomInfo.csv";
		
		Hotel newHotel = new Hotel(1, "Brixton House", "32 Shropshire Road", true, true, true, true, true, true, true, true, true);
		Hotel newHotel1 = new Hotel(2, "Canary Port", "55 Canary Road", true, true, true, true, true, true, false, true, false);
		
		newHotel.addRoomList("./CSVfiles/hotelRoomInfo.csv");
		//newHotel.getRoomList();
		
		//newHotel1.addRoomList("./CSVfiles/hotelRoomInfo2.csv");
		//newHotel1.getRoomList();
		
		//System.out.println(newHotel.getSpecificRoom(101));
		Booking newBooking = new Booking("Bob Jarvis", newHotel, newHotel.getSpecificRoom((101)));
	System.out.println(newBooking.toString());
	}
}