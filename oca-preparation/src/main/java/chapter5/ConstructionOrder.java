package chapter5;

public class ConstructionOrder {
    public static void main(String[] args) {
        new Shimpanze();
    }
}

class Primate {
    public Primate() {
        System.out.println("Primate");
    }
}

class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}

class Shimpanze extends Ape {

}

