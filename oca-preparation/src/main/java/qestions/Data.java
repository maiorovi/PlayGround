package qestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Data {

    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(f.format(LocalDateTime.of(2015, 5, 10, 11,22,33)));

        String a= "";
        a += 2;
        a += 'c';
        a += false;

        float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1  +1024;
        System.out.println(var2);

        Integer arr[] = {1,2,3,4};

        arr[1] = null;

        for (Integer arg : arr) {
            System.out.print(arg);
        }

        int total = 0;

        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length();
        System.out.println(total);

        StringBuilder sb = new StringBuilder("0123456789");
        sb.delete(2, 8);

    }
}


abstract class Planet {
    protected void revolve() {}

    abstract void rotate();
}

class Earth extends Planet {

//    void revolve(){}

    protected void rotate() {}
}
