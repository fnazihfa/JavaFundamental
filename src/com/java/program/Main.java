package com.java.program;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello word");
//
//        String kata1 = "Hello Word";
//        System.out.println(kata1);
//
//        int a = 2;
//        int b = 8;
//        int c = a+b;
//
//        double angkaBerkoma = 3.7897;
//        System.out.println(c+angkaBerkoma);
//        System.out.println("Penambahan dari a + b = "+c);
//
//        String kataBaru = "Nama Saya";
//        String namaSaya = "Fadiyah Nazihfa Ukhti";
//        String gabungKata = kataBaru + namaSaya;
//        System.out.println(gabungKata);
//
//        String url = "https://bukugambar.com";
//        Boolean isThisTrue = url.startsWith("http");
//        System.out.println(isThisTrue);
//        Boolean isThisTrue2 = url.endsWith("com");
//        System.out.println(isThisTrue2);
//
        String textRegex = "DigitalSkola2023";
        System.out.println(textRegex.replaceAll("[A-Z0-9]","?"));

        String textRegex2 = "Saya mendapatkan uang senilai Rp 15000";
        System.out.println(textRegex2.replaceAll("[A-Za-z]",""));

        String namaMakan = "Mie Goreng, Nasi Uduk, pempek, gado-gado";
        String [] arrayMakan = namaMakan.split(",");
        System.out.println(arrayMakan[0]);
        System.out.println(arrayMakan[2]);
    }
}
