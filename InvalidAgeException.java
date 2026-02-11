// Custom Checked Exception Class
class InvalidAgeException extends Exception {

    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class Geeks {

    // Method that throws custom exception
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {

        try {
            validate(12);   // Change value to test
        } 
        catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
