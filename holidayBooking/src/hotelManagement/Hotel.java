package hotelManagement;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Hotel {
	
	int id;
	String name;
	String address;
	boolean hasLinen;
	boolean hasTowels;
	boolean hasParking;
	boolean hasWifi;
	boolean hasLockers;
	boolean hasLaundry;
	boolean has24hrReception;
	boolean hasHousekeeping;
	boolean hasBreakfast;
	HashMap<Integer, Room> roomListHash = new HashMap<Integer, Room>();
	
	Hotel(int id, String name, String address, boolean hasLinen, boolean hasTowels, boolean hasParking, boolean hasWifi, boolean hasLockers, boolean hasLaundry, boolean has24hrReception, boolean hasHousekeeping, boolean hasBreakfast) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.hasLinen = hasLinen;
		this.hasTowels = hasTowels;
		this.hasParking = hasParking;
		this.hasWifi = hasWifi;
		this.hasLockers = hasLockers;
		this.hasLaundry = hasLaundry;
		this.has24hrReception = has24hrReception;
		this.hasHousekeeping = hasHousekeeping;
		this.hasBreakfast = hasBreakfast;
	}
	
	public void addRoomList(String roomInfoDirectory) {
		
		try {
			CSVReader reader = new CSVReader(new FileReader(roomInfoDirectory));
			String[] nextLine;
			
			while ((nextLine = reader.readNext()) != null) {
				roomListHash.put(Integer.parseInt(nextLine[0]), new Room(nextLine[1], Double.parseDouble(nextLine[2]), Boolean.parseBoolean(nextLine[3]), Boolean.parseBoolean(nextLine[4])));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Invalid source directory.");
		} catch (CsvValidationException e) {
			System.out.println("Line is invalid.");
		} catch (IOException e) {
			System.out.println("Issue reading the file.");
		}
	}
	
	public void getRoomList() {
		for (Map.Entry<Integer, Room> entry : roomListHash.entrySet()) {
			System.out.println(entry);
		}
		//System.out.println(roomListHash);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isHasLinen() {
		return hasLinen;
	}

	public void setHasLinen(boolean hasLinen) {
		this.hasLinen = hasLinen;
	}

	public boolean isHasTowels() {
		return hasTowels;
	}

	public void setHasTowels(boolean hasTowels) {
		this.hasTowels = hasTowels;
	}

	public boolean isHasParking() {
		return hasParking;
	}

	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	public boolean isHasLockers() {
		return hasLockers;
	}

	public void setHasLockers(boolean hasLockers) {
		this.hasLockers = hasLockers;
	}

	public boolean isHasLaundry() {
		return hasLaundry;
	}

	public void setHasLaundry(boolean hasLaundry) {
		this.hasLaundry = hasLaundry;
	}

	public boolean isHas24hrReception() {
		return has24hrReception;
	}

	public void setHas24hrReception(boolean has24hrReception) {
		this.has24hrReception = has24hrReception;
	}

	public boolean isHasHousekeeping() {
		return hasHousekeeping;
	}

	public void setHasHousekeeping(boolean hasHousekeeping) {
		this.hasHousekeeping = hasHousekeeping;
	}

	public boolean isHasBreakfast() {
		return hasBreakfast;
	}

	public void setHasBreakfast(boolean hasBreakfast) {
		this.hasBreakfast = hasBreakfast;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", address=" + address + ", hasLinen=" + hasLinen + ", hasTowels=" + hasTowels
				+ ", hasParking=" + hasParking + ", hasWifi=" + hasWifi + ", hasLockers=" + hasLockers + ", hasLaundry="
				+ hasLaundry + ", has24hrReception=" + has24hrReception + ", hasHousekeeping=" + hasHousekeeping
				+ ", hasBreakfast=" + hasBreakfast + "]";
	}
}