package recursion;

public class recrsiveRange_Interview
{
    public int recursiveRange(int num)
    {
        if(num==0)
            return num;
        return num+recursiveRange(num-1);
    }

    public static void main(String [] args)
    {

    }
}
