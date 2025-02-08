package main;

public class Factorial {

    public static void main (String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
//    public static int factorial(int n){
//        if(n==0){
//            return 1;
//        }else{
//            return n*factorial ( n-1 );
//        }
//    }

    public static int factorial(int n){
        int fact = 1;
        if(n==0) {
            return 1;
        }else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

}
