package Day1;
import java.util.Scanner;

public class Job5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y,z; //3 values initialised
        System.out.println("\nPlease enter 3 values: ");
        x=sc.nextInt();
        y=sc.nextInt();
        z= sc.nextInt();

        if(x>y && x>z){
            System.out.println(x+" is larger than "+y+" and "+z); //verify if x is larger
        } else if(y>z && y>x){
            System.out.println(y+" is larger than "+x+" and "+z); //verify if y is larger
        } else if (z>x && z>y) {
            System.out.println(z+ " is larger than "+x+" and "+y); //verify if z is larger
        } else {
            System.out.println("All numbers are equals"); //verify if z is larger
        }
    }

}
