package methodoverriding;

public class teacher extends person {
	
	@Override
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

}
