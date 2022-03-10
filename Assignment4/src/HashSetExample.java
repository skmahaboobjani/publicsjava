


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> capitals=new HashSet<String>();
		capitals.add("telengana");
		capitals.add("kadapa");
		capitals.add("guntur");
		capitals.add("Bangalore");
		capitals.add("nellore");
		capitals.add("pidiguralla");
		capitals.add("guttikonda");
		capitals.add("narasaroapet");
		capitals.add("mumbai");
		capitals.add("Kolkata");
		System.out.println(capitals);		
		capitals.add("Hyderabad");
		capitals.add("Delhi");
		System.out.println(capitals);

		System.out.println(capitals.contains("Hyderabad"));
		capitals.remove("mumbai");
		System.out.println(capitals);
		System.out.println("-----------");
		
		Iterator<String> itr=capitals.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------");
		
		for(String capital:capitals) {
			System.out.println(capital);
		}
	}
}