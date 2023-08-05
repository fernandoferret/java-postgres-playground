package com.example;

import java.util.Arrays;

public class AppArrays {
    
    public static void main(String[] args) {

        System.out.println("========== ini ==========");

        int vetorquasearray[] = new int[5];

        for (int i = 0; i < vetorquasearray.length; i++) {
            vetorquasearray[i] = (i+1) * 100;
        }

        System.out.println(Arrays.toString(vetorquasearray));

        for (int i = 0; i < vetorquasearray.length; i++) {
            System.out.println("A posição " + i + " do vetor é " + vetorquasearray[i]);
        }

        System.out.println("____________________");

        double matriz[][] = new double[5][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i * matriz[i].length + j+1) * 10;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5.1f ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n");

        double vetorzao[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(vetorzao[0]));

        vetorzao[0] = new double[]{30,40,50};
        System.out.println(Arrays.toString(vetorzao[0]));
        
        double vetorzim[] = {10.2,20,30,40};

        System.out.println("\n");

        // convertendo array para string - para impressão do array
        System.out.println(Arrays.toString(vetorzim));
        System.out.println(vetorzim[0]);

        vetorzim[0] = 24;
        System.out.println(vetorzim[0]);

        System.out.println("========== fim ==========");

    }

}
