public class classmain {
    public String model;
    public String color;
    public int seats;
    //constructor without parameters
    public classmain(){
        model="Test model";
        color="test color";
        seats=4;
        System.out.println("first constructor");
    }
    //constructor with parameters
    public classmain(String model,String color,int seats){
        this.model=model;
        this.color=color;
        this.seats=seats;

    }

    public void display(){
        System.out.println("model is:"+model);
        System.out.println("color is:"+color);
        System.out.println("seats is:"+seats);
    }

    }
//constructor rules:1 constructors name should be same as of class,constructors do not have return type
//declaring constructors are not mandatory