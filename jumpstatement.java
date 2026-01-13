public class jumpstatement {

    public static void main(String[] args) {
        System.out.println("--- Demonstrating break and continue in a loop ---");
        
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Continue: Skipping number " + i + " in loop.");
                continue; // Skips the rest of the current iteration
            }

            if (i == 7) {
                System.out.println("Break: Exiting loop when i is " + i + ".");
                break; // Terminates the loop prematurely
            }

            System.out.println("Loop iteration, number: " + i);
        }

        System.out.println("\n--- Demonstrating return from a method ---");
        // Calling a method that uses the return statement
        int result = addNumbers(5, 3);
        System.out.println("Result from addNumbers method: " + result);

        System.out.println("\n--- Demonstrating return in a void method ---");
        // Calling a void method that uses return for an early exit
        checkAge(16);
        checkAge(20);
    }

    // Method with a return type (int)
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // Exits the method and returns a value
        // Any code after this return statement would be unreachable and cause a compiler error
    }

    // Method with a void return type
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("CheckAge: Age " + age + " is under 18. Exiting method early.");
            return; // Exits the void method early
        }
        System.out.println("CheckAge: Age " + age + " is 18 or over. You can vote.");
    }
}
