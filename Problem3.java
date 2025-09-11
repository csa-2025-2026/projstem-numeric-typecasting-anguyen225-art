public class Problem3
{
    public static void main(String[] args)
    {
       double num = 67.3424;
       double first3 = num * 1000;
       int intnum = (int)first3;
       int x = intnum % 1000;
       System.out.print((x / 100) + " " + ((x/10) % 10) + " " + (x % 10));
    }
}
