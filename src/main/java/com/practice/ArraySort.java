package com.practice;

import java.util.Arrays;

public class ArraySort {
            public static void main(String[] args) {

                int[] num  = {24,32,45,67,88,36};
                System.out.println("Before Sorting:");
                for (int i = 0; i < num.length; i++) {
                    System.out.print(num[i] + " ");

                }
                int swap = 0;
                for(int i =0;i<num.length;i++)
                {
                    for(int j=i+1;j<num.length;j++)
                    {
                        if((num[j])<num[i])
                        {
                            swap =num[j];
                            num[j]=num[i];
                            num[i]=swap;
                        }
                    }
                }
                System.out.println();
                System.out.println("After sorting");
                for(int i =0;i<num.length;i++)
                {
                    System.out.print(num[i] + " ");
                }





    }






}

