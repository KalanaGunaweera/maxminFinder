package com.MaxMinFinderJava;

public class MaxMinFinder {
    public void findmaxmin(int[] array){
        int maxNumber =0;
        int minNumber =0;



        //int [] maxminfinder = new int[]{-10,25,50,60,-40,80,-22};
        for (int i = 0; i <array.length; i++) {
            if(array[i]>maxNumber ){
                maxNumber=array[i];
            }

            if (array[i]<minNumber){
                minNumber=array[i];
            }

        }
        System.out.println("Max Value - "+maxNumber);
        System.out.println("Min Value - "+minNumber);







    }
}
