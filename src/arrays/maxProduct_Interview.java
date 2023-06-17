package arrays;

import java.util.Arrays;

public class maxProduct_Interview
{
//    Method which I did
//    public String maxProduct(int[] intArray)
//    {
//        Arrays.sort(intArray);
//        return intArray[intArray.length-1]+","+intArray[intArray.length-2];
//    }

    //recommended method
    public String maxProduct(int [] intArray)
    {
        int maxProduct=0;
        String pairs="";
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j< intArray.length;j++){
                if(intArray[i]*intArray[j]>maxProduct)
                {
                    maxProduct=intArray[i]*intArray[j];
                    pairs=Integer.toString(intArray[i])+","+(intArray[j]);
                }

            }
        }
        return pairs;
    }

    public static void main(String[] args) {

        System.out.println(new maxProduct_Interview().maxProduct(new int[]{7,1,2,8}));
    }
}
