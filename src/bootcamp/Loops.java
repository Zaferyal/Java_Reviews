package bootcamp;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        for(int i =1; i < 16; i++){
            System.out.println(i);
        }


        System.out.println("------------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int num = scan.nextInt();

        while(num < 10){
            System.out.println("Re-enter your number:");
            num = scan.nextInt();
        }

        System.out.println("You have entered: "+num);


        System.out.println("------------------------------------");

        while(true){
            System.out.println("Enter an odd number:");
            int oddNumber = scan.nextInt();
            if(oddNumber % 2 != 0){
                System.out.println(oddNumber + " is an odd number");
                 break; // exits the loop
                // continue; // skips the current iteration
               // return; //exits the current method
            }
        }


    }


}
