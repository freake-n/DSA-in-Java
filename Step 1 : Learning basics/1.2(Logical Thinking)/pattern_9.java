public class pattern_9
{
    public static void main(String[] args) {
        int a=1,b=0,c=4,d=0;
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

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=d;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            d++;
            c--;
            System.out.println();
        }
    }
}