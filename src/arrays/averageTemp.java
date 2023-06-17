package arrays;

import java.util.Scanner;

public class averageTemp
{
    static Scanner input=new Scanner(System.in);


    public static void main(String[] args) {

        int days;
        System.out.print("How many day's temperatures? ");
        days=input.nextInt();



        int[] temp=new int[days];
        int sum=0;
        for(int i=0;i<temp.length;i++)
        {
            System.out.print("Day "+(i+1)+"'s high temp ");
            temp[i]=input.nextInt();
            sum=sum+temp[i];

        }

        float avg=sum/ temp.length;

        System.out.println();
        System.out.println("Average = "+avg);

        int counter=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>avg)
                counter+=1;
        }

        System.out.println(counter+" days above average");
    }
}
