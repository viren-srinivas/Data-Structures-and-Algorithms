package recursion;

public class reverseString_Interview
{
    public String reverse(String str)
    {
        if(str.length()==0)
            return "";
        return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(new reverseString_Interview().reverse("appmillers"));
    }
}
