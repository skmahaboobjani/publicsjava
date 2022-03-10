

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;

	public class LinkedListExample {
		public static void main(String[] args) {
			List<String> names=new ArrayList<String>();
			names.add("ravi");
			names.add("mabu");
			names.add("jani");
			names.add("shaik");
			names.add("swathi");
			names.add("roja");
			names.add("raheem");
			names.add("burhan");
			names.add("koti");
			names.add("khasim");
			names.add("gayatri");
			System.out.println(names);
			names.add(5, "somya");
			System.out.println(names);
			System.out.println(names.contains("shaik"));
			names.remove(10);
			System.out.println(names);
			System.out.println("-----------");
			
			Iterator<String> itr=names.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("-----------");
			
			ListIterator<String> lstItr=names.listIterator();
			while(lstItr.hasNext()) {
				System.out.println("Forward "+lstItr.next());
			}
			while(lstItr.hasPrevious()) {
				System.out.println("Backward "+lstItr.previous());
			}
			System.out.println("-----------");
			
			for(String name:names) {
				System.out.println(name);
			}
		}
	}


