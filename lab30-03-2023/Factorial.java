import java.util.Scanner;
public class Factorial {

    public static void main(String[] args)
    {  
        long fact = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            //formula to find factorial
            fact =fact*i;
        }
        System.out.printf("Factorial of %d = %d", num, fact);
    }
}
