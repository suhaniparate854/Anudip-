package javaprograms;
import java.util.ArrayList;
import java.util.Scanner;

class SumOfEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Taking user input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        int sum = 0;

        
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);

        sc.close();
    }
}
