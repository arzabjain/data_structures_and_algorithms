package com.sort;

public class SelectionSort implements Sorting {
    @Override
    public void sort(int[] A) {

        for(int i = 0; i < A.length-1; i++){

            int min = i;

            for(int j = i+1; j < A.length; j++){

                if(A[j] < A[min]){
                    min = j;
                }
            }

            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }
}
