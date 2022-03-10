import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
	
	

	
		public static void main(String args[]) throws Exception
		{

			
			List<Integer> list = new ArrayList<Integer>();

		
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(56);
			list.add(23);
			list.add(45);
			list.add(65);
			list.add(12);
			list.add(78);
			list.add(90);
			list.add(24);

		
			System.out.println("List: " + list);

			
			int minList = Collections.min(list);

			
			int maxList = Collections.max(list);

			
			System.out.println("Minimum value of list is: "
							+ minList);

			System.out.println("Maximum value of list is: "
							+ maxList);
		}
	}

	
	


