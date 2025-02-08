package main;

//program to find the nth Fibonacci number
public class FibonacciNumber {

    public static void main (String[] args) {
        int n=3;
        System.out.println(fibonacciNumber(n));
    }
  public static int fibonacciNumber(int n){
        if(n<=1) {
            return n;
        }else {
            return fibonacciNumber(n-1)+fibonacciNumber(n-2);
        }
  }

}