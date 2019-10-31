import java.util.Scanner;
class Power
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Enter the number:- ");
        a = scan.nextInt();
        int c=a;
        int n;
        System.out.println("Enter the power:- ");
        n = scan.nextInt();
        int b=n;

        while(n!=1)
        {
            c= a*c;
            n--;
             
        }
        System.out.println("Answer:- " + a + "^" + b + "=" + c);
    }
}