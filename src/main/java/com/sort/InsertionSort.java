package com.sort;

public class InsertionSort implements Sorting {
    @Override
    public void sort(int[] A) {

        for(int i=1; i < A.length; i++){
            int value = A[i];
            int hole = i;

            while (hole > 0 && A[hole-1] > value){
                A[hole] = A[hole-1];
                hole = hole - 1;
            }

            A[hole] = value;
        }
    }
}
