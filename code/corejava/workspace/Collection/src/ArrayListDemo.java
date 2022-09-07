import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Hello"); // String class Object
		list.add(123); // Integer wrapper class Object
		list.add(12.23); // Double wrapper class Object
		list.add(true); // Boolean wrapper class Object
		
		System.out.println(list);
	}

}
