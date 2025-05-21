package Day_8;
import java.io.*;
public class Demo12 {

	public static void main(String[] args) throws IOException{
		File f1=new File("C:\\Users\\malis\\OneDrive\\Desktop\\sem.txt");
		if(f1.createNewFile()) {
			System.out.println("file created successfully");
			
		}else {
			System.out.println("not created");
		}

	}

}
