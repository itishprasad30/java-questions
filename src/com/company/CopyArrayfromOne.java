package com.company;

public class CopyArrayfromOne {
    public static void main(String[] args) {
        // instantite an array
        int []arr1 = new int[] {1,2,3,4,5,6};
        // copy the elements from arr1 to arr2
        int []arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        // print the element in arr1
        System.out.print("Elements in arr1 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print( arr1[i] + " ");
        }
        System.out.println();
        // print the element in arr2
        System.out.print("Elements in arr2 :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }

    }
}
