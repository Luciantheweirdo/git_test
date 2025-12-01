
public class Main
{
    public static void main(String args[])
    {
        int summe = 0;
        int og = 100;
        
        for (int i = 1; i <= og; ++i)
        {
            summe = summe + i;
        }
        
        int mult = 1;
        for (int i = 1; i <= og; ++i)
        {
            mult = mult * i;
        }
        
        System.out.println("Summe = " + summe + " Mult = " + mult);
    }
}
