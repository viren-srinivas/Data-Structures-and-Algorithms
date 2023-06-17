package recursion;

//You solved it yourself
public class DecimalToBinary_Interview
{

    static String binary(int n)//Method that I implemented
    {
        if(n/2==0)
            return String.valueOf(n%2);

        return String.valueOf(n%2)+binary(n/2);
    }

    static int binaryLec(int n) //Method that tutor used
    {
        if(n==0)
            return 0;
        return n%2+10*binaryLec(n/2);
    }
    public static void main(String [] args)
    {
//        StringBuffer sbr=new StringBuffer(binaryLec(20));
//        System.out.println(sbr.reverse());
        System.out.println(binaryLec(20));
    }
}
