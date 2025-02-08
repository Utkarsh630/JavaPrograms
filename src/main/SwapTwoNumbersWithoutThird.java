package main;

public class SwapTwoNumbersWithoutThird {

    public static void main (String[] args) {
        int a = 10;
        int b = 20;
        System.out.println ("Before swapping: a= " + a + " b= " + b);
        swapTwoNumbersWithoutThird(a, b);
    }
    public static void swapTwoNumbersWithoutThird(int a, int b){
        a= a+b;
        b= a-b;
        a=a-b;
        System.out.println ("After swapping: a= " + a + " b= " + b);
    }
}
