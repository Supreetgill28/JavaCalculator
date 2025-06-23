import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();
            System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
            choice = scanner.nextInt();
            int result = 0;
            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (num2 != 0) {
                        System.out.println("Result: " + result);
                    }
                    break;
                case 5:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("INVALID CHOICE. Please choose valid operation.");
                    break;
            }
        }
        scanner.close();
    }
}

