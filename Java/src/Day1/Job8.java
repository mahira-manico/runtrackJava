package Day1;
import java.util.Scanner;

public class Job8 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n=sc.nextInt();
        int sumCube=0;
        for(int i=1;i<=n;i++){ //a loop for to have all number until n
            sumCube+=i*i*i; //we use a power calcul
        }
        System.out.println("The sum of "+n +" is "+sumCube);
        sc.close();


    }
}
