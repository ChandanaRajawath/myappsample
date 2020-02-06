public class abstrac {
    public static void main(String[] args){
        carr car1=new ferrari();
        carrepair carrepair=new carrepair();
        carrepair.repaircar(car1);
        car1=new audi();
        carrepair.repaircar(car1);
    }

}
