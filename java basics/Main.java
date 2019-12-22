package mak;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        int a;
        int b;

        a = 5;
        b = 6;
        int c;
        c = a + b;
        int e = 11;
        e /= c;
        System.out.println(e);

        System.out.println("a = " + a + " b = " + b + " c = " + c);

        int var1 = 3, var2 = 5, var3 = 1, x = 2, y = -2, z = 6;
        //(a / c) + z / a

//        System.out.println( (var1 / var3) + var1 / var2);
//        Conditionals c1 = new Conditionals();
//        c1.cond();

//        RFU c2 = new RFU();
//        c2.comp_a_b();

        Iterations l1 = new Iterations();
        System.out.println(l1.x);
//        l1.loops();

        AP ap1 = new AP();
//        String AA = "Mubaruz";
//        ap1.fun3(AA);


//        Circle c1 = new Circle(11);
//        System.out.println(c1.get_area());

        AM obj = new AM();
//        obj.set_val(11);
//        System.out.println(obj.getVal());


//        StaticTest st1 = new StaticTest();
//        StaticTest st2 = new StaticTest();
//
//        System.out.println(st1.get_a());
//
//        st1.set_a(1111);
//
//        System.out.println(st2.get_a());

//        CALL BY REFERENCE-------------------
        Test ob = new Test(18, 30);
//        System.out.println(" Before calling fun-1- ob.a = " + ob.a  + "ob.b =" + ob.b);
//
//        ob.fun1(ob);
//
//        System.out.println("After calling fun-1 " + ob.a + "ob.b =" + ob.b );

//        -------------------------------------------

//        Vector a2 = new Vector(11, 12);
//        a2.print_vector();


        Line line1 = new Line(11, 22, 33, 55);
        Line line2 = new Line(5,11, 4, 55);

        System.out.println(line1.getLength());
        System.out.println(line2.getLength());
        System.out.println(line1.isGreater(line2));

        }


}