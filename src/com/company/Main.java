package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int arraynum[]={-1,9,20,40,80,6,12,40};
    public static void main(String[] args) {

          qucikSort(arraynum,0,arraynum.length-1);

          for(int i=0;i<arraynum.length;i++)
          {
              System.out.println(arraynum[i]);
          }



    }

    private static void qucikSort(int[] arraynum,int low,int high)
    {
        if (low < high)
        {

            int  mid = partition(arraynum, low, high);
            qucikSort(arraynum, low, mid - 1);
            qucikSort(arraynum, mid + 1, high);

        }
    }

    private static int partition(int[] arraynum, int low, int high)
    {
           int pivot = arraynum[high];

          int  i = (low - 1) ;

            for (int j = low; j <= high- 1; j++)
            {
                if (arraynum[j] < pivot)
                {
                    i++;
                    swapint(i,j);
                }
            }
            swapint(i+1,high);

            return (i + 1);
        }

    private static void swapint(int i, int j)
    {
        int temp=arraynum[i];
        arraynum[i]=arraynum[j];
        arraynum[j]=temp;
    }


    /**
     * Generating random number from 0 to 25
     * @return
     */
    private static int randomGen()
    {
        Random random=new Random();
        int upperBound=25;
        return random.nextInt(upperBound);
    }




}
