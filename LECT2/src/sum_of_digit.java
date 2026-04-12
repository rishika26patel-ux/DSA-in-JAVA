public class sum_of_digit {
    static int sumdigit(int x){
        if(x==0) return 0;
      return  x%10 + sumdigit(x/10);
    }
    public static void main(String[]args){
        int x=12345;
        System.out.println(sumdigit(x));
    }

}
