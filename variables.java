public class variables {
    public static void main(String[] args)
    {
        int a=10,b=20,c=15,d=25;
        //arithmetic operators
        System.out.println("a+b=" +(a+b));
        System.out.println("a-b=" +(a-b));
        System.out.println("a*b=" +(a*b));
        System.out.println("a/b=" +(a/b));
        System.out.println("a%b=" +(a%b));
        a++;
        System.out.println("a++="+a);
        a--;
        System.out.println("a--="+a);
        System.out.println("a==b is" +(a==b));
        System.out.println("a!=b is" +(a!=b));
        System.out.println("a<=b is" +(a<=b));
        System.out.println("a>=b is" +(a>=b));
        System.out.println("a<b is" +(a<b));
        System.out.println("a>b is" +(a>b));
        //relational opperators
        System.out.println("&&:" +((a==b)&&(a!=b)));
        System.out.println("&&:" +((a<b)&&(a!=b)));
        System.out.println("||:" +((a>b)&&(a!=b)));
        System.out.println("&&:" +((a==b)&&(a!=b)));
        //assignment opperators
        a*=b;
        System.out.println("a*=b=" +a);
        //conditional operators
        int result=(a>b)?0:1;





    }
}
