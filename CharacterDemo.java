public class CharacterDemo {
    public static void main(String[] args) {

        char ch = 'a';

        System.out.println("Is Letter: " + Character.isLetter(ch));
        System.out.println("Is Digit: " + Character.isDigit(ch));
        System.out.println("Is Uppercase: " + Character.isUpperCase(ch));
        System.out.println("Convert to Uppercase: " + Character.toUpperCase(ch));
    }
}
