package Day3;

public class AbstractFinal {
    public static void main(String[] args){
        A[] tab=new A[3];
        tab[0]=new A();  //Since A is an abstract class she cannot be instantiated
        tab[1]=new B();
        tab[2]=new C();
        ((B)tab[1]).b=2; //tab could not find symbol b, needed (B) to find it
        ((C)tab[2]).c=3;  //c is a final value, a constant cannot be changed

    }
}

class A{
    int a;
}

class B extends A{
    int b;
}

class C extends A{
    double c=1;
}

abstract class D extends A{
    double d;
    int operation(int a){
        return (a*2);
    }
    abstract int calcul(int b);  //  abstract int calcul(int b): an abstract method cannot have a body {}

}
