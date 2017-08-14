package chapter2;

public class PromotionRules {
    public static void main(String[] args) {
        numericPromotionRules();
        assignment();
    }

    private static void assignment() {
        long x = 10;
        int y = 5;

        y *= x;
        // this works however
        // y = y * x will cause compilation error

        long q = 5;
        long w = (q=3);
        System.out.println(q); // Outputs 3
        System.out.println(q); // Also, outputs 3
    }

    private static void logicalOperators() {
        // &, |, ^ - referenced as bitwise operators when applied to numeric data type
        // but when applied to booleans referenced as logical operators

        // operators &&, || - identical to logical operators mentioned earlier, except
        // for the fact that they allow short-circuiting

        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x); // 6 as x >= 6 returns true and because of short-circuiting increment never evaluated
    }

    private static void equality() {
        System.out.println(5 == 5.00); //returns true as int value 5 will be
        // automatically promoted to double
    }


    private static void numericPromotionRules() {
        byte b = 120;
        byte b1 = -128;
        byte b3 = 127;

        //byte b = 128 compilation error. max positive value for byte is 127
        int r = b * 12;
        System.out.println(r);

        System.out.println(r * 12.0);

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        /*
            4 * 5 / x-- + --x
            4 * 5 / 4 + --x x become 3 here
            4 * 5 / 4 + 2
            5 +  2 = 7
         */
        System.out.println("x = " + x);
        System.out.println("y = " + y); // 7

        // short ex.
        short q = 3;
        short w = 10;

        // short t = q * w; // will not compile as q and w will be upcasted to int and result will be of type int
        // there are two possible fixes:
        // 1)
        short t = (short) (q * w);
        int tt = q * w;

    }




}
