package com.java.program;

public class BreakContinueReturn {
    // break continue return

    public static void main(String[] args) {
        int a = 0;
        while (true){
            a++;

            if (a==8){
                break;
            } else if (a==5) {
                continue;
            } else if (a==7) {
                return;
            }

            System.out.println("looping ke = "+a);
        }
    }
}
