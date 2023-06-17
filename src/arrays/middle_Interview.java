package arrays;

import java.util.ArrayList;

public class middle_Interview {

    static int[] middle(int[] arr)
    {
        ArrayList<Integer>  arrayList=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(!(i==0||i==arr.length-1)) {
                arrayList.add(arr[i]);
            }
        }

        int [] arrayMiddle=new int[arrayList.size()];

        for(int i=0;i< arrayList.size();i++) {
            arrayMiddle[i] = arrayList.get(i);
        }

        return arrayMiddle;

    }

    //OR Lecturer's solution
//    static int[] middle(int[] arr) {
//        return Arrays.copyOfRange(arr, 1, arr.length-1);
//    }

    public static void main(String[] args)
    {
        int arr[]=new middle_Interview().middle(new int[]{1,2,3,4});
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
