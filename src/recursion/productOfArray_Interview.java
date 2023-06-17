package recursion;

public class productOfArray_Interview
{
    public int productOfArray(int []A, int N)
    {
        if(N==0)
            return A[N];

        return A[N-1]*productOfArray(A,N-1);
    }

    public static void main(String[] args)
    {
        int A[]={1,2,3,4,5};
        productOfArray_Interview a=new productOfArray_Interview();
        System.out.println(a.productOfArray(A,5));
    }

}
