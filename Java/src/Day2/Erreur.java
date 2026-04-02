package Day2;

class Erreur {
    public static void main(String args[]){
     E1 x=new E1();
     E2 y=new E2();
     E3 z=new E3();
     E4 v=new E4();
     E5 w=new E5();
        System.out.println(x.a); //Correct
        System.out.println(y.b); //Incorrect: System.out.println(y.c);
        System.out.println(z.c); //Incorrect: System.out.println(z.b);
        System.out.println(v.d); //Incorrect: System.out.println(v.c);
        System.out.println(w.e); //incorrect: System.out.println(w.a);
    }
}

class E1{
    int a=1;
}

class E2{
    int b=2;
}

class E3{
    int c=3;
}

class E4{
    int d=4;
}

class E5{
    int e=5;
}
