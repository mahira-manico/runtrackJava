package Day1;
import java.util.Scanner;

public class Job6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double value=0; //initializing of the value
        System.out.println("Please enter 5 numbers: ");
        value=value+sc.nextDouble(); //we increment the value 5 times
        value=value+sc.nextDouble();
        value=value+sc.nextDouble();
        value=value+sc.nextDouble();
        value=value+sc.nextDouble();
        System.out.println("The average is " +(value/5)); //calcul to calcul the average
        sc.close();
    }
}
