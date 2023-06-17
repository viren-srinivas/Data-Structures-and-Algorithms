package recursion;
//You solved it yourself!!

public class GCD_Interview
{
    static int GCD(int n1,int n2)
    {
        if(n1<0||n2<0)
            return -1;
        if(n1%n2==0)
            return n2;

        return GCD(n2,n1%n2);
    }


    public static void main(String [] args)
    {
        System.out.println(GCD(8,4));
    }
}
