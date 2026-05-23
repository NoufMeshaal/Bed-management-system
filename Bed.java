package project;

class Bed { //Composition, Bed is a part of room. it can't exists without it
    private int bedNumber;
    private Patient patient;

    public Bed(int bedNumber) {
        this.bedNumber = bedNumber;
    }
    
    // Getter & Setter
    public int getBedNumber() {
        return bedNumber;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    
    public boolean isOccupied() {
        return patient != null;
    }

    public void assignPatient(Patient p) {
        if (!isOccupied()) {
            patient = p;
            System.out.println("Patient assigned to Bed " + bedNumber);
        } else {
            System.out.println("Bed already occupied.");
        }
    }

    public void removePatient() {
        if (isOccupied()) {
            System.out.println("Patient discharged from Bed " + bedNumber);
            patient = null;
        }
    }

    public void display() {
        if (isOccupied()) {
            System.out.println("Bed " + bedNumber + " → " + patient.getDetails());
        } else {
            System.out.println("Bed " + bedNumber + " → Empty");
        }
    }
}
