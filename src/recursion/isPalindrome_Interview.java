package recursion;

public class isPalindrome_Interview
{
    public  boolean isPalindrome(String s)
    {
//        if(s.length()==0)
//            return true;

        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        String s1 = new String(sbr);


        if ((s.charAt(s.length() - 1)) == (s1.charAt(s.length() - 1)))
        {
            isPalindrome(s.substring(0, s.length() - 1));
        }
        else
            return false;


        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(new isPalindrome_Interview().isPalindrome("lafda"));
    }
}
