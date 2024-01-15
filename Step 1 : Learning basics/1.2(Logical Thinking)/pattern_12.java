public class pattern_12
{
    public static void main(String[] args) {
        
        int a=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i;j<=3;j++)
            {
                System.out.print(" ");
            }
            for(int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=a;j>=1;j--)
            {
                System.out.print(j);
            }
            a++;
            System.out.println();
        }
    }
}