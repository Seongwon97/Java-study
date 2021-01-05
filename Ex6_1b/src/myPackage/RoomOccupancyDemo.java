package myPackage;
import java.util.Scanner;

public class RoomOccupancyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int peopleNum1, roomNum1,peopleNum2, roomNum2;
		System.out.print("Enter the Room Number: ");
		roomNum1=keyboard.nextInt();
		System.out.print("Enter the people in room:  ");
		peopleNum1=keyboard.nextInt();
		RoomOccupancy room1 = new RoomOccupancy(roomNum1,peopleNum1);
		System.out.print("Room number "+room1.getNumber()+",and there are "+ room1.getPeopleInRoom());
		System.out.println(" people in the room, and total number of people is "+ RoomOccupancy.getTotal());
		System.out.println("Add one to room number "+ room1.getNumber());
		room1.addOneToRoom(roomNum1);
		System.out.print("Room number "+room1.getNumber()+",and there are "+ room1.getPeopleInRoom());
		System.out.println(" people in the room, and total number of people is "+ RoomOccupancy.getTotal());
		System.out.println("Remove one from room number "+ room1.getNumber());
		room1.removeOneFromRoom(roomNum1);
		System.out.print("Room number "+room1.getNumber()+",and there are "+ room1.getPeopleInRoom());
		System.out.println(" people in the room, and total number of people is "+ RoomOccupancy.getTotal());
		
		
		System.out.print("Enter the Room Number: ");
		roomNum2=keyboard.nextInt();
		System.out.print("Enter the people in room:  ");
		peopleNum2=keyboard.nextInt();
		RoomOccupancy room2 = new RoomOccupancy(roomNum2,peopleNum2);
		System.out.print("Room number "+room2.getNumber()+",and there are "+ room2.getPeopleInRoom());
		System.out.println(" people in the room, and total number of people is "+ RoomOccupancy.getTotal());
		System.out.println("Add one to room number "+ room2.getNumber());
		room2.addOneToRoom(roomNum2);
		System.out.print("Room number "+room2.getNumber()+",and there are "+ room2.getPeopleInRoom());
		System.out.println(" people in the room, and total number of people is "+ RoomOccupancy.getTotal());
		System.out.println("Remove one from room number "+ room2.getNumber());
		room2.removeOneFromRoom(roomNum2);
		System.out.print("Room number "+room2.getNumber()+",and there are "+ room2.getPeopleInRoom());
		System.out.println(" people in the room, and total number of people is "+ RoomOccupancy.getTotal());

	}

}
