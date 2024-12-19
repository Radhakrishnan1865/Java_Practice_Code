package super_Keyword;

public class ClassB extends ClassA {

	ClassB(){
		super("Radhakrishnan");
		
	}
	public void method02() {
		
		
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		
		ClassB cl=new ClassB();
		cl.method();
		cl.method02();
	}
}
