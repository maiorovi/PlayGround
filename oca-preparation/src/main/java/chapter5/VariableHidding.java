package chapter5;

public class VariableHidding {
}

class Student {
    protected int a = 1;

    {
        a = 10;
    }

    public void printB() {
        System.out.println("a in Student = " + a);
    }
}

class GoodStudent extends Student {
    protected int a = 2;

    public void printA() {
        System.out.println("a in GoodStudent = " + a);
    }

    public static void main(String[] args) {
        GoodStudent  student = new GoodStudent();

        student.printA();
        student.printB();
    }
}