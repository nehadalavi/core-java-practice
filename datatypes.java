public class datatypes {
    

    public static void main(String[] args) {

        

        byte b = 100;                 // 1 byte
        short s = 10000;              // 2 bytes
        int i = 100000;               // 4 bytes
        long l = 1000000000L;         // 8 bytes

        float f = 10.5f;              // 4 bytes
        double d = 99.99;             // 8 bytes

        char c = 'A';                 // 2 bytes
        boolean flag = true;          // 1 bit

       
        String name = "Neha";
        int arr[] = {1, 2, 3, 4, 5};

       

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + flag);

        System.out.println("String value: " + name);
        System.out.println("Array values:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

    

