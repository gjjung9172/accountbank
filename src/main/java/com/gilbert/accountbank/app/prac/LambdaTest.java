package com.gilbert.accountbank.app.prac;

@FunctionalInterface
interface Calc {
    public int min(int x, int y);
}

public class LambdaTest {

    public static void main(String[] args) {

        Calc minNum = (x,y) -> x<y? x:y;
        System.out.println(minNum.min(3,4));
    }
}
