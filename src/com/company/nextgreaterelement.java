package com.company;

// greater elements in a given array
class nextgreaterelement {
    // prints elements and next greater el pair for all elements of arr[] of size n

    static  void  printNextGEL (int arr[] ,int n){
        int next,i,j;
        for (  i = 0; i < n; i++) {
           next = -1;
            for (j = 0; j < n; j++) {
                if(arr[i] <arr[j]) {
                    next= arr[j];
                    break;

                }

            }
            System.out.println(arr[i] + "--" +next);
        }
    }

    public static void main(String args[]){
        int arr[] = {11,13,21,2};
        int n = arr.length;
        printNextGEL(arr,n);
    }
}
