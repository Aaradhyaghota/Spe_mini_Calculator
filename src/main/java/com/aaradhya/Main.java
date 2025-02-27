package com.aaradhya;
import java.util.Scanner;



public class Main {

    public static double sqrt(double x) {
            return Math.sqrt(x);
    }

    public static long factorial(int x) {
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double naturalLog(double x) {
        return Math.log(x);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: \n" +
                "1: Square root\n" +
                "2: Factorial\n" +
                "3: Natural logarithm\n" +
                "4: Power function\n");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a number for square root:");
                double numSqrt = sc.nextDouble();
                System.out.println("Result: " + sqrt(numSqrt));
                break;
            case 2:
                System.out.println("Enter a number for factorial:");
                int numFact = sc.nextInt();
                System.out.println("Result: " + factorial(numFact));
                break;
            case 3:
                System.out.println("Enter a number for natural logarithm:");
                double numLn = sc.nextDouble();
                System.out.println("Result: " + naturalLog(numLn));
                break;
            case 4:
                System.out.println("Enter the base and exponent:");
                double base = sc.nextDouble();
                double exponent = sc.nextDouble();
                System.out.println("Result: " + power(base, exponent));
                break;
            default:
                System.out.println("Invalid choice!");
            }
        sc.close();
    }
}