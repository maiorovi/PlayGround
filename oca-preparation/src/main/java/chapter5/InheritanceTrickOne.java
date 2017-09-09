package chapter5;

public class InheritanceTrickOne {
}

class Marsupial {
    public static boolean isBiped() {
        return false;
    }
    public  void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}

class Kangaroo extends Marsupial {
    public  static boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}