package recursion;

import java.util.Arrays;

public class someRecursive_Interview
{
    public boolean someRecursive(int[] arr, OddFunction odd)
    {
        if((odd.run(arr[arr.length-1])))
             someRecursive(Arrays.copyOfRange(arr,0,arr.length-1),odd);
        else
            return true;

        return false;

    }

}
