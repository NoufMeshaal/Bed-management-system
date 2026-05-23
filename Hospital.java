package project;
import java.util.ArrayList;

class Hospital {
    private ArrayList<Room> rooms = new ArrayList<>();

    public void addRoom(Room r) {
        rooms.add(r);
    }

    public void assignBed(Patient p) {
        for (Room r : rooms) {
            for (Bed b : r.getBeds()) {
                if (!b.isOccupied()) {
                    b.assignPatient(p);
                    return;
                }
            }
        }
        System.out.println("No available beds.");
    }

    public void displayHospital() {
        for (Room r : rooms) {
            r.displayBeds();
            System.out.println("-------------------");
        }
    }
}