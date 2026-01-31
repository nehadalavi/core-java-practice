public class Constructor {
    int id;
    String name;

    // Constructor
    Constructor(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        Constructor s1 = new Constructor(1, "Neha");
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
 
