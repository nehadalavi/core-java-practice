class MethodDemo {

    // 🔹 Instance method (needs object to call)
    void showMessage() {
        System.out.println("This is an INSTANCE method");
    }

    // 🔹 Static method (called using class name)
    static void displayMessage() {
        System.out.println("This is a STATIC method");
    }

    public static void main(String[] args) {

        // Calling static method
        MethodDemo.displayMessage();

        // Creating object to call instance method
        MethodDemo obj = new MethodDemo();
        obj.showMessage();
    }
}
