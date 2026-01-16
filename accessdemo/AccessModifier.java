package accessdemo;

// Parent class
public class AccessModifier {

    // 1️⃣ Public variable
    public int publicVar = 10;

    // 2️⃣ Protected variable
    protected int protectedVar = 20;

    // 3️⃣ Default variable (no modifier)
    int defaultVar = 30;

    // 4️⃣ Private variable
    private int privateVar = 40;

    // Public method
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Default method
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Method inside same class (can access all)
    public void showAll() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}

// Child class (same package)
class Child extends AccessModifier {

    public void showFromChild() {
        System.out.println(publicVar);      // ✔
        System.out.println(protectedVar);   // ✔
        System.out.println(defaultVar);     // ✔
        // System.out.println(privateVar);  ❌

        publicMethod();
        protectedMethod();
        defaultMethod();
        // privateMethod(); ❌
    }
}

// Main class
class TestAccess {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        obj.showAll();

        System.out.println(obj.publicVar);     // ✔
        // System.out.println(obj.protectedVar); ❌ outside package
        // System.out.println(obj.defaultVar);   ❌ outside package
        // System.out.println(obj.privateVar);   ❌

        obj.publicMethod();  // ✔
    }
}
