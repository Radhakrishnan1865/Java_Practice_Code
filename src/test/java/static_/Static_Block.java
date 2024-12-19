package static_;

public class Static_Block {
	
	static {
		int n=10;
		System.out.println("This is a third static block");
		System.out.println("The a Value is : "+ n);
		
	}
	public static void Method() {
		
		System.out.println("This is a Static method");
	}
	static {
		int a=10;
		System.out.println("This is a static block");
		System.out.println("The a Value is : "+ a);
		
	}
	public void Method01() {
		int b=20;
		int c=40;
		System.out.println("Sum of two variables :"+ (b+c));
	}

	static {
		int m=10;
		System.out.println("This is a  second static block");
		System.out.println("The a Value is : "+ m);
	}
	public static void main(String[] args) {
		Method();
		Static_Block sb=new Static_Block();
		sb.Method01();
		
	}
}
