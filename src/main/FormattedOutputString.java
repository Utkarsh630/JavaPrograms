package main;

// input: str = 32400121200
// output: 00003241212

public class FormattedOutputString {

    public static void main (String[] args) {
        String input = "32400121200";
        StringBuilder zeros = new StringBuilder (  );
        StringBuilder nonZeros = new StringBuilder (  );
        for(char c: input.toCharArray ()){
            if(c=='0'){
                zeros.append (c);
            }else {
                nonZeros.append ( c );
            }
        }
        System.out.println (zeros.toString () + nonZeros.toString () );
    }

}
