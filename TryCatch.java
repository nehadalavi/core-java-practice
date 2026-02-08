public class TryCatch {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // Exception
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}
