package Day1;

public class Job10 {
    public static void main(String[] args){

        long factorial=1;
        int n=8;
        for(int i=1;i<=n;i++){
            factorial=factorial*i; //at each loop the factorial value change
        }
        System.out.println(factorial);
    }
}
