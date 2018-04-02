package com.sort;

public class BubbleSort implements Sorting{

    @Override
    public void sort(int[] A) {

        for(int i=0 ; i < A.length; i++){

            int sorted = 1;

            for(int j = 0; j < A.length-1; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    sorted = 0;
                }
            }
            if(sorted == 1){
                break;
            }
        }
    }
}
