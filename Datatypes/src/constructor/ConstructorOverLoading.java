package constructor;

public class ConstructorOverLoading {
	ConstructorOverLoading() {
		System.out.println("no arguments");
	}
	ConstructorOverLoading(int a) {
		
		System.out.println(a);
	}
	ConstructorOverLoading(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		ConstructorOverLoading c1=new ConstructorOverLoading();
		ConstructorOverLoading c2=new ConstructorOverLoading(100);
		ConstructorOverLoading c3=new ConstructorOverLoading("clas");
	}

}
