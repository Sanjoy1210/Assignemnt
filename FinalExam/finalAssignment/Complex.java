package finalAssignment;

public class Complex {

	int real, imaginary;
	
	public Complex() {
		
	}

	public Complex(int r, int i) {
		real = r;
		imaginary = i;
	}
	
	public static Complex add(Complex a, Complex b) {
	    return new Complex(a.real + b.real, a.imaginary + b.imaginary);
	}
	
	public String toString() {
	    return real + "+" + imaginary + "i";
	}
}
