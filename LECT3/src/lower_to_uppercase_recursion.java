public class lower_to_uppercase_recursion {
    static String vowel(String str)
    {
        if(str.length()==0) return"";
        char ch=Character.toUpperCase(str.charAt(0));
        return ch+vowel(str.substring(1));
    }
    public static void main(String[]args){
        String str ="hello rishika";
        System.out.println(vowel(str));
    }
}
