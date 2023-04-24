package bootcamp;

public class Constructor {

    int a;

    String str;

    public Constructor(int a){
        this.a = a;
    }

    public Constructor(int a, String str){
        this(a);
        this.str =str;

       // super();
       // super.clone();
    }


    public static void main(String[] args) {

        Constructor obj = new Constructor(10);
        System.out.println(obj.a);
        System.out.println(obj.str);


        System.out.println("-------------------------------------");

        Constructor obj2 = new Constructor(100, "Cydeo");
        System.out.println(obj2.a);
        System.out.println(obj2.str);

        // ArrayPractice.main(new String[]{"Java"});


    }


}
