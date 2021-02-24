/**
 * 
 */

/**
 * @author Rutuja
 *
 */
public class ExcpArith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		int a=10/0;
		System.out.println(a);
		}catch(Exception e) {
			
			System.out.println("not finish");
		}finally {
		
		System.out.println("Finish");
		}

	}

}
