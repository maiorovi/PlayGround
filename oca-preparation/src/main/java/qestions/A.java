package qestions;

public interface A {
    int groupId = 10;

//    default boolean equals(Object obj) {
//        return this.groupId == ((A) obj).groupId;
//    }

    static void print(){
        System.out.println("A");
    }
}
