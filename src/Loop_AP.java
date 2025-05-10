//import java.util.Scanner;
//public class Loop_AP {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int a = sc.nextInt();
//
//        for(int i=4; i<=3*a+1; i+=3){
//            System.out.println(i);
//        }
//
//    }
//}

import java.util.Scanner;
public class Loop_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the difference d: ");
        int d = sc.nextInt();
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(a+" ");
            a += d;
        }
    }
}