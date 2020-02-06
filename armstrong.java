import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int remainder,original,result=0;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        original=n;
        while(n!=0)
        {
            remainder = n % 10;
            result = result+ (remainder * remainder * remainder);
            n=n/10;
        }
            if(result==original)
                System.out.println("armstrong");
            else
                System.out.println("not");

        }

    }
