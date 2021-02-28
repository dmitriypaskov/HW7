package pashkov;

public class HW1 {

    public static void main(String[] args) {
        // 1) The digital clock shows time in the format from 00:00 to 23:59.
        // Count how many times per day it happens that a symmetrical combination
        // is shown to the left of the colon for the one
        // what's to the right of the colon (e.g. 02:20, 11:11, or 15:51).
        int count = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m <= 59; m++) {
                if (h / 10 % 10 == m % 10 & h % 10 == m / 10 % 10) {
                    count++;
                }
            }
        }
        System.out.println("Total matches : " + count + " .");
    }
}
