package project;
import java.util.ArrayList;

class Room {
    private int roomNumber;
    private ArrayList<Bed> beds; //using array for assigning the beds

    public Room(int roomNumber, int numberOfBeds) {
        this.roomNumber = roomNumber;
        beds = new ArrayList<>();

        for (int i = 1; i <= numberOfBeds; i++) {
            beds.add(new Bed(i));
        }
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<Bed> getBeds() {
        return beds;
    }

    public void displayBeds() {
        System.out.println("Room " + roomNumber + ":");
        for (Bed b : beds) {
            b.display();
        }
    }
}
