package arrays;

public class missingNumber_Interview
{

//    Method that you implemented, honestly not that great :/
//    void missingNumber(int [] intArray)
//    {
//        int [] oneToTen={1,2,3,4,5,6,7,8,9,10};
//        int missNo=0;
//        for(int i=0;i<oneToTen.length;i++)
//        {
//            if(oneToTen[i]!=intArray[i])
//            {
////                System.out.println(oneToTen[i]);
//                missNo=oneToTen[i];
//                break;
//            }
//        }
//
//        System.out.println(missNo);
//    }

    void missingNumber(int intArray[])
    {
        int sum1=0;
        int sum2;

        for(int i=0;i< intArray.length;i++)
        {
            sum1+=intArray[i];
        }
        sum2=10*(10+1)/2; // Sum of first N natural numbers formula n=n(n+1)/2

        System.out.println("Missing Number is "+(sum2-sum1));
    }

    public static void main(String[] args) {

     new missingNumber_Interview().missingNumber(new int[]{1,2,3,4,5,6,8,9,10});


    }
}
