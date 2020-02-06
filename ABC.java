import java.util.Scanner;
public class swapvariables {
    public static void main(String[] args) {
        //swap two variables using third variables
        int a,b,temp;
        System.out.println("enter 2 values to swap");
        Scanner sc =new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("values of first variable:"+a);
        System.out.println("values of second variable:"+b);

    }
}