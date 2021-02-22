import java.util.Scanner;

public class BigInteger {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String num1= sc.nextLine();
        String num2 = sc.nextLine();
        BigInteger big1= new BigInteger();
        BigInteger big2= new BigInteger();
        System.out.println(big1.add(big2));
        System.out.println(big1.multiply(big2));
    }

}
