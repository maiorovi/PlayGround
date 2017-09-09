package chapter5;

public class InheritanceTest {
}

class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }

    public Dog() {
        this(20);
    }
}
