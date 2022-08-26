
@FunctionalInterface
public interface Jdk8Changes {
	public void m1();
	
	public default void m2() 
	{
		System.out.println("This is a default method from interface");
	}
	
	public static void m3() {
		System.out.println("This is a static method from interface");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method from interface");
	}
}



