package BigO;

public class printPairsArray_Interview
{
    static void printPairs(int arr[])
    {
        for (int i = 0; i < arr.length; i++) //O(n)
        {
            for(int j=0;j<arr.length;j++) //O(n)
            {
                System.out.println(arr[i]+","+arr[j]);//O(1)

            }
        }

    }
//Time Complexity: O(n^2) because for any value of first loop there is second loop (mentioned in lecture) complexity is O(n^2)
    public static void main(String[] args) {
      printPairs(new int[]{1,3,4,5});
    }
}
