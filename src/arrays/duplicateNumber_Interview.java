package arrays;

import java.util.ArrayList;

public class duplicateNumber_Interview
{
    //Lecturer's Method
    private static int removeDuplicates(int a[], int n) {

        if (n == 0 || n == 1) {

            return n;

        }

        int j = 0;

        for (int i = 0; i < n - 1; i++) {

            if (a[i] != a[i + 1]) {

                a[j++] = a[i];

            }

        }

        a[j++] = a[n - 1];

        return j;

    }
    public static int[] removeDuplicates(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!arrList.contains(arr[i]))
                arrList.add(arr[i]);

        }
        int [] array=new int[arrList.size()];
        for(int i=0;i< array.length;i++) {
            array[i] = arrList.get(i);
        }
        return array;
    }
}
