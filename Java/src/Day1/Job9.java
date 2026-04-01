package Day1;
import java.util.Scanner;

public class Job9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=sc.nextInt();
        if(age<18){ //Condition to verify is the user is legal
            System.out.println("You are not legal");
        } else{
            System.out.println("You are legal");
        }

    }

}
