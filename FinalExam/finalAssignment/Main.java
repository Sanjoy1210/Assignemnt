package finalAssignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int i = sc.nextInt();
 		Complex a = new Complex(r, i);
 		int re = sc.nextInt();
		int im = sc.nextInt();
        Complex b = new Complex(re, im);
        
        Complex sum = new Complex();
        
        System.out.println(sum.add(a, b));
	}
}
