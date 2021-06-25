package polymorphism;

public class Ractangle extends shape {

	 double length , height ;
	
	Ractangle(double length, double height){
		
		this.length = length ;
		this.height = height ;
	}
	


	
	double area() {
		
		System.out.println("Ractangle : ");
		
		return length*height;
	}

}
