import java.util.Scanner;
public class Loop_arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        for(int i=1; i<=2*a+1; i+=2){
            System.out.println(i);
        }
    }
}
