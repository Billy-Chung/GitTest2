package app;

public class MyClass {
	public static void main(String[] args) {
		System.out.println("1st version");
//		這是一個新加的數學運算版本
		Math cMath = new Math();
		System.out.println(cMath.add(10, 5));
	}
}
class Math{
	int add (int a , int b ) {
		return a+b;
	}
}