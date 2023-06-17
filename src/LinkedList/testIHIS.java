package LinkedList;

public class testIHIS
{

    public static void main(String[] args) {

        float [] ans=totalDistance(5);

        for(int i=0;i<2;i++)
        {
            System.out.println(ans[i]);
        }
    }
    public static float[] totalDistance(float initHeight)
    {
        int bounce=0;
        float totalDist=initHeight;

        float height=initHeight;

        while(height>1)
        {
            totalDist=totalDist+(height/2);
            height=(height/2);

            bounce++;
        }

        float [] bounceDistance=new float[2];
        bounceDistance[0]=bounce;
        bounceDistance[1]=totalDist;

        return bounceDistance;
    }

}
