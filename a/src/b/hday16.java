package b;

public class hday16 {

	
	void meth1() {
		System.out.println("=============");
		
	}
	
	
	
	
	
	
	
	static int factorial(int n) {
		
//		factorial(n)=n*n-1 *..1
//		factorial/5)5*4*3*2*1=120		
//		factorial(n)=n=factorial(n-1)
		if(n==0 || n==1) {
			return 1;
		}else {
			
			return n*factorial(n-1);
		}
	}
	
	
	static int factorialv(int n) {
		
//		factorial(n)=n*n-1 *..1
//		factorial/5)5*4*3*2*1=120		
//		factorial(n)=n=factorial(n-1)
		if(n==0 || n==1) {
			return 1;
		}else {
			
			
			int product =1;
			for(int i=1; i<=n; i++) {
				
				product*=i;
				
			}
		
			 return product;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println(factorial(x));
		System.out.println(factorialv(x));
		
		
		new hday16().meth1();
	}
	
}
