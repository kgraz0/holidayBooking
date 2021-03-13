package holidayBooking;

public class TestingMain {
	
	public static void main (String[] args) {
		Hotel newHotel = new Hotel("Brixton House", "32 Shropshire Road", true, true, true, true, true, true, true, true, true);
		
		System.out.println(newHotel.isHasLinen());
	}
}
