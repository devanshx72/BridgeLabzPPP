import java.util.*;
public class AnagramWords {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram Words");
        }
        else{
            char ch1[]= str1.toCharArray();
            char ch2[]= str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            System.out.println(Arrays.equals(ch1,ch2) ? "Anagram Words" : "Not Anagram Words");
        }
    }
}
