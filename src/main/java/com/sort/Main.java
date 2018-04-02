package com.sort;

public class Main {

    public static void main(String[] args) {

        int[] A = {2,1,5,3,4};

        /**
         * Uncomment the desired sort
         */

       // Sorting sorting = new BubbleSort();
        Sorting sorting = new SelectionSort();

        System.out.println("Before Sorting");

        for(int i : A){
            System.out.print(i + " ");
        }
        System.out.println();

        sorting.sort(A);

        System.out.println("After Sorting");

        for(int i : A){
            System.out.print(i + " ");
        }
    }
}
