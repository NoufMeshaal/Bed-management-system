package project;

abstract class Person { //abstract class because we don't need object from it
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    // Getter
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public abstract String getDetails(); //abstract method 
}
