public class conditinalstatement {

    public static void main(String[] args) {

        int number = -5;
        int marks = 78;
        int age = 20;
        int weight = 55;
        int day = 3;

        // 1️⃣ Simple if
        if (number < 0) {
            System.out.println("Number is negative");
        }

        // 2️⃣ if-else
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // 3️⃣ if - else if - else ladder
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // 4️⃣ Nested if
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("Eligible for blood donation");
            } else {
                System.out.println("Not eligible due to weight");
            }
        } else {
            System.out.println("Not eligible due to age");
        }

        // 5️⃣ switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 6️⃣ Ternary operator (conditional operator)
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}
