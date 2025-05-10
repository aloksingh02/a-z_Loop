import java.util.Scanner;
public class Loop_sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int sum = 0;
        while(a!=0){
            int digit = a%10;
            sum += digit;
            a/=10;
        }
        System.out.println(sum);
    }
}
