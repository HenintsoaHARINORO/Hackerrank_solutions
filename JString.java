import java.util.Scanner;

public class JString {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String input= sc.nextLine();
        int length = sc.nextInt();
        String smallest ="";
        String largest="";
        for (int i=0;i<=input.length()-length;i++) {
            String s1 = input.substring(i, i + length);
            if (i == 0) {
                smallest = s1;
            }
            if (s1.compareTo(largest) > 0) {
                largest = s1;
            } else if (s1.compareTo(smallest) < 0) {
                smallest = s1;
            }

        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
