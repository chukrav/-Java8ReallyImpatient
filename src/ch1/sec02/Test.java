package ch1.sec02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

//        FuncInterface fobj = (int x)->System.out.println(2*x);
        FuncInterface fobj = (x -> System.out.println(2 * x)); // More cool!!!!
        fobj.abstractFun(5);

        testFun01();
    }

    public static void testFun01(){
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(x -> System.out.println(x));
        System.out.println("--------");
        arrL.forEach(x->{if(x % 2== 0) System.out.println(x);});

    }
}
