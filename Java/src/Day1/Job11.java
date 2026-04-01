package Day1;
import java.util.Scanner;

public class Job11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=sc.nextInt(); //the number is asked by the user
        long factorial=1; //if factorial<0 it won't work

        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
}
