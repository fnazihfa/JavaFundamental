package com.java.program;

import java.util.Scanner;

public class OperasiAritmatika {
    public static void main(String[] args) {
        int nilaiA;
        int nilaiB;
        int hasil;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Input nilai A:");
        nilaiA = inputUser.nextInt();
        System.out.println("Input nilai B:");
        nilaiB = inputUser.nextInt();

        //penjumlahan
        hasil = nilaiA + nilaiB;
        System.out.printf("%d + %d = %d \n",nilaiA,nilaiB,hasil);

        //pengurangan
        hasil = nilaiA - nilaiB;
        System.out.printf("%d - %d = %d \n",nilaiA,nilaiB,hasil);

        //perkalian
        hasil = nilaiA * nilaiB;
        System.out.printf("%d * %d = %d \n",nilaiA,nilaiB,hasil);

        //pembagian
        hasil = nilaiA / nilaiB;
        System.out.printf("%d / %d = %d \n",nilaiA,nilaiB,hasil);

        //modulus
        hasil = nilaiA % nilaiB;
        System.out.printf("%d mod %d = %d \n",nilaiA,nilaiB,hasil);
    }
}
