import java.util.Scanner;

class Logicaloperatorovet
{
    public static void main(String[]arge)
    {
      
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        
        if(a>=18)
        {
            System.out.println("Your are eligible Vote");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }
    
}
