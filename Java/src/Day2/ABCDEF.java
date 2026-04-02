package Day2;

public class ABCDEF {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();
        E e=new E();
        F f=new F();

        a=b;
        // b=d: Incorrect, b cannot be compared to it's parent but a parent can be compared to its child
        // a=(A)b: Incorrect, b is already a child of A, it is redundant
        a=null;
        // null=a: Incorrect because value "a" is always a null by default but null cannot be compared to a value because null si already a value
        a=d;
        // b=d: Incorrect because b and d are not related by any inheritance but are cousins
        a=e;
        d=e;

        A[] as=new A[10];
        as[0]=new A();
        as[1]=new B();
        as[2]=new D(2);
        as[3]=new E();
        as[4]=new C();
        as[5]=new D(4);
        as[6]=new B();

        search(as);
        addition(as);

    }
    private static void search(A[] as){
        int counter=0;
        for(int i = 0; i< as.length; i++){
          if(as[i]!=null){
              if(as[i] instanceof B){
                  counter++;
              }
          }
        }
        System.out.println("There is "+counter+" instance of class B");
    }
    private static void addition(A[] as){
        int totalD=0;
        for(int i=0; i<as.length;i++){
            if (as[i] != null) {
                if(as[i] instanceof D tempD){
                    totalD+=tempD.d;
                }
            }
        }
        System.out.println("There is a total of "+totalD+" D.");
    }

}

class A{
    public A(){}
}

class B extends A{
    public B(){
        super();
    }
}

class C extends B{
    public C(){
        super();
    }
}

class D extends A{
    protected int d=1;

    public D(int x){
        super();
        d=x;
    }

    public D(){

    }
}

class E extends D{
    public E(){
        super();
    }
}

class F extends D{
    public F(){
        super();
    }
}
