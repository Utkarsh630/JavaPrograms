package main;

//input: aabbcccdddd
//output: a2b2c3d4

public class CharacterCount {

    public static void main (String[] args) {
        String input = "aabbcccdddd";
        int count=1;
        StringBuilder result = new StringBuilder ();
        char[] ch = input.toCharArray ();
        for (int i = 0; i < ch.length; i++) {
            if(i+1<ch.length && ch[i] == ch[i+1]){
                count++;
            }else {
                result.append (ch[i]).append ( count );
                count=1;
            }
        }
        System.out.println (result.toString () );
    }

}
