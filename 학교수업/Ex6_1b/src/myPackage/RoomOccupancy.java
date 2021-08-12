package myPackage;

public class RoomOccupancy {
	private int roomNumber, peopleInRoom;
	private static int totalNumber=0;
	
	public int getPeopleInRoom() {
		return peopleInRoom;
	}
	public int getNumber() {
		return roomNumber;
	}
	public static int getTotal() {
		return totalNumber;
	}
	
	RoomOccupancy(int newRoomNumber, int newPeopleInRoom) {
		roomNumber = newRoomNumber;
		peopleInRoom=newPeopleInRoom;
		totalNumber=totalNumber+peopleInRoom;
	}
	public void addOneToRoom(int roomNumber) {
		peopleInRoom++;
		totalNumber++;
	}
	public void removeOneFromRoom(int roomNumber) {
		if((peopleInRoom>0)&&(totalNumber>0)) {
			peopleInRoom--;
			totalNumber--;
		}
	}

}
