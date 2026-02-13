import java.util.regex.*;

public class MatcherExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("java");
        Matcher m = p.matcher("java is easy. java is powerful.");

        while (m.find()) {
            System.out.println("Found at index: " + m.start());
        }
    }
}
