package chapter3;

public class StringBuilderInvestigation {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        strings();

    }

    private static void strings() {
        String x = "Hello World";
        String y = "Hello World";

        System.out.println(x == y); //returns true as x points to the same object y does. because of jvm pool only one object is created

        String q = "Hello World";
        String z = (" Hello World".trim());

        System.out.println(x == z); //false as string literal is not the same at compile time

        String r = new String("Hello World");
        String u = "Hello World";

        System.out.println(r == u); //false as new object is created with new String

    }

    private static void arrays() {
        //creating array of primitives
        int[] numbers = new int[3];
        //another way to create array

        int[] numbers2 = new int[]{42, 55, 99};

        int[] numbers3 = {42, 55, 99}; //this is called anonymous array


        //valid declarations
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        // int[] ids, types; -this creates two array of type in however
        // int ids[], types;  - this time we get one var of type int[], and other of type int

        //creating array with reference variable
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); //true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
    }

}
