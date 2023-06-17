package arrays;

public class permutation_Interview
{
    public boolean permutation(int[] array1, int[] array2)
    {
        if(array1.length!=array2.length)
            return false;

        int sum1=0;
        int sum2=0;
        int product1=1;
        int product2=1;
        for(int i=0;i<array1.length;i++)
        {
            sum1+=array1[i];
            product1*=array1[i];
            sum2+=array2[i];
            product2*=array2[i];
        }
//        for(int i=0;i<array2.length;i++) Can iterate through the same array instead of using two loops, saves time complexity
//        {
//
//        }

        if(product1==product2 && sum1==sum2)
            return true;
        else
            return false;

    }
    public static void main(String[] args)
    {
        System.out.println(new permutation_Interview().permutation(new int[]{1,2,3,4,5},new int[]{5,1,2,3,4}));
    }
}
