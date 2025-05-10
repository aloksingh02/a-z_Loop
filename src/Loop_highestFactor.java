//import java.util.Scanner;
//public class Loop_highestFactor {
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number n: ");
//        int n = sc.nextInt();
//        int nf = 1;
//        for(int i=1; i<n; i++){
//            if(n%i==0){
//                nf = i;
//            }
//            System.out.print(nf);
//        }
//    }
//}

import java.util.Scanner;
public class Loop_highestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        int hf = 1;
        for(int i=n-1; i>=1; i--){
            if(n%i==0) {
                hf = i;
                break;
            }
        }
        System.out.println(hf);
    }
}