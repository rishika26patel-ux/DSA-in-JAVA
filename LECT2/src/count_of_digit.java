//public class count_of_digit {
//
//    static int count(int n) {
//        // Base case
//        if (n < 10) {
//            return 1;
//        }
//
//        // Recursive call
//        return 1 + count(n / 10);
//    }
//
//    public static void main(String[] args) {
//        int num = 12345;
//        System.out.println("digits: " + count(num));
//    }
//}



public class count_of_digit{
    static int count(int x){
        if(x==0) return 0;
        return 1+count(x/10);
    }
    public static void main(String[] args){
        int x=12345;
        System.out.println(count(x));
    }
}

