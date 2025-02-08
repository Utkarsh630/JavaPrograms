package main;
//input: Subbu123raj
// output: Subburaj, 123
public class FormattedOutputString2 {
    public static void main (String[] args) {
        String input = "Subbu123raj";
        StringBuilder alpha = new StringBuilder (  );
        StringBuilder digit = new StringBuilder (  );

        for(char c: input.toCharArray ()){
            if(Character.isLetter ( c )){
                alpha.append ( c );
            }else if(Character.isDigit ( c )){
                digit.append ( c );
            }
        }
        System.out.println ("Output in alphabet: "+alpha.toString () );
        System.out.println ("Output in digits: "+digit.toString () );

    }

}
