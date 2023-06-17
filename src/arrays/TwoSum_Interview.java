package arrays;

public class TwoSum_Interview
{
    //My solution, lesser time complexity but maybe not the best logic
//    public int[] twoSum(int[] nums, int target)
//    {
//        int [] pair=new int[2];
//
//        int i=0;
//        while(i+1<nums.length)
//        {
//            if ((nums[i] + nums[i + 1]) == target)
//            {
//                System.out.println(i+","+(i+1));
//                pair[0] = i;
//                pair[1] = i + 1;
//            }
//            i++;
//        }
//
//        return pair;
//    }

    //Sir's solution
    public int [] twoSum(int [] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};
            }
        throw new IllegalArgumentException("No solution found! Sorry :(");
    }


    public static void main(String[] args)
    {
        int pairs[]=new TwoSum_Interview().twoSum(new int[]{2,7,11,15},29);
        for(int i=0;i<pairs.length;i++)
        {
            System.out.print("\t"+pairs[i]);
        }
    }
}
