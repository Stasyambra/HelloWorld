package com.company;

/**
 * Created by Станислав on 03.04.2016.
 */
public class WhileTest {
    static int attempt;
    static public boolean condition(){
        float i = (float) Math.random();
        boolean result = i < 0.1;
        System.out.print(++attempt + " " + result + " for " + i);
        return result;
    }
}
