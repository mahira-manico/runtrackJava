package Day1;
import java.util.Scanner;

public class Job4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number: "); //ask the user a number
        int square=scanner.nextInt(); //take the value
        int result=square*square; //new variable to stock the result
        System.out.println("The square of "+square+ " is "+result); //display of the result

    }
}
