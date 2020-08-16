public class QuestionOne {

	public static int count(String w) {
		int countChar = 0;
		int l = w.length();
		
		for (int i = 0; i < l; i++) {
			if(w.charAt(i) == 'a' || w.charAt(i) == 'e' || w.charAt(i) == 'i' || w.charAt(i) == 'o'
			   || w.charAt(i) == 'u' || w.charAt(i) == 'A' || w.charAt(i) == 'E' || w.charAt(i) == 'I'
			   || w.charAt(i) == 'O' || w.charAt(i) == 'U') {
				countChar++;
			}
		}
		
		return countChar;
	}
}


import java.util.Scanner;

public class QuestionOneMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		System.out.println("Number of vowel: " + QuestionOne.count(a));
	}
}