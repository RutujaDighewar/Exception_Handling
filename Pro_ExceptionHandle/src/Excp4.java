/**
 * 
 */

/**
 * @author Rutuja
 *
 */
public class Excp4 {
              
	public int m1(){
		
		try {
			int a=10/0;
			return 10;
		}catch(Exception e) {
			return 20;
		}finally {
			return 30;
		}
	}
	public static void main(String[] args) {
		
		int rs=new Excp4().m1();
		System.out.println(rs);
		
	}

}
