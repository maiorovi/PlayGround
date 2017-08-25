package qestions;

import java.text.CollationElementIterator;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
    String main;
    String Public;

    public void qwe(String hello){}


    public static void main(String[] names) {
        LocalDate localDate = LocalDate.of(2016, 3 ,24);
        Period p = Period.ofDays(2);

        System.out.println(localDate.plus(p));


        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        System.out.println(hex);
        System.out.println(Collections.binarySearch(hex,"30"));
        System.out.println(Collections.binarySearch(hex,"FF"));
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);

        System.out.println("------------------");
        System.out.println("012345678".substring(7));
    }

    private static void sbTest() {
        StringBuilder sb = new StringBuilder();
    }
}

abstract class Hey {

}

