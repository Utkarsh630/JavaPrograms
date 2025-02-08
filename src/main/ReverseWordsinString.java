// Input: This is a string
// Output: sihT si a gnirts


package main;

public class ReverseWordsinString {
    public static void main (String[] args) {
        String str = "This is a string";
        reverseWordsinString(str);
    }

    public static void reverseWordsinString(String str){
        String words[] = str.split(" ");
        String reverse = "";
        for(String word : words){
            String reverseWord = "";
            for(int i=word.length()-1;i>=0;i--){
                reverse += word.charAt(i);
            }
            reverse += reverseWord + " ";
        }
        System.out.println (reverse);
    }
}
