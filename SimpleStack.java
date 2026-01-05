package javaprograms;


import java.util.Scanner;
import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Display stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Push
                    System.out.print("Enter number to push: ");
                    int num = sc.nextInt();
                    stack.push(num);
                    System.out.println(num + " pushed to stack.");

                    // Automatically display stack
                    System.out.println("Current Stack: " + stack);
                    break;

                case 2: // Pop
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Popped element: " + stack.pop());
                        System.out.println("Current Stack: " + stack);
                    }
                    break;

                case 3: // Peek
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Top element is: " + stack.peek());
                    }
                    break;

                case 4: // Check empty
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;

                case 5: // Display stack
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack elements: " + stack);
                    }
                    break;

                case 6: // Exit
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
