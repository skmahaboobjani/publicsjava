public class StreamDemo
{
    public static void main(String[] args)
    {
        String[] nameArray = new String[] { "Peter", "Steve", "paul","Ram" };

        Stream<String> stream = Arrays.stream(nameArray);

        /*
         * The filter method expects a lambda expression as its
         * argument. However, the lambda expression passed to it must
         * always return a boolean value, which determines whether or
         * not the processed element should belong to the resulting
         * Stream object.
         */
        Stream<String> filteredStream = stream.filter(name -> name.length() > 4);

        String[] filteredNameArray = filteredStream.toArray(String[]::new);

        for (String name : filteredNameArray)
        {
            System.out.println(name);
        }

    }
}