package arrays;

import java.util.ArrayList;

public class pairSum_Interview {
    public static String pairSum(int[] myArray, int sum)
    {
        String c="";
        for(int i=0;i<myArray.length;i++){
            for(int j=i+1;j<myArray.length;j++){
                if(myArray[i]+myArray[j]==sum)
                {
                    c=c+String.valueOf(myArray[i])+":"+String.valueOf(myArray[j]);
                    c=c+" ";
                }
            }
        }
        return c;
    }
}
