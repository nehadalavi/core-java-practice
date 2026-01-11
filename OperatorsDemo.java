public class OperatorsDemo {

    public static void main(String[] args) {

        // 1️⃣ Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // 2️⃣ Unary Operators
        int x = 10, y = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("Postincrement: " + (x++));
        System.out.println("Preincrement: " + (++x));
        System.out.println("Postdecrement: " + (y--));
        System.out.println("Predecrement: " + (--y));

        // 3️⃣ Assignment Operators
        int n = 10;
        System.out.println("\nAssignment Operators:");
        n += 5;
        System.out.println("After += : " + n);
        n *= 2;
        System.out.println("After *= : " + n);
        n -= 5;
        System.out.println("After -= : " + n);
        n /= 2;
        System.out.println("After /= : " + n);
        n %= 3;
        System.out.println("After %= : " + n);

        // 4️⃣ Relational Operators
        int p = 10, q = 3, r = 5;
        System.out.println("\nRelational Operators:");
        System.out.println("p > q: " + (p > q));
        System.out.println("p < q: " + (p < q));
        System.out.println("p >= q: " + (p >= q));
        System.out.println("p <= q: " + (p <= q));
        System.out.println("p == r: " + (p == r));
        System.out.println("p != r: " + (p != r));

        // 5️⃣ Logical Operators
        boolean m = true, n1 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("m && n1: " + (m && n1));
        System.out.println("m || n1: " + (m || n1));
        System.out.println("!m: " + (!m));

        // 6️⃣ Ternary Operator
        int c = 20, d = 10, e = 30;
        int result = (c > d) ? (c > e ? c : e) : (d > e ? d : e);
        System.out.println("\nTernary Operator:");
        System.out.println("Max of three numbers: " + result);

        // 7️⃣ Bitwise Operators
        int u = 0b1010, v = 0b1100;
        System.out.println("\nBitwise Operators:");
        System.out.println("u & v: " + (u & v));
        System.out.println("u | v: " + (u | v));
        System.out.println("u ^ v: " + (u ^ v));
        System.out.println("~u: " + (~u));
        System.out.println("u << 2: " + (u << 2));
        System.out.println("v >> 1: " + (v >> 1));
        System.out.println("v >>> 1: " + (v >>> 1));

       
        System.out.println("\nInstanceof Operator:");
        String str = "Hello";
        System.out.println(str instanceof String);

        Object obj = new Integer(10);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}
