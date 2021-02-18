public class Palindrome {
    public static boolean isPalindrome(String a){
        boolean isPal= true;
        for (int i = 0;i<(int)a.length()/2;i++){
            if (a.charAt(i)!=a.charAt(a.length()-1-i)){
             isPal=false;
             break;;
            }
        }
    }
    public static void main(String [] args){

    }
}
