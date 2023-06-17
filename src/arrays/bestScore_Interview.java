package arrays;

import java.util.Arrays;
import java.util.Collections;

public class bestScore_Interview
{
    static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first+" "+second;

    }
    //My Solution
//    static String firstSecond(Integer[] myArray)
//    {
//        Arrays.sort(myArray);
//        return myArray[myArray.length-1]+" "+myArray[myArray.length-2];
//    }
}
