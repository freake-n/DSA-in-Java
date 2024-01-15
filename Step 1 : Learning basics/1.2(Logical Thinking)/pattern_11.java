public class pattern_11
{
    public static void main(String[] args) {
        
        String str="";
        for(int i=0;i<5;i++){
            if(i%2==0){
                str=str+"1";
            }
            else{
                str=str+"0";
            }
        }
        
        int a=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<=a;j++)
            {
                if(i%2==0)
                {
                    System.out.print(str.charAt(j+1));
                }
                else
                {
                    System.out.print(str.charAt(j));
                }
                
            }
            a++;
            System.out.println();
        }
    }
}