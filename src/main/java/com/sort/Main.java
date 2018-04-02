package com.sort;

public class Main {

    public static void main(String[] args) {

        int[] A = {2,1,5,3,4};

        Sorting sorting = new BubbleSort();

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
