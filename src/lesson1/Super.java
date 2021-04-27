package lesson1;
class A{
	public A()
	{
		System.out.println("c1 a");
	}
	public A(int a)
	{
		System.out.println("c1 p");
	}
}
class B extends A{
	public B()
	{
		super();
		System.out.println("c1 b");
	}
	public B(int a)
	{
		super();
		System.out.println("c2 p");
	}

}


public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		
		

	}

}
