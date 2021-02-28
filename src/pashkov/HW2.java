package pashkov;

public class HW2 {

    public static void main(String[] args) {
        // 2) Find the number of lucky tram tickets from 000001 to 999999
        //  (those with the sum of the first 3 digits equal to the sum of the last 3)
        int count = 0;
        for (int i = 1000001; i <= 1999999; i++) {
            String str = Integer. toString(i);
            char n1 = str.charAt(6);
            char n2 = str.charAt(5);
            char n3 = str.charAt(4);
            char n4 = str.charAt(3);
            char n5 = str.charAt(2);
            char n6 = str.charAt(1);
            if (n1+ n2 + n3 == n4 + n5 + n6) {
                count++;
            }
        }
        System.out.println(count);
    }
}
