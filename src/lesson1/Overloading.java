package lesson1;
class Sir{
	void display() {
		System.out.println("hi");
	}
	void display(int a) {
		System.out.println("hello");
	}
}

class Oper{
	int a = 5;
	int b = 6;
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sir obj5 = new Sir();
		Oper obj6 = new Oper();
		obj5.display();
		obj5.display(6);
		
		System.out.println("a + b "  + (obj6.a + obj6.b) );

	}

}
