import java.util.Scanner;
public class Loop_actualAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        int n = sc.nextInt();
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the difference number");
        int d = sc.nextInt();

        for(int i=a; i<=a+(n-1)*d; i+=d){
            System.out.println(i);
        }
    }
}
