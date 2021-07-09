package File;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("C:/Users/Admin/Desktop/Nayem");
		dir.mkdir();

		/*
		if(dir.mkdir()) {
			System.out.println(dir.canWrite()+" Deleted");
		}
		else {
			System.out.println(dir.getName()+" created");
		}
		*/
		
		File file1 = new File("C:/Users/Admin/Desktop/Nayem/Nayem.txt");
		
		file1.createNewFile();
	
	}

}
