package polymorphism;

public class Child extends Parent{
	void m1(int a) {
		System.out.println("Hi child");
	
	}
	public static void main(String[] args) {
		Child p=new Child();
		p.m1(100);
	}

}
