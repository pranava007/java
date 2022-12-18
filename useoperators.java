import java.util.Scanner;

class useoperators
{
    public static void main(String[]arge)
    {   
        
        
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        Scanner scanner2 =new Scanner(System.in);
        boolean vote=scanner2.nextBoolean();
        
        if(age >=18 && vote)
        {
          System.out.println("ealigibel vote");
        }
        else
        {
            System.out.println("Not ealigible");
        }
    }
}