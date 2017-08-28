package qestions;

public class TestLoop implements DoInterface {

    public static void main(String[] args) {
        int array[] = {0, 1, 2, 3, 4};

        int key = 3;

        for (int pos = 0; pos < array.length; ++pos) {
            if (array[pos] == key) {

                break;

            }

        }

//        System.out.print("Found " + key + "at " + pos);

    }

    int x1;

    @Override
    public void m1(int p) {
        x1 += p;
        System.out.println(x1);
    }
}

interface DoInterface {
    void m1(int n);
}

abstract class Bird {
    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
    }
}

class Pelican extends Bird {
    protected void fly() {
        System.out.println("Pelican is flying");
    }
}

class MyExamCloudOCAJP8 {

    public static void main(String[] args) {
        String str = "1Z0";
        StringBuilder sb = new StringBuilder("-");
        sb.append("808");
        str.concat(sb.toString());
        System.out.println(str);
    }
}