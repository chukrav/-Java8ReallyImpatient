package ch1.sec02;

public class Test2 {
    // operation is implemented using lambda expressions
    interface FuncInter1
    {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions
    // above
    interface FuncInter2
    {
        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInter1 add = (x,y)->x+y;
        FuncInter1 mult = (x,y)->x*y;
        Test2 tobj = new Test2();

        System.out.println("Add: "+tobj.operate(3,6,add));
        System.out.println("Mult: "+tobj.operate(3,6,mult));

        FuncInter2 fobj = message -> System.out.println("Hellow, "+message);
        fobj.sayMessage("Geeks");
    }


}
