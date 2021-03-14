package hotelManagement;

public class Room {

	String type;
	double price;
	boolean isReserved;
	boolean hasWc;
	boolean hasShower;
	
	Room(String type, double price, boolean hasWc, boolean hasShower) {
		this.type = type;
		this.price = price;
		this.hasWc = hasWc;
		this.hasShower = hasShower;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public boolean isHasWc() {
		return hasWc;
	}

	public void setHasWc(boolean hasWc) {
		this.hasWc = hasWc;
	}

	public boolean isHasShower() {
		return hasShower;
	}

	public void setHasShower(boolean hasShower) {
		this.hasShower = hasShower;
	}

	@Override
	public String toString() {
		return "Room [type=" + type + ", price=" + price + ", isReserved=" + isReserved + ", hasWc=" + hasWc
				+ ", hasShower=" + hasShower + "]";
	}
}
