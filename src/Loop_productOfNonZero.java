import java.util.Scanner;
public class Loop_productOfNonZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int product = 1;


        while(n!=0) {
            int digit = n%10;
            if(digit!=0){
                product *= digit;
            }
                n/=10;
        }
        System.out.println(product);
    }
}