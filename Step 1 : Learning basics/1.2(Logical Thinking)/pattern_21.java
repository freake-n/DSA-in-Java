public class pattern_21
{
    public static void main(String[] args) {
        
        int a=1,b=1,c=1;
        for(int i=1;i<=4;i++)
        {
            if(i%2==0){
                for(int j=1;j<=4;j++)
                {
                    System.out.print(" ");
                }
            }
            else{
                for(int j=2;j>=a;j--)
                {
                    System.out.print("*");
                }
                for(int j=1;j<=a-1;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=a-1;j++)
                {
                    System.out.print(" ");
                }
                for(int j=2;j>=a;j--)
                {
                    System.out.print("*");
                }
                a++;
            }
            
            System.out.println();
        }

        for(int i=1;i<=4;i++)
        {
            if(i%2==0){
                for(int j=1;j<=4;j++)
                {
                    System.out.print(" ");
                }
            }
            else{
                for(int j=1;j<=b;j++)
                {
                    System.out.print("*");
                }
                for(int j=1;j<=c;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=c;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=b;j++)
                {
                    System.out.print("*");
                }
                b++;
                c--;
            }
            
            System.out.println();
        }
    }
}