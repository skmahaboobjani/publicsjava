import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
	
	
	
	    public static void main(String[] args)
	    {
	        String[] nameArray = new String[] { "shantanu", "Steve", "paul","Ram","mabujani" };

	        Stream<String> stream = Arrays.stream(nameArray);

	        
	        Stream<String> filteredStream = stream.filter(name -> name.length() > 4);

	        String[] filteredNameArray = filteredStream.toArray(String[]::new);

	        for (String name : filteredNameArray)
	        {
	            System.out.println(name);
	        }

	    }
	}


