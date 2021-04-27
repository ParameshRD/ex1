package lesson1;
class Father{
	void display() {
		System.out.println("samsung");
	}
	
}
class Child extends Father{
	void display() {
		System.out.println("redmi");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj6 = new Child();
		obj6.display();
		

	}

}
 