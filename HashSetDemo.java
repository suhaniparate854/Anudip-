package javaprograms;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);

        System.out.println("Elements in the HashSet: " + set);

        if (set.contains(10)) {
            System.out.println("The set contains the number 10.");
        } else {
            System.out.println("The set does not contain the number 10.");
        }

        set.remove(15);
        System.out.println("After removing 15: " + set);

        System.out.println("Size of the HashSet: " + set.size());
    }
}
