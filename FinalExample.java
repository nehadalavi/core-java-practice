public class FinalExample {
    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // causes ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("finally block always execute");
        }
    }
}
