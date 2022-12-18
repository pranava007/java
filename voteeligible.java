import java.util.Scanner;

class voteeligible
{
    public static void main(String[]arge)
    {
         Scanner scanner=new Scanner(System.in);
         int a = scanner.nextInt();
         Scanner scanner2=new Scanner(System.in);
        
         boolean vote=scanner2.nextBoolean();
    if(a>=18)
    {
        if( vote==true)
        {
            System.out.println("you are ealigible");
        }
        else
        {
            System.out.println("Not ealigible");
        }
    }
    else
    {
        System.out.println("Not ealigible"); 
    }

    }


    }
  
    
