package BigO;

//Solution in OneNote Slides
public class printUnorderedPairsArray_Interview
{
    void printUnorderedPairs(int [] array)
    {
        for(int i=0;i<array.length;i++)//O(n)
        {
            for(int j=i+1;j<array.length;j++)
            {
                System.out.println(array[i]+" , "+array[j]);//O(1)
            }
        }
    }
}

