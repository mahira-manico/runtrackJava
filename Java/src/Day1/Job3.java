package Day1;

public class Job3 {
    public static void main(String[] args){
        int[] T=new int[10];
        for(int i=0;i<T.length;i++){
            T[i]=i;
        }
        System.out.println("T[0]="+T[0]);
        System.out.println("T[1]="+T[1]);
        System.out.println("T[5]="+T[5]);
        System.out.println("T[9]="+T[9]);
        System.out.println("T[10] is out of range");
    }
}
