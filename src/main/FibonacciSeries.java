package main;

public class FibonacciSeries {
    public static void main (String[] args) {
        int n=11;
        fibonacciSeries(n);
    }
    public static void fibonacciSeries(int n){
        int a=0,b=1,c;

        for(int i=0;i<=n;i++){
            System.out.print (a+ " " );
            c=a+b;
            a=b;
            b=c;
        }

    }
}
