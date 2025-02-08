package main;

public class ReverseString {

    public static void main (String[] args) {
        String str = "Hello World";
        reverseString(str);
    }
    public static void reverseString(String str){
        String reverse = "";

        char[] ch = str.toCharArray ();
        for(int i=ch.length-1;i>=0;i--){
            reverse += ch[i];
        }
        System.out.println (reverse );
    }

}
