package arrays;

import java.util.ArrayList;

public class isUnique_Interview
{
    //My own code, lesser time complexity
    public boolean isUnique(int [] intArray)
    {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<intArray.length;i++){
            if(!arrayList.contains(intArray[i]))
                arrayList.add(intArray[i]);
            else
                return false;

        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(new isUnique_Interview().isUnique(new int[]{6,2,3,4,5,6}));
    }
}
