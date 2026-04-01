package Day1;
import java.util.Scanner;

public class Job13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int table=sc.nextInt();
        int result=0;
        for(int i=0;i<=10;i++){
            result=table*i; //We multiply the table by i
                System.out.println(table+"x"+i+" = "+result);
        }
    }
}
