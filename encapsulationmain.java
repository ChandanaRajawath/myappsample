public class encapsulationmain {
public static void main(String[] args) {

    a aa = new a();
    System.out.println("value in var:" + a.getVar());
    a.setVar(100);
    System.out.println("value in var:" + a.getVar());
    a.setVar(150);
    System.out.println("value in var:" + a.getVar());

}
}
