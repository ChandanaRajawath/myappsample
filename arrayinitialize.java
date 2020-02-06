import java.util.Arrays;
import java.util.Scanner;

public class arrayinitialize {
    public static void main(String[] args) {
        /*initializing using assignment using subscript or index
        initialize in one statement during creation
        initializing using arrays.fill
        initializing using for loop
        initializing by taking user input*/
        //1...int a[]=new int[5];// a[]=10;
        //2...int a[]=new int[]{1,2,3,4,5};
        int a[]=new int[5];
        Arrays.fill(a,5);
        for(int i=0;i<a.length;i++)
            System.out.println("value of a["+i+"]:"+a[i]);
        System.out.println();
        //using for loop
        int b[]=new int[5];
        for(int i=0;i<b.length;i++)
            b[i]=i+1;
        for(int i=0;i<b.length;i++)
            System.out.println("value of b["+i+"]:"+b[i]);

        //taking user input
         int c[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values");
        for(int i=0;i<c.length;i++) {
            c[i] = sc.nextInt();
            System.out.println("value of c[" + i + "]:" + c[i]);
        }




    }
}
