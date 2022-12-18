import java.util.Scanner;

class voteeligible
{
    public static void main(String[]arge)
    {
         Scanner scanner=new Scanner(System.in);
         int a = scanner.nextInt();
         boolean voting_registered=true;
    if(a>=18)
    {
        if(voting_registered==true)
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
  
    
