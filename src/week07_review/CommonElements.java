package week07_review;

public class CommonElements {

    public static void main(String[] args) {

        String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift", "Java"};
        String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};

        String result = "";

        for (String element : arr1) { // element: each element of first array

            for (String each : arr2) { // each: each element of second array
                if( each.equals( element) ){ // if the element of first array is included in the second array
                    if(!result.contains(element)){
                        result += element+"\n";
                    }
                }
            }

        }

        System.out.println(result);





    }


}

/*
 Write a program that can display the common elements from two arrays of string

            Ex:
                String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift"};
                String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};

            Output:
                Java
                Wooden Spoon
 */