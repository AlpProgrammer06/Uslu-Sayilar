package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n,k;
        int total=1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("L�tfen �ss� al�nacak say�y� giriniz : ");
        n = scanner.nextInt();
        System.out.println("L�tfen �s olacak say�y� giriniz  : ");
        k = scanner.nextInt();


        for(int i=1; i<=k; i++){

            total =total*n;

        }
        System.out.println(" cevap   =   " + total);
    }
}

