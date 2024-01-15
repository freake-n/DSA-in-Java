public class pattern_8
{
    public static void main(String[] args) {
        
        int a=0,b=4;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=b;j++)
            {
                System.out.print("*");
            }
            a++;
            b--;
            System.out.println();
        }
    }
}