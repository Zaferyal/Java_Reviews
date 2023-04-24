package bootcamp;

public class StringReview {

    public static void main(String[] args) {

        String str1 = new String("Cydeo");  // heap
        String str4 = new String("Cydeo");  // heap

        System.out.println(str1 == str4);

        String str2 = "Cydeo";  // string pool
        String str3 = "Cydeo";  // string pool

        System.out.println(str2 == str3);

        System.out.println("------------------------------------------------");


        String s = "Cydeo";

        s = s.concat(" School");

        System.out.println(s);

        System.out.println("------------------------------------------------");

        StringBuilder stringBuilder = new StringBuilder("Cydeo");

        stringBuilder.append(" School");

        System.out.println(stringBuilder);

        System.out.println("------------------------------------------------");

        StringBuffer stringBuffer = new StringBuffer("Cydeo");
        stringBuffer.append(" School");

        System.out.println(stringBuffer);






    }

}
