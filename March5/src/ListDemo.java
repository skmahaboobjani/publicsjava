


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
//		List<String> names=new ArrayList<String>();
//		List<String> names = new LinkedList<String>();
//		List<String> names = new Vector<String>();
		 Vector<String> names = new Vector<>(10);
		
		names.add("John");
		names.add("Peter");
		names.add("Rahul");
		names.add("Chetan");
		names.add("Kirti");
		names.add("Srinivas");
//		System.out.println(names);
		System.out.println(
	            "The index of element peter in Vector is: "
	            + names.indexOf("john"));
		
		
}
}
//Searching Elements in Vector Using Index in Java
