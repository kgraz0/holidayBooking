package holidayBooking;

public class Hotel extends Room {
	
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
	
	Hotel(String name, String address, boolean hasLinen, boolean hasTowels, boolean hasParking, boolean hasWifi, boolean hasLockers, boolean hasLaundry, boolean has24hrReception, boolean hasHousekeeping, boolean hasBreakfast) {
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
}