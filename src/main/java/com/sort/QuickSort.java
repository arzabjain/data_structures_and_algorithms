package com.sort;

public class QuickSort implements Sorting {
    @Override
    public void sort(int[] A) {
        qsort(A,0, A.length-1);
    }

    public void qsort(int[] A,int start, int end){

        if(start < end) {
            int pIndex = partition(A, start, end);

            qsort(A, start, pIndex - 1);
            qsort(A, pIndex + 1, end);
        }
    }

    private int partition(int[] A, int start, int end){

        int pivot = A[end];

        int pIndex = start;

        for(int i = start; i < end - 1; i++){
            if(A[i] <= pivot){
                int temp = A[i];
                A[i] = A[pIndex];
                A[pIndex] = temp;
                pIndex++;
            }
        }

        int temp = A[pIndex];
        A[pIndex] = A[end];
        A[end] = temp;

        return pIndex;
    }
}
