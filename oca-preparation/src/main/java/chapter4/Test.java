package chapter4;

import java.util.function.Predicate;

public class Test {

    /*
        1. B(2), C(3) +
        2. A(1), C(3), D(4) - c is incorrect
        3. A(1), C(3), D(4) +
        4. A(1), B(2), G(7) +
        5. D(4),G(7) +
        6. ??? - D
        7. B(2), C(3), D(4), F(6) +
        8. B(2), C(3), E(5) +
        9. E(5) -
        10. B(2) +
        11. B(2), E(5) +
        12. D(4) +
        13. D(4) -
        14. B(2) +
        15. E(5) +
        16. B(2) +
        17. B(2), D(4), E(5) +
        18. C(3), G(7) +
        19. A(1), G(7) +
        20. E(5) +
        21. C(3) +
        22. G(7) -
        23. A(1) +
        24. B(2),C(3), E(5) +
        25. A(1), E(5)  +
        26.  A(1) +
        27. C(3) +
        28. A(1), D(4), F(6) +
        29. A(1), F(6), D(4) -
     */
        public int howMany(boolean b, boolean...b2) {
            return b2.length;
        }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.howMany(true, new boolean[2]));
    }

}

class Squares {
   public static long square(int x) {
             long y = x * (long) x;
             x = -1;
             return y;
           }
   public static void main(String[] args) {
             int value = 9;
             long result = square(value);
             System.out.println(result);

       Predicate<String> pStr = q -> {q = ""; return q.isEmpty();};

       System.out.println(pStr.test("erwerew"));
           } }