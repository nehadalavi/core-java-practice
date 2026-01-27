public class StringMethodsDemo {

    public static void main(String[] args) {

        String s1 = "Java Programming";
        String s2 = "java programming";
        String s3 = "  Hello World  ";
        String s4 = "Java";

        // 1. length()
        System.out.println("Length: " + s1.length());

        // 2. charAt()
        System.out.println("Character at index 2: " + s1.charAt(2));

        // 3. toUpperCase()
        System.out.println("Uppercase: " + s1.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + s1.toLowerCase());

        // 5. equals()
        System.out.println("Equals: " + s1.equals(s2));

        // 6. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));

        // 7. compareTo()
        System.out.println("CompareTo: " + s4.compareTo("Java"));

        // 8. concat()
        System.out.println("Concat: " + s4.concat(" Language"));

        // 9. substring()
        System.out.println("Substring (5): " + s1.substring(5));
        System.out.println("Substring (0,4): " + s1.substring(0, 4));

        // 10. contains()
        System.out.println("Contains 'Java': " + s1.contains("Java"));

        // 11. indexOf()
        System.out.println("Index of 'a': " + s1.indexOf('a'));

        // 12. lastIndexOf()
        System.out.println("Last index of 'a': " + s1.lastIndexOf('a'));

        // 13. replace()
        System.out.println("Replace a with o: " + s4.replace('a', 'o'));

        // 14. trim()
        System.out.println("Trimmed string: '" + s3.trim() + "'");

        // 15. split()
        String langs = "Java,Python,C++,PHP";
        String[] arr = langs.split(",");
        System.out.println("Split result:");
        for (String lang : arr) {
            System.out.println(lang);
        }

        // 16. isEmpty()
        String empty = "";
        System.out.println("Is empty: " + empty.isEmpty());

        // 17. startsWith()
        System.out.println("Starts with Java: " + s1.startsWith("Java"));

        // 18. endsWith()
        System.out.println("Ends with Programming: " + s1.endsWith("Programming"));

        // 19. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf: " + numStr);

        // 20. Immutable nature demo
        String test = "Hello";
        test.concat(" World");
        System.out.println("Immutable String: " + test);
    }
}
