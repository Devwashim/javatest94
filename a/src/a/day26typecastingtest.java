package a;

public class day26typecastingtest {
	
	void display() {
		
		byte x;
		int a =270;
		double b = 128.128;
		x = (byte)a;
		System.out.println("a and x "+a+""+x);
		a = (int)b;
		System.out.println("b and a"+b+""+a);
		x=b;
		System.out.println("b and x "+b+""+x);
	}
	
	public static void main(String[] args) {
		
		day26typecastingtest obj=new day26typecastingtest();
		obj.display();
		
	}
}
