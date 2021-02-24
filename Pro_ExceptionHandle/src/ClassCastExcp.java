/**
 * 
 */

/**
 * @author Rutuja
 *
 */
public class ClassCastExcp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("statement executed");
		
		Object o=new Object();
		try{
			ClassCastExcp e=(ClassCastExcp)  o;
		}
		catch(Exception e) {
		}
		System.out.println("statement not executed");
		}
		
	}


