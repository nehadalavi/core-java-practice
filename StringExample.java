public class StringExample {
    public static void main(String[] args) {

        // Creating strings
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        // Comparing strings using ==
        System.out.println("s1 == s2 : " + (s1 == s2)); // true (same SCP reference)
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (heap vs SCP)

        // Comparing strings using equals()
        System.out.println("s1 equals s3 : " + s1.equals(s3)); // true

        // String immutability example
        String s4 = s1.concat(" Programming");
        System.out.println("s1 : " + s1); // Java
        System.out.println("s4 : " + s4); // Java Programming

        // String methods
        System.out.println("Length : " + s4.length());
        System.out.println("Uppercase : " + s4.toUpperCase());
        System.out.println("Substring : " + s4.substring(0, 4));
    }
}
