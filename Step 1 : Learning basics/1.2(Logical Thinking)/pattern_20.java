public class pattern_20
{
    public static void main(String[] args) {

        int a=4;
        
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }

        for(int i=1;i<=4;i++)
        {
            for(int j=i;j<=4;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}