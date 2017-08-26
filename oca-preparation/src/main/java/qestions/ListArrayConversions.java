package qestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversions {

    public static void main(String[] args) {
        //list to array
        List<String> test = new ArrayList<>();

        test.add("hawk");
        test.add("robin");

        System.out.println(Arrays.toString(test.toArray(new String[0])));

        //array to list
        String[] array = {"hawk", "robin"};
        List<String> lst = Arrays.asList(array);

        System.out.println(lst);
    }

}
