package chapter1;

public class Declarations {

	public static final void main(String[] args) {
		int i1, i2, i3 = 0; //this works
		//however this is not int i1, int i2

		int hugeNumber = 1_000_000;//you can use underscore to type big numbers

		System.out.println(new Declarations().initialization());

		new Declarations().primitiveTypes();

	}

	private void systems() {
		System.out.println(56); //in decimal
		System.out.println(0b11); // in binary
		System.out.println(017); // in octal
		System.out.println(0x1F); //in hexadecimal
	}

	private void primitiveTypes() {
		// boolean 8bit default=false
		// byte 8bit default=0
		// short 16bit default=0
		// int 32 bit default=0
		// long 64 bit default=0
		// double 64 bit default=0
		// float 32 bit default=0
		// char 16 bit \u0000 (NULL)\s

		int q = 001;
		System.out.println(001);
	}

	private int initialization() {
		int y = 10;
		//int x; x have to be initialized
		// local variables contains garbage inside it so we need to initialize them before you or compilation error
		// is raised
		int x = 1;

		int reply = x + y;
		return reply;
	}

	/*
	1 - A, 2- B, 3-C,4-D, 5-E
	chapter 1 test
	1) 1A,2B,5E correct
	2) 4 correct
	3) 2, 7, 8
	4) 5
	5) C,D correct
	6) E correct
	7) A, B, C correct
	8) 1
	9) 1, 3, 4 correct
	10) 5, 2
	11) 3, 4 correct
	12) 7 correct
	13) 1, 4  correct
	14) 4 correct
	15) 1, 5 correct
	16) 2, 3, 4 correct
	17) 1, 5 correct
	18) 3, 5
	19) 2,4 correct
	20) 2, 5 correct
	21) 1 correct
	22) 2, 3, 5
	23) 3,6
	 */


}
