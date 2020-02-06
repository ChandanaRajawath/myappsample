public class ifelse {
    public static void main(String[] args){
        int age=23;
        if(age>13) //if..else....elseif..(laddered if else)
        {
            System.out.println("welcome to my website");
            }
        if(age<25 && age>20) {
            System.out.println("congo u have won a discount");
        }
        else if(age==13){
            System.out.println("please provide email id");
        }
        else
        {
            System.out.println("above 13 only");
        }
        System.out.println("feedback");
    }
}
