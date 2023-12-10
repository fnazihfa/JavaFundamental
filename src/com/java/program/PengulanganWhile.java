package com.java.program;

public class PengulanganWhile {
    public static void main(String[] args) {

        int a = 0;
        boolean kondisi = true;

        while (kondisi){
            System.out.println("while loop ke-"+a);
            a++;
            if(a==15){
                kondisi=false;
            }
        }
        System.out.println("");
    }
}
