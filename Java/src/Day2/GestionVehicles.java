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
