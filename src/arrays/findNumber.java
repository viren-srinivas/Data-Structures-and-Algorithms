package arrays;

public class findNumber
{
    public void linearSearch(int [] intArray, int value)
    {
        for(int i=0;i<intArray.length;i++)
        {
            if(intArray[i]==value)
            {
                System.out.println("Value is found at the index of "+i);
                return; // remember to put return so that if the value is found, line 15 is not executed
            }
        }
        System.out.println(value+" is not found!");
    }

    public static void main(String[] args) {
        new findNumber().linearSearch(new int[]{1,2,3,4,5,6},6);
    }
}

