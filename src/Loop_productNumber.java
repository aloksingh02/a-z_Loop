import java.util.Scanner;
public class Loop_productNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int product = 1;

        while(a!=0){
            int digit = a%10;
            product *= digit;
            a/=10;
        }
        System.out.println(product);
    }
}
