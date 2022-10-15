package week03_review;

public class DaysInWeek {

    public static void main(String[] args) {

        int day =  -200;

        if (day >= 1 && day <= 7) {

            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else { // day is invalid. day < 1 or  day > 7

            if (day < 1) {
                System.out.println("Minimum day number can not be less than 1");
            } else {
                System.out.println("Maximum day number can not be greater than 7");
            }

        }


    }

}
