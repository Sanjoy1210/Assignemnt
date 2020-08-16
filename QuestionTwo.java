public class QuestionTwo {

	double width;
	double height;
	double area;
	
	QuestionTwo(double w, double h) {
		width = w;
		height = h;
	}
	
	double areaCalculation() {
		area = width * height;
		return area;
	}
}

import java.util.Scanner;

public class QuestionTwoMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double w = scanner.nextDouble();
		double h = scanner.nextDouble();
		QuestionTwo area = new QuestionTwo(w, h);
		
		System.out.println("Area of Rectangle: " + area.areaCalculation());		
	}
}
