package bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsPractice {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

/*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5) {
                list.remove(i);
            }
        }
*/

        list.removeIf(p -> p < 5);

        System.out.println(list);



    }

}
