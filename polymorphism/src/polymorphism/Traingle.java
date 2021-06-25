package polymorphism;

public class Traingle extends shape {
	
	
    double base, height ;
	
	Traingle (double b, double h){
		
		base = b ;
		height = h ;
	}
	


	double area() {
		
		System.out.println("Traingle : ");
		
		return 0.5*base*height;
	}
}
