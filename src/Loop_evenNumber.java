import java.util.Scanner;
public class Loop_evenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        for(int i=0; i<=a; i++) {
            if (i % 2 == 0){
                System.out.println(i);
        }
        }
    }
}
