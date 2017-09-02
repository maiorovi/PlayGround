package chapter3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Tesrt {
    public static void main(String[] args) {
        String a = "";
        a += 1;
        a += false;
        a += 'b';

        System.out.println(a); // "1falseb"

        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2,  8);
        System.out.println(numbers.toString());
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (Integer v : values) System.out.print(v);

//        List<Integer> ages = new ArrayList<>();
//        ages.add(Integer.parseInt("5"));
//        ages.add(Integer.valueOf("6"));
//         ages.add(7);
//         ages.add(null);
        // npe is here
//        for (int age : ages) System.out.print(age);


        // exception DateTimeException
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());

    }
    /*6 minuses
         1. G(7) +
         2. A(1), C(3), D(4) +
         3. B(2), C(3), E(5) +
         4. B(2) +
         5. D(4) - done
         6. B(2) +
         7. B(2), D(4), E(5) +
         8. A(1), E(5), D(4) +
         9. C(3) +
         10. F(6) + //read description
         11. E(5) +
         12. A(1) +
         13. F(6) +
         14. A(1), C(3) +
         15. C(3), D(4), E(5) - (thought A1 is incorrect)
         16. C(3) +
         17. F(6) +
         18. A(1), C(3), D(4), E(5) +
         19. B(2), C(3) +
         20. D(4) +
         21. C(3) +
         22. A(1) - should be D(4)
         23. A(1) +
         24. A(1) - C(3)
         25. D(4) +
         26. A(1), D(4), B(2) //why runtime error -
         27. B(2) +
         28. D(4), F(6) +
         29. D(4) +
         30. F(6) +
         31. B(2) +
         32. A(1) - E(5)
         33. B(2) +
     */
}
