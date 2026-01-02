package javaprograms;

import java.util.Scanner;

interface Arithmetic {
    int operation(int a, int b);
}

class LambdaUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Arithmetic add = (x, y) -> x + y;
        Arithmetic sub = (x, y) -> x - y;
        Arithmetic mul = (x, y) -> x * y;
        Arithmetic div = (x, y) -> x / y;

        System.out.println("Addition: " + add.operation(a, b));
        System.out.println("Subtraction: " + sub.operation(a, b));
        System.out.println("Multiplication: " + mul.operation(a, b));
        System.out.println("Division: " + div.operation(a, b));

        sc.close();
    }
}

