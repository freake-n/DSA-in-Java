public class pattern_17
{
    public static void main(String[] args) {

        int a=65,b=64;
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=65;j<=a;j++)
            {
                System.out.print((char)j);
            }
            for(int j=b;j>=65;j--)
            {
                System.out.print((char)j);
            }
            a++;
            b++;
            System.out.println();
        }
    }
}