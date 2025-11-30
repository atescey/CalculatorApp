import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        boolean keepRunning = true;

        System.out.println("Welcome to the Advanced Calculator!");
        System.out.println("Available operations: +  -  *  /  ^  %  sqrt");
        System.out.println("Type 'exit' to close.");

        while (keepRunning) {
            System.out.print("\nEnter operation: ");
            String operation = input.next();

            if (operation.equalsIgnoreCase("exit")) {
                keepRunning = false;
                System.out.println("Goodbye!");
                break;
            }

            if (operation.equalsIgnoreCase("sqrt")) {
                System.out.print("Enter number: ");
                double num = input.nextDouble();
                result = Math.sqrt(num);
                System.out.println("√" + num + " = " + result);
            } else {
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    case "^":
                        result = Math.pow(num1, num2);
                        break;
                    case "%":
                        result = num1 % num2;
                        break;
                    default:
                        System.out.println("Unknown operation.");
                        continue;
                }

                System.out.println("Result: " + result);
            }
        }

        input.close();
    }
}
