//WAP to find all prime number between 1 to 1000?
package com.bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {
        for(int i=1;i<1000;i++){ // run loop 1 to 10 like 1,2,3,4,5,6,7,8,9
            int n=0;
            for(int j=1;j<=i;j++) {
                if (i % j == 0) {
                    n++;
                }
            }
                if (n<=2) {
                    System.out.print(" "+i);
                }
                }



        }
    }

