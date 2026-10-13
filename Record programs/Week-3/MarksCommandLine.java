public class MarksCommandLine
{
    public static void main(String[] args)
    {
        if (args.length != 5)
        {
            System.out.println("Usage: java MarksCommandLine mark1 mark2 mark3 mark4 mark5");
            return;
        }
        int total = 0;
        for (int i = 0; i < 5; i++) total += Integer.parseInt(args[i]);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total / 5.0);
    }
}
