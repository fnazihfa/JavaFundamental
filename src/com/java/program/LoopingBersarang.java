package com.java.program;

public class LoopingBersarang {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
                if(i==j){
                    break;
                }
            }
            System.out.println("\n");
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
                if((i+j)==4){
                    break;
                }
            }
            System.out.println("\n");
        }

        for(int i=0; i<=6; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            for(int l=1; l<=i-1; l++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
