import java.util.Scanner;
public class Looop_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
