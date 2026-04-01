package Day1;
import java.util.Scanner; //import of scanner method

public class Job2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in); //instantiation of Scanner class

        System.out.println("What's your name?");
        String name=scanner.nextLine(); //display user typing in the next line
        System.out.println("Hello, " + name); //answer the user
        scanner.close(); //close the Scanner
    }
}
