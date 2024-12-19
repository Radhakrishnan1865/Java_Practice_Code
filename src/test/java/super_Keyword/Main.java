package super_Keyword;

class Parent {

	public Parent(String message) {

		System.out.println(message);
		System.out.println("This is a parent class constructor");


	}
}
class Child extends Parent{

	Child(){

		super("Hello this is Radhakrishnan");
		System.out.println("This is a child class constructor");
	}
}
public class Main extends Child{
	public Main() {
		
	}
	public static void main(String[] args) {

		new Main();
	}
}
