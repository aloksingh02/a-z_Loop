import java.util.Scanner;
public class Loop_countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int count = 0;

        while(a!=0){
            a/=10;
            count++;
        }
        System.out.println(count+" is total digits");
    }
}
