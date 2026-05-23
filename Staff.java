package project;

class Staff extends Person { //inheritance relationship
    private String role;

    public Staff(String name, String id, String role) {
        super(name, id);
        this.role = role;
    }
    
    //Setter & getter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String getDetails() {
    	return "Staff: " + getName() + " | ID: " + getId() + " | Role: " + role;
    }
}
