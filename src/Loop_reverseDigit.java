import java.util.Scanner;
public class Loop_reverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        int rev=0;

        while(n!=0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
        }
        System.out.println(rev);
    }
}
