package javaprograms;

import java.util.Scanner;

interface StringOperation {
    String operate(String s);
}

class LambdaString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringOperation upper = s -> s.toUpperCase();
        StringOperation lower = s -> s.toLowerCase();
        StringOperation reverse = s -> new StringBuilder(s).reverse().toString();

        System.out.println("Uppercase: " + upper.operate(str));
        System.out.println("Lowercase: " + lower.operate(str));
        System.out.println("Reversed: " + reverse.operate(str));

        sc.close();
    }
}