public class pattern_18
{
    public static void main(String[] args) {

        int a=69;
        for(int i=1;i<=5;i++)
        {
            for(int j=a;j<=69;j++)
            {
                System.out.print((char)j+" ");
            }
            a--;
            
            System.out.println();
        }
    }
}