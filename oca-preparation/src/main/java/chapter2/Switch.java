package chapter2;

public class Switch {

    public static void main(String[] args) {
        switchTest(5);
        System.out.println("-----------------------------");
        switchTest(6);


    }

    private static void switchTest(int dayOfWeek) {


        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
        }

    }

    public void test() {
        /*
        1. A(1), D(4) +
        2. A(1), B(2), D(4) +
        3. F(6) +
        4. B(2), C(3), D(4), F(6) +
        5. C(3) +
        6. F(6) +
        7. D(4) +
        8. B(2) +
        9. B(2) ???(not sure) -
        10. D(4) +
        11. A(1) +
        12. D(4) +
        13. A(1) +
        14. C(3) +
        15. E(5) +
        16. D(4) +
        17. D(4) +
        18. B(2) +
        19. D(4) +
        20. B(2) +
         */
    }
}
