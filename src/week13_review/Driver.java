package week13_review;

public class Driver extends Employee {

    private char typeOfDL;

    public Driver(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Driver", salary);
    }

    public char getTypeOfDL() {
        return typeOfDL;
    }

    public void setTypeOfDL(char typeOfDL) {

        if( !(typeOfDL == 'A' || typeOfDL == 'B' || typeOfDL == 'C') ){
            throw new RuntimeException("Invalid type for driver license: "+typeOfDL);
        }

        this.typeOfDL = typeOfDL;
    }


    @Override
    public void work() {
        System.out.println(getJobTitle() +" "+getName() +" is driving");
    }
}
