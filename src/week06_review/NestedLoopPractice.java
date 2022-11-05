package week06_review;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of minutes");
        int minutes = scan.nextInt();

        scan.close();

        for (int i = minutes; i > 0; i--) {
            for (int z = 59; z >= 0; z--) {
                System.out.println((i - 1) + " minutes and " + z + " seconds");
            }
        }

    }

}
