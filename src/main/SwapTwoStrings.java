package main;

public class SwapTwoStrings {
    public static void main (String[] args) {
        String s1="hello";
        String s2="world";
        System.out.println ("Before Swapping: s1- "+s1 + "; s2- "+ s2 );

//        Swapping using 3rd variable
//        String temp = s1;
//        s1=s2;
//        s2=temp;
//        System.out.println ("Using 3rd Variable-> After Swapping: s1- "+s1+"; s2- "+s2 );


//        Swapping without using 3rd Variable

        s1=s1+s2;
        s2=s1.substring (0,s1.length ()-s2.length ());
        s1=s1.substring ( s2.length () );
        System.out.println ("S1 = "+s1 + "; S2 = " + s2 );
    }
}
