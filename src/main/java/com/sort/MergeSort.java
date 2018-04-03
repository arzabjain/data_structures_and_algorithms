package com.sort;

public class MergeSort implements Sorting {
    @Override
    public void sort(int[] A) {

        if (A.length < 2)
            return;
        else {
            int size = A.length;

            int mid = size / 2;

            int[] left = new int[mid];
            int[] right = new int[size - mid];

            for (int i = 0; i < left.length; i++) {
                left[i] = A[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = A[mid + i];
            }

            sort(left);
            sort(right);
            merge(A,left,right);
        }
    }

    private void merge(int[] A, int[] left, int[] right){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                A[k] = left[i];
                k++;
                i++;
            }else{
                A[k] = right[j];
                k++;
                j++;
            }
        }

        while(i < left.length){
            A[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length){
            A[k] = right[j];
            k++;
            j++;
        }
    }
}
