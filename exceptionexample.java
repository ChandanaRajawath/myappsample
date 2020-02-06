import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exceptionexample {  //exception handling

    public static  void main(String[] args) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("exceptionexample.txt");
        exceptionexample c = new exceptionexample();
       c.a();
        System.out.println(10/0);
        }

    void a()
        {
            b();
            System.out.println("hi");

        }
        void b()
        {
            System.out.println("hello");
        }
}
