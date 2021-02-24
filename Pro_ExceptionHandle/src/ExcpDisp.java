/**
 * 
 */

/**
 * @author Rutuja
 *
 */
public class ExcpDisp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());
			System.out.println("statement not executed");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();

		} finally {
			System.out.println("statement always executed");

		}

	}

}
