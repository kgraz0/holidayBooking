package hotelManagement;
import java.util.ArrayList;

public class Room {
	
	public enum roomType {
		ONE_BEDRM, TWO_BEDRM, FOUR_BEDRM, SIX_BEDRM
	}

	roomType type;
	double price;
	boolean hasWc;
	boolean hasShower;
	boolean isReserved;
	int numOfSingleRoomsLeft;
	int numOfDoubleRoomsLeft;
	int numReservedSingleRooms;
	int numReservedDoubleRooms;
	
	Room() {	
	}
	
	Room(roomType type, double price, boolean isReserved, boolean hasWc, boolean hasShower) {
		this.type = type;
		this.price = price;
		this.isReserved = isReserved;
		this.hasWc = hasWc;
		this.hasShower = hasShower;
	}

	public roomType getType() {
		return type;
	}

	public void setType(roomType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public int getNumOfSingleRoomsLeft() {
		return numOfSingleRoomsLeft;
	}

	public void setNumOfSingleRoomsLeft(int numOfSingleRoomsLeft) {
		this.numOfSingleRoomsLeft = numOfSingleRoomsLeft;
	}

	public int getNumOfDoubleRoomsLeft() {
		return numOfDoubleRoomsLeft;
	}

	public void setNumOfDoubleRoomsLeft(int numOfDoubleRoomsLeft) {
		this.numOfDoubleRoomsLeft = numOfDoubleRoomsLeft;
	}

	public int getNumReservedSingleRooms() {
		return numReservedSingleRooms;
	}

	public void setNumReservedSingleRooms(int numReservedSingleRooms) {
		this.numReservedSingleRooms = numReservedSingleRooms;
	}

	public int getNumReservedDoubleRooms() {
		return numReservedDoubleRooms;
	}

	public void setNumReservedDoubleRooms(int numReservedDoubleRooms) {
		this.numReservedDoubleRooms = numReservedDoubleRooms;
	}

	@Override
	public String toString() {
		return "Room [type=" + type + ", price=" + price + ", hasWc=" + hasWc + ", hasShower=" + hasShower
				+ ", isReserved=" + isReserved + ", numOfSingleRoomsLeft=" + numOfSingleRoomsLeft
				+ ", numOfDoubleRoomsLeft=" + numOfDoubleRoomsLeft + ", numReservedSingleRooms="
				+ numReservedSingleRooms + ", numReservedDoubleRooms=" + numReservedDoubleRooms + "]";
	}
}
