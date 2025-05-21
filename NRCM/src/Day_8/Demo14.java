package Day_8;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Demo14 {

	public static void main(String[] args) {
		try {
			File Obj=new File("C:\\Users\\malis\\OneDrive\\Desktop\\sem.txt");
			Scanner R=new Scanner(Obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);
			}
			R.close();
		}
		  catch(FileNotFoundException e) 
		{
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}

	}

}
