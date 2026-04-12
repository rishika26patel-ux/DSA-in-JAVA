import java.util.Scanner;

//public class X_power_N_recursion {
//
//    static int power(int x, int n) {
//        // Base case
//        if (n == 0)
//            return 1;
//
//        // Recursive case
//        return x * power(x, n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter base (x): ");
//        int x = sc.nextInt();
//
//        System.out.print("Enter power (n): ");
//        int n = sc.nextInt();
//
//        int result = power(x, n);
//        System.out.println("Result: " + result);
//    }
//}



public class X_power_N_recursion{
    static int power(int x, int n){
        if(n==0) return 1; //base case
        return x * power(x ,n-1); //recursive function
    }
    public static void main(String[]args){
        int x=2;
        int n=3;
        System.out.println(power(x ,n));
    }
}