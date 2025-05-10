import java.util.Scanner;
public class Looop_geometricalProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio r: ");
        int r = sc.nextInt();
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(a+" ");
            a*=r;
        }
    }
}
