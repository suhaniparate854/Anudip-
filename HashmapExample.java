package javaprograms;


import java.util.HashMap;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Suhani");
        map.put(2, "Shital");
        map.put(3, "Sharad");
        map.put(4, "Shivam");

        System.out.println("HashMap: " + map);

        map.put(2, "Blueberry"); 

        System.out.println("Updated HashMap: " + map);

        map.put(5, "Elderberry");

        System.out.println("Final HashMap: " + map);
    }
}