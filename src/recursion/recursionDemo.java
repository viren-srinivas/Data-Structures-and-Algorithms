package recursion;

public class recursionDemo
{
    static void recursiveMethod(int n)
    {
        if(n<1) //base condition
            System.out.println("n less than 1");
        else
        {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }
    public static void main(String [] args)
    {
        recursiveMethod(4);
    }
}
