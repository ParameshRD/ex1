package lesson1;

public class Inter12 implements Interface1,Interface2 {
	public void display1() {
		System.out.println("hi");
	}
	
	public void display2() {
		System.out.println("hello");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter12 obj8= new Inter12();
		obj8.display1();
		obj8.display2();
		

	}

}
