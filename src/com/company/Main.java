package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello Java Programing");
        patterrn(5);
        System.out.println();
        patteren2(5);
    }

    // * all print patteren2
    static void  patteren2(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void patterrn( int n){
        for (int i = 1; i<= n;i++){
            System.out.print(i+"\t");
        }
    }
}
