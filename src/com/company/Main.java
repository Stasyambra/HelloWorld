package com.company;

import javax.sql.rowset.serial.SerialRef;
import java.util.*;
/** Comment for the Class Main123*/
public class Main {

    /** comment for a method */
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!!!");
        System.out.println(new Date());
        System.getProperties().list(System.out);


        Vars a = new Vars();
        Vars b = new Vars();
        a.i++;
        a.si++;
        System.out.println(a.i);
        System.out.println(a.si);
        b.i++;
        b.si++;
        System.out.println(a.i);
        System.out.println(a.si);
        System.out.println(args[0]);
        System.out.println(args[1]);
        String x = args[0], y = args[1];
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y);
        //System.out.println(x - y);
        //System.out.println(x * y);
        //System.out.println(x || y);
        System.out.println(x.equals(args[2]));

        while (WhileTest.condition())
            System.out.println( " Inside while!");
        int lim = 100000;
        int tj, qty = 1;
        System.out.println();
        System.out.println("1 is a simple");
        for (int ti=3; ti < lim; ti++) {
            for (tj = 2; tj < ti; tj++)
                if ((ti % tj) == 0) {
                    //System.out.println(ti + " is NOT a simple");
                    break;
                };
                if (ti <= tj) {
                    System.out.println(ti + " is a simple");
                    qty++;
                }


        }
        System.out.println("Amount of simple numbers: " + qty);
    }
    /** Comment for the variable i*/
}
