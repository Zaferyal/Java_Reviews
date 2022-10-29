package week05_review;

public class MethodPractice_Void {


    public static void calculate(double num1, char mathOperator, double num2) {

        switch (mathOperator) {

            case '-':
                System.out.println("Subtraction: " +  (num1 - num2) );
                break;

            case '+':
                System.out.println("Addition: " +  (num1 + num2) );
                break;

            case '*':
                System.out.println("Multiplication: " +  (num1 * num2) );
                break;

            case '/':
                if(num2 != 0 ) {
                    System.out.println("Division: " + (num1 / num2));
                }else{
                    System.out.println(num1 +" can not be divided by zero");
                }
                break;

            default:
                System.out.println("Invalid Math Operator");
        }



    }


}

/*
Tasks
    1. Create a method named calculate that accepts three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)

        if the operator is +:
                the method should return the addition of the two numbers

        if the operator is -:
                the method should return the subtraction of the two numbers

        if the operator is *:
                the method should return the multiplication of the two numbers

        If the operator is /:
                if denominator is NOT zero:
                    then the method should return the division

        for any other operators, the method should return 0
 */