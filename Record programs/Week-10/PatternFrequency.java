import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
public class PatternFrequency
{
    public static void main(String[] args)
    {
        try
        {
            String text = new String(Files.readAllBytes(Paths.get("sample.txt")),
            StandardCharsets.UTF_8).toLowerCase();
            int pe = 0, pi = 0;
            for (int i = 0; i < text.length() - 1; i++)
            {
                String pair = text.substring(i, i + 2);
                if (pair.equals("pe")) pe++;
                if (pair.equals("pi")) pi++;
            }
            System.out.println("'pe' - no of occurrences - " + pe);
            System.out.println("'pi' - no of occurrences - " + pi);
        }
        catch (IOException e)
        {
            System.out.println("Could not read sample.txt");
        }
    }
}
