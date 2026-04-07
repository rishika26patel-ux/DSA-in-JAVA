
import java.util.Arrays;
public class check_anagram{
    public static void main(String[]args)
    {
        String a="heart";
        String b="earth";

        char[] c=a.toCharArray();
        char[] d=b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if(Arrays.equals(c,d))
        {
            System.out.println("Anagram");
        }else {
            System.out.println("not a Anagram");
        }
    }
}