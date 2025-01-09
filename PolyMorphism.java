class Vehicle{

    protected int printdetails(int mileage)
    {
        return mileage+5;
    }

    public String printdetails(String name)
    {
        return name;
    }
}

class Car2 extends Vehicle{

    public int printdetails(int num)
    {
        System.out.println("Child");
        return num;
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        int num=vehicle.printdetails(23);
        String name=vehicle.printdetails("Alto");
        System.out.println(num);
        System.out.println(name);
        Vehicle vehicle1=new Car2();
        int dep=vehicle1.printdetails(25);
        System.out.println(dep);
    }
}
