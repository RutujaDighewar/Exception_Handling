/**
 * 
 */

/**
 * @author Rutuja
 *
 */
public class ExcpNumFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num=0;
		String s="123";
		try {
		num=Integer.parseInt(s);
		}catch(Exception e) {
		       System.out.println("excetption occur");
		}finally {
			System.out.println("finally block");
		}
		System.out.println(num);
		System.out.println("Finish");
		}
	}


