package main;

public class CountingDuplicatesString {

    public static void main (String[] args) {
        String []str = {"abc", "abc", "apple", "apple", "mango", "orange", "cherry", "cherry"};
        countDuplicates(str);
    }
    public static void countDuplicates(String[] str) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println (str[i]);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
