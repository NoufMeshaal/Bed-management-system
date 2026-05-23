package project;

class Patient extends Person {

    public Patient(String name, String id) {
        super(name, id);
    }

    @Override
    public String getDetails() {
        return "Patient: " + getName() + " | ID: " + getId();
    }
}