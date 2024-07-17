package com.mycompany.examenedd;

import java.util.Scanner;

public class ExamenEDD {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in); 
        System.out.print("tamanyo del array: ");
        int dat = sc.nextInt();
        int[] Arr = new int[dat];
        for (int i = 0; i < dat; i++) {
            System.out.print("valor de puesto " + i + ": ");
            Arr[i] = sc.nextInt();
            int suma = sumaElementos(Arr, dat - 1);
            System.out.println("  ");
        System.out.println("La suma de los elementos del array es: " + suma);
        }
        }
    public static int sumaElementos(int[] arr, int guia) {
        if (guia < 0) return 0;
        return arr[guia] + sumaElementos(arr, guia - 1);
    }
}

