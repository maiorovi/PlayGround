package chapter1;

public class LocalVariables {

	public void container() {
		int x = 10;

		int y = x;
	}

	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
		//System.out.println(onlyOneBranch); // DOES NOT COMPILE
	}
}
