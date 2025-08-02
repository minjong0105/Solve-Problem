import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if('a' <= c && c <= 'z'){
                result += (char)(c - 'a' + 'A');
            }else{
                result += (char)(c - 'A' + 'a');
            }
        }
        System.out.println(result);
    }
}