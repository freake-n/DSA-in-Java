public class pattern_13
{
    public static void main(String[] args) {

        int a=1,b=1,c=2;
        for(int i=1;i<=5;i++)
        {
            for(int j=a;j<=b;j++)
            {
                System.out.print(j+" ");
            }
            a=b+1;
            b=b+c;
            c++;
            
            System.out.println();
        }
    }
}