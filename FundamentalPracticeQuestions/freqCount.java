import java.util.Arrays;

public class FreqCount {
    public static void main(String[] args) {
        String str="#CIGLA";
        int [] arr= new int[256];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println((char)i + " : " + arr[i]);
            }
        }
    }
}
