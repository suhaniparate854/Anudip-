package javaprograms;

import java.util.ArrayList;
import java.util.List;

class ReverseStringList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("HTML");

        System.out.println("Reversed List:");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
