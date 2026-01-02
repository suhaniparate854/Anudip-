package javaprograms;

import java.time.Month;

class MonthDays {
    public static void main(String[] args) {

        for (Month m : Month.values()) {
            System.out.println(m + " : " + m.length(false) + " days");
        }
    }
}
