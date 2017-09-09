package chapter5;

public class MethodHiding {

}

class Athlet {
    public static Object run() {
        System.out.println("fds");

        return new Object();
    }
}

class ProfessionalAthlet extends Athlet {
    //signature is method name plus parameters list
    public static String run() {
        System.out.println("");


        return "fd";
    }
}
