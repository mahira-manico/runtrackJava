package Day1;
import java.util.Scanner;

public class Job14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int inversed=0;
        while (number!=0) {
            int lastNumber = number % 10; //The modulo get the last number
            inversed = (inversed * 10) + lastNumber; //We move everything to the right and place our last number
            number = number / 10; //We delete the number we just moved to avoid an infinte loop
        }
        System.out.println("The inversed number is: "+inversed);

    }
}
