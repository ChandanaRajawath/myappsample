
//ex-atm machine
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        String firstStr = sc.nextLine();
        System.out.println("you entered:" + firstStr);

        int a = sc.nextInt();
        System.out.println("you entered:" + a);*/
        System.out.println("hello-what's your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("hello"+name);
        System.out.println("age?");
        int age=sc.nextInt();
        System.out.println("ur age?"+age+"years old");
    }
}

