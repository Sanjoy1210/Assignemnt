package M;

import java.util.Scanner;

import P.A;
import P.B;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		D obj4 = new D();
		
		obj1.setM(sc.nextInt());
		obj2.setX(sc.nextInt());
		obj3.y = sc.nextInt();
		obj4.setW(sc.nextInt());
		
		int result = obj1.getM() - obj2.getX() + obj3.y - obj4.getW();
		
		System.out.println(result);

	}

}
