package javaprograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {
    public static void main(String[] args) {
        Map<String, Integer> cricketerScores = new HashMap<>();

        cricketerScores.put("Virat Kohli", 75);
        cricketerScores.put("Rohit Sharma", 88);
        cricketerScores.put("MS Dhoni", 65);
        cricketerScores.put("KL Rahul", 50);

        System.out.println("Cricketer Scores: " + cricketerScores);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the batsman to search: ");
        String batsman = sc.nextLine();

        if (cricketerScores.containsKey(batsman)) {
            int score = cricketerScores.get(batsman);
            System.out.println(batsman + "'s score is: " + score);
        } else {
            System.out.println("Batsman not found!");
        }

        sc.close();
    }
}
