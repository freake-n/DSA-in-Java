public class pattern_7
{
    public static void main(String[] args) {
        int a=1,b=0;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=b;j++)
            {
                System.out.print("*");
            }
            a++;
            b++;
            System.out.println();
        }
    }
}