package bootcamp;


class Spartan{

    public static String name;

    public Spartan(String name) {
        this.name = name;
    }

}


public class ClassAndObject {

    public static void main(String[] args) {

        Spartan spartan1 = new Spartan("Josh");
        Spartan spartan2 = new Spartan("James");

        System.out.println(spartan1.name);
        System.out.println(spartan2.name);


    }

}
