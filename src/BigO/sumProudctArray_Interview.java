package BigO;

public class sumProudctArray_Interview {

    static void spofArray(int [] array)
    {
        int sum=0;//O(1)
        int product=1;//O(1)

        for(int i=0;i<array.length;i++)//O(N)
        {
            sum+=array[i];//O(1)
        }
        for(int i=0;i<array.length;i++)//O(N)
        {
            product*=array[i];//O(1)
        }
        System.out.println(sum+" , "+product);//O(1)
        System.out.println("J");
    }
//Hence Time Complexity is O(n)
    public static void main(String[] args)
    {

        spofArray(new int[]{1, 3, 4, 5});
    }

}
