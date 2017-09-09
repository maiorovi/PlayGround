package chapter5;

public class DiamondProblem {

}

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

class Cat implements Walk, Run {  // DOES NOT COMPILE
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }

    //overriding fixes compilation problems
    @Override
    public int getSpeed() {
        return 1;
    }
}
