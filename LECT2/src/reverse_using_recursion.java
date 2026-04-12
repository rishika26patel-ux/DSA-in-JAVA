public class reverse_using_recursion {

    static int Number(int n, int rev) {
        // Base case
        if (n == 0) {
            return rev;
        }
        // Recursive call
        return Number(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        int num = 123;
        int result = Number(num, 0);
        System.out.println("Reversed: " + result);
    }
}
