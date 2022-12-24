package week13_review;

public class Tester extends Employee implements RemoteJob {

    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() +" "+getName()+" is testing");
    }

    public void smokeTesting(){
        System.out.println(getJobTitle() +" "+getName()+" is smoke testing");
    }

    @Override
    public void workFromHome() {
        System.out.println(getJobTitle() +" "+getName()+" can do testing from home if needed");
    }


}
