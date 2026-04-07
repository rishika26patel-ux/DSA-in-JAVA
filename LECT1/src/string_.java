public class string_ {
    public static void main(String[] args){
        String str1 = "Hello" ;  //string literal
        System.out.println(str1);
        String str2 = new String("Hi");
        System.out.println(str2); // String object
        System.out.println(str1.length());
        System.out.println(str1.charAt(1));
        System.out.println(str1.substring(0,3));
        System.out.println(str1.equals(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.contains("Hello"));
        System.out.println(str1.replace('1','z'));
        String str3 = str1.concat("World");
        System.out.println(str3);
    }
}