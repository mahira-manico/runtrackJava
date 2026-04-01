package Day2;
//error="java: non-static variable toto cannot be referenced from a static context"

    class Toto {
    int toto=0;
    Toto(){
        toto=toto+1;
    }
    public static void main(String[] tutu){
        Toto t1=new Toto();
        Toto t2=new Toto();
        System.out.println("Toto: ");

    }
}
