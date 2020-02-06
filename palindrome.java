import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n, reversed = 0, remainder;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int num=n;
        while (n != 0) {
            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        if (num == reversed)
            System.out.println("n is a palindrome."+num);
        else
            System.out.println("n is not a palindrome."+num);
    }
    }
