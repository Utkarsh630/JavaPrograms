package main;

public class ArmstrongNumber {
    public static void main (String[] args) {
        int number = 153;
        isArmstrongNumber(number);
    }
    public static void isArmstrongNumber(int n){
        int temp = n, a, arm=0;
        while (n>0){
            a=n%10;
            n=n/10;
            arm = arm+a*a*a;
        }
        if(arm == temp){
            System.out.println ("Armstrong Number" );
        }else{
            System.out.println ("Not armstrong number" );
        }
    }
}
