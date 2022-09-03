package com.MaxMinFinderJava;

public class MaxMinFinder {
    public void findmaxmin(){
        int maxNumber=0;
        int minNumber=0;



        int [] maxminfinder = new int[]{-10,25,50,60,-40,80,-22};
        for (int i = 0; i < 7; i++) {
            if(maxminfinder[i]>maxNumber){
                maxNumber=maxminfinder[i];
            }

            if (maxminfinder[i]<minNumber){
                minNumber=maxminfinder[i];
            }

        }
        System.out.println("Max Value - "+maxNumber);
        System.out.println("Min Value - "+minNumber);







    }
}
