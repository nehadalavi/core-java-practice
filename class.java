class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();  // object creation
        s1.id = 1;
        s1.name = "Neha";
        s1.display();
    }
}
