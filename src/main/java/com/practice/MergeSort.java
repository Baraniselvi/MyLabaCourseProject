package com.practice;

public class MergeSort {

    public void merge(int[] num, int left, int mid, int right) {

        int s1 = mid - left + 1;
        int s2 = right - mid;

        int[] ltemp = new int[s1];
        int[] rtemp = new int[s2];

        for (int i = 0; i < s1; i++)
            ltemp[i] = num[left + i];
        for (int j = 0; j < s2; j++)
            rtemp[j] = num[mid + 1 + j];
        int i = 0;
        int j = 0;
        int k = left;
        while (i < s1 && j < s2) {

            if (ltemp[i] <= rtemp[j]) {
                num[k] = ltemp[i];
                i++;
            } else {
                num[k] = rtemp[j];
                j++;
            }
            k++;
        }
        while (i < s1) {

            num[k] = ltemp[i];
            i++;
            k++;
        }
        while (j < s2) {
            num[k] = rtemp[j];
            j++;
            k++;
        }

    }


    public void sort(int num[], int left, int right) {


        if (left < right) {
            int mid = (left + right) / 2;
            sort(num, left, mid);
            sort(num, mid + 1, right);
            merge(num, left, mid, right);

        }
    }


    public static void printarr(int[] num) {


        int n = num.length;
        for (int s = 0; s < n; s++) {
            System.out.println(num[s]);
        }

    }

    public static void main(String[] args) {


        int[] num = {12, 34, 55, 39, 11, 2, 5, 78};
        System.out.println("Before MergeSort");
        printarr(num);
        MergeSort obj = new MergeSort();
        obj.sort(num,0,num.length-1);
        System.out.println("After MergeSort");
        printarr(num);


    }
}
