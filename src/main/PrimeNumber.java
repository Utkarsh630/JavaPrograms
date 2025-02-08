package main;

public class PrimeNumber {

    public static void main (String[] args) {
        int num = 13;
        isPrime(num);
    }

    public static void isPrime(int num){
        boolean flag = false;
        if(num <= 1){
            flag=true;
        }
        for(int i=2;i<Math.sqrt ( num );i++){
            if(num % i == 0){
                flag=true;
            }
        }
        if(flag){
            System.out.println("Not a prime number");}
        else {
            System.out.println("Prime number");
        }
    }

}
