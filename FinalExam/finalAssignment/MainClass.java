package finalAssignment;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		Rectangle obj = new Rectangle(length, width);
		
		System.out.println(obj.areaCalculator());

	}

}
