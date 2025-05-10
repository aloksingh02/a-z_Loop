import java.util.Scanner;
public class Loop_geometricalProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("Geometric Progression:");
        for (int i = 0; i < n; i++) {
            int term = a * (int)Math.pow(r, i);
            System.out.print(term + " ");
        }
    }
}
