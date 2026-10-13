package number;
public class Roman
{
    public int romanToInteger(String text)
    {
        int total = 0, previous = 0;
        for (int i = text.length() - 1; i >= 0; i--)
        {
            int value = valueOf(text.charAt(i));
            if (value < previous) total -= value;
            else total += value;
            previous = value;
        }
        return total;
    }
    private int valueOf(char ch)
    {
        switch (ch)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
