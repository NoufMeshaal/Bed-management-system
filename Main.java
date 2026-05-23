package project;

public class Main {
    public static void main(String[] args) {

        //Create Hospital and Rooms
        Hospital hospital = new Hospital();

        Room room101 = new Room(101, 2);
        hospital.addRoom(room101);

        System.out.println(" {Hospital System Started} ");

        //Create Patients and Staff (Inheritance test)
        Person p1 = new Patient("Noura", "P007");
        Person p2 = new Patient("Teif", "P008");
        Person staff = new Staff("Dr. Farah", "S001", "Surgeon");

        //Polymorphism test
        System.out.println("\n Polymorphism Test ");
        Person[] people = {p1, p2, staff};

        for (Person person : people) {
            System.out.println(person.getDetails());
        }

        //Assigning patients to beds (Composition: Hospital → Room → Bed)
        System.out.println("\n Bed Assignment ");

        Patient patient1 = (Patient) p1;
        Patient patient2 = (Patient) p2;

        Bed bed1 = room101.getBeds().get(0);
        Bed bed2 = room101.getBeds().get(1);

        System.out.println("Assigning " + patient1.getName() + " to Bed 1");
        bed1.assignPatient(patient1);

        System.out.println("Assigning " + patient2.getName() + " to Bed 2");
        bed2.assignPatient(patient2);

        //Test duplicate assignment (logic check)
        System.out.println("\nTrying to assign another patient to Bed 1:");
        bed1.assignPatient(patient2);

        //Display room status
        System.out.println("\n Room Status ");
        room101.displayBeds();

        //Remove patient (testing method)
        System.out.println("\nRemoving patient from Bed 1...");
        bed1.removePatient();

        System.out.println("Bed 1 occupied? " + bed1.isOccupied());

        //Final hospital status
        System.out.println("\n Final Hospital Status ");
        hospital.displayHospital();
    }
}



