package week09_review;

import java.time.LocalDate;

public class Tester {

    public String name;
    public char gender;
    public LocalDate DOB;
    public int age;
    public String employeeId;
    public String jobTitle;
    public double salary;

    public Tester(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary){
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        age = LocalDate.now().getYear() - DOB.getYear();
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    /*
    public static void Tester(){
        System.out.println("Regular Method");
    }


    public static void main(String[] args) {

        new Tester();

    }
*/

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", age=" + age +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
1. create a class called Tester
		    Attributes:
		        name, gender, dateOfBirth, age, employeeID, JobTitle, Salary

		    Add a constructor that can set all the fields

		    Actions:
		       smokeTesting(),  creatingTicket(), dailyStandUp(), toString()
 */