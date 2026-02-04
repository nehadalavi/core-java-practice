// Encapsulation class
class Encapsulation {

    // private data member
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        obj.setName("Geek");

        System.out.println("Name => " + obj.getName());
    }
}
