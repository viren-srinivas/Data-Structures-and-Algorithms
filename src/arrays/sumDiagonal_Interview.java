package arrays;

public class sumDiagonal_Interview
{
//    public int sumDiagonal(int[][] a)
//    {
//        int sum=0;
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a.length;j++){
//                if(i==j)
//                    sum=sum+a[i][j];
//            }
//        }
//        return sum;
//    }

    public int sumDiagonal(int[][] a) { //You do not actually need to go through two loops like in the above code which you did this saves time complexity in the long run
        int sum = 0;
        for (int i=0; i<a.length;i++) {
            sum+= a[i][i];
        }
        return sum;
    }
}
