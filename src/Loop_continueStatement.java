import java.util.Scanner;
public class Loop_continueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        for(int i=0; i<=a; i++){
            if(i==14 || i==25) continue;
            System.out.println(i);
        }
    }
}
