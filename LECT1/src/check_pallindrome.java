public class check_pallindrome{
    public static void main(String[]args)
    {
        String a="tanuunat";
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b+=a.charAt(i);
        }

        if(a.equals(b))
        {
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
    }
}
