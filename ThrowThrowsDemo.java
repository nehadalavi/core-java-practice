class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class ThrowThrowsDemo {

    static void checkAge(int age) throws AgeException {

        if (age < 18) {
            throw new AgeException("Age must be 18 or above");
        }
        System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
