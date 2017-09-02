package qestions;

public class StringMethodsPlay {

    public static void main(String[] args) {
        //StringBuffer
        StringBuffer sb = new StringBuffer("01234567");

        System.out.println("initial : " + sb.toString());


        System.out.println("sb.deleteCharAt(0): " + sb.deleteCharAt(0).toString());
//                                                                 012345
        System.out.println("sb.delete(0, 5): " + new StringBuffer("01234567").delete(0, 5).toString());

        System.out.println("sb.insert(2,\"pwd\"): " + new StringBuffer("01234567").insert(2, "pwd"));


        //string

        String s = "123458678";

        System.out.println("s.replace(8,8): " + s.replace("8", "-8"));

        System.out.println("substring(1, 5)" + s.substring(1, 5));

    }
}
