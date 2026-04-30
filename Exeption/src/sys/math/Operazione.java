package sys.math;

public class Operazione {
		
		public void divisione(int a, int b) {
			
			try {
			
			System.out.println(a/b);
			
			}
			catch (ArithmeticException exep) {
				
				exep.printStackTrace();
				
			}
			
		}
			

}
