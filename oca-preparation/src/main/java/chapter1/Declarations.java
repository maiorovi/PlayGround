package chapter1;

public class Declarations {

	public static void main(String[] args) {
		int i1, i2, i3 = 0; //this works
		//however this is not int i1, int i2

		int hugeNumber = 1_000_000;//you can use underscore to type big numbers

	}

	private void systems() {
		System.out.println(56); //in decimal
		System.out.println(0b11); // in binary
		System.out.println(017); // in octal
		System.out.println(0x1F); //in hexadecimal
	}

	private void primitiveTypes() {
		// boolean
		// byte
		// short
		// int
		// long
		// double
		// float
		// char
	}

}
