package Day1;
import java.util.Scanner;

public class Job1 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in); //Use of scanner to display user inputs
        System.out.println("Do you love chocolate?");
        String answer=scanner.nextLine();
        if (answer.equals("Yes")) {
        System.out.println("I love chocolate");
        } else {
            System.out.println("I do not love chocolate");
            scanner.close();
        }


    }
}
