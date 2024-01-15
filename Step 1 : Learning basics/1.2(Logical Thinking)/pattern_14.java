public class pattern_14
{
    public static void main(String[] args) {
        
        int a=65;
        for(int i=1;i<=5;i++)
        {
            for(int j=65;j<=a;j++)
            {
                System.out.print((char)j);
            }
            a++;
            System.out.println();
        }
    }
}