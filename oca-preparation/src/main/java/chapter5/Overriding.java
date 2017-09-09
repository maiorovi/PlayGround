package chapter5;

public class Overriding {
}

class House {
    protected Object build(int size) {
        return "fd";
    }

    protected void animate() {
        System.out.println("animating");
    }
}

class ProtectedHouse extends House {
//    protected int build(int size) { doesn`t work as return type should be covariant
    protected String  build(int size) {
        return "";
    }

    protected String animate(int q) {
        System.out.println("animate protected house");
        return "";
    }
}