package Day2;

public class GestionVehicles {
    public static void main(String[] args){

    }
}

class Vehicle{ //Parent class
    String brand;
    int dateOfPurchase;
    double purchasePrice;
    double currentPrice;

    public Vehicle(String brand, int dateOfPurchase, double purchasePrice){
        this.brand=brand;
        this.dateOfPurchase=dateOfPurchase;
        this.purchasePrice=purchasePrice;
    }

    public void display(){ //Define display method
        System.out.println("The brand of this vehicle is a "+brand+", bought in "+dateOfPurchase+" and cost: "+purchasePrice);
    }

    public void calculPrice(int actualYear){ //Define current price calcul method
        int age=actualYear-dateOfPurchase;
        double decode =age*0.01;
        this.currentPrice=purchasePrice*(1- decode);

        if (this.currentPrice<0) {
            this.currentPrice=0;
        }
    }

}

class Car extends Vehicle { //Inherit Vehicle
    double cylinder;
    int doorNumbers;
    int power;
    double mileage;

    public Car(String brand, int dateOfPurchase, double purchasePrice, double cylinder, int doorNumbers, int power, long mileage) {

        super(brand, dateOfPurchase, purchasePrice); //Take the inherithed values
        this.cylinder = cylinder; //define each value of car
        this.doorNumbers = doorNumbers;
        this.power = power;
        this.mileage = mileage;
    }

    @Override //Inherit the display method of Vehicle
    public void display() {
        super.display();
        System.out.println("This Car have a cylinder of: " + cylinder + " a door number of: " + doorNumbers + " a power of: " + power + " and a mileage of: " + mileage);
    }

    @Override
    public void calculPrice(int actualYear){ //Calcul price bases on decote
        double decote=(actualYear-dateOfPurchase)*0.02;
        decote+=(this.mileage/10000)*0.5;
        if(brand.equalsIgnoreCase("Renault") || brand.equalsIgnoreCase("Fiat")){
          decote+=0.10; //Increase the loss of value
        } else if(brand.equalsIgnoreCase("Ferrari") || brand.equalsIgnoreCase("Porsche")){
            decote-=0.20; //Decrease the loss of value
        }
        this.currentPrice=purchasePrice*(1-decote); //Verification if the current price is not less than zero
        if (this.currentPrice < 0) {
            this.currentPrice = 0;
        }

    }
}

class AirPlane extends Vehicle { //Inherit Vehicle
    String motorType;
    double flyHours;

    public AirPlane(String brand, int dateOfPurchase, double purchasePrice, String motorType, int flyHours) {
        super(brand, dateOfPurchase, purchasePrice); //Define inherited values
        this.motorType = motorType;
        this.flyHours = flyHours;
    }

    @Override //Inherit display method from Vehicle
    public void display() {
        super.display();
        System.out.println("This plane have a motor of type: " + motorType + " and his total of fly hours is: " + flyHours);
    }

    @Override //Inherit calcul method and redefine it
    public void calculPrice(int actualYear) {
        double decote = 0;
        if (motorType.equalsIgnoreCase("HELICES")) { //calcul by hours of fly
            decote = (this.flyHours / 100) * 0.10;
        } else {
            decote = (this.flyHours / 1000) * 0.10;
        }
        this.currentPrice = purchasePrice * (1 - decote); //total current price
        if (this.currentPrice < 0) { //verification if current price is inferior to zero
            this.currentPrice = 0;

        }
    }
}
