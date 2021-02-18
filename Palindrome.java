import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String a){
        boolean isPal= true;
        for (int i = 0;i<(int)a.length()/2;i++){
            if (a.charAt(i)!=a.charAt(a.length()-1-i)){
             isPal=false;
             break;
            }
        }
        return isPal;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input= sc.next();
        System.out.println(isPalindrome(input)?"YES":"NO");
    }
}
