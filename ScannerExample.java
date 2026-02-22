import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();   // Read String
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();        // Read Integer
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        sc.close();   // Close scanner
    }
}