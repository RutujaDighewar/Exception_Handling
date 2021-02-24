import java.io.File;
import java.io.FileReader;

/**
 * 
 */

/**
 * @author Rutuja
 *
 */
public class Excp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		try {
		FileReader file=new FileReader(new File ("c:/a.txt"));
		}
		catch(Exception e) {
			System.out.println("hey");
		}
	}

}
