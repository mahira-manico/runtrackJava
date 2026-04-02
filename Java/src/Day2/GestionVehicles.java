package Day2;

public class GestionVehicles {
    public static void main(String[] args){

    }
}

class Vehicle{
    String brand;
    String dateOfPurchase;
    long purchasePrice;
    long currentPrice;

    public Vehicle(String brand, String dateOfPurchase, long purchasePrice){
        this.brand=brand;
        this.dateOfPurchase=dateOfPurchase;
        this.purchasePrice=purchasePrice;
    }

    public void display(){
        System.out.println("The brand of this vehicle is a "+brand+", bought in "+dateOfPurchase+" and cost: "+purchasePrice);
    }

}

class Car extends Vehicle{
    double cylinder;
    int doorNumbers;
    int power;
    long mileage;

    public Car(String brand, String dateOfPurchase, long purchasePrice,double cylinder, int doorNumbers, int power, long mileage ) {

        super(brand, dateOfPurchase, purchasePrice);
        this.cylinder=cylinder;
        this.doorNumbers=doorNumbers;
        this.power=power;
        this.mileage=mileage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("This Car have a cylinder of: "+cylinder+" a door number of: "+doorNumbers+" a power of: "+power+" and a mileage of: "+mileage);
    }
}

class AirPlane extends Vehicle{
    String motorType;
    int flyHours;

    public AirPlane(String brand, String dateOfPurchase, long purchasePrice, String motorType, int flyHours){
        super(brand, dateOfPurchase, purchasePrice);
        this.motorType=motorType;
        this.flyHours=flyHours;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("This plane have a motor of type: "+motorType+" and his total of fly hours is: "+flyHours);
    }
}
