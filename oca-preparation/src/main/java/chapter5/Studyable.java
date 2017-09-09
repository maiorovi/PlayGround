package chapter5;

public interface Studyable { //abstract keyword is assumed and will be inserted by compiler
    int MINIMUM_DEPTH = 2; //assumed public static final
    public static final int MAXIMUM_DEPTH = 10;

    public abstract int getAverageDepth();

    int getAverageDepth1(); // get public abstract assumed

    /*
    1. interface method can`t be private, protected
    2. interface methods can`t be final
    3. interfaces can`t be marked as final
     */
}

