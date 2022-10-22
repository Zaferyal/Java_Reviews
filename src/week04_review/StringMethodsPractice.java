package week04_review;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char ch = str.charAt(1);

        int length = str.length();


        System.out.println(ch);
        System.out.println(length);

        int lastIndex = str.length() - 1;

        char ch2 = str.charAt(lastIndex);

        System.out.println(ch2);


        int indexOfE = str.indexOf('e');

        System.out.println("indexOfE = " + indexOfE);

        int indexOfFirstO = str.indexOf("o");

        System.out.println("indexOfFirstO = " + indexOfFirstO);

        int indexOfSecondO = str.indexOf("oo");

        System.out.println("indexOfSecondO = " + indexOfSecondO);

    }


}
