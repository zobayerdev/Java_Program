package oop;

public class Boxsolving {


	double height, width, depth;
	
	Boxsolving (double h, double w, double d){
		
		height = h;
		width = w;
		depth = d;
		
	}
	
	void displayvol()
	{
		double vol = height * width * depth ;
		
		System.out.println("Volume : "+vol);
	}
	

}
