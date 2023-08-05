package com.example;

import java.util.Arrays;

public class AppArrays {
    
    public static void main(String[] args) {

        double vetorzao[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(vetorzao[0]));

        vetorzao[0] = new double[]{30,40,50};
        System.out.println(Arrays.toString(vetorzao[0]));
        
        double vetorzim[] = {10.1,20,30,40};

        System.out.println("\n");

        // convertendo array para string - para impressão do array
        System.out.println(Arrays.toString(vetorzim));
        System.out.println(vetorzim[0]);

        vetorzim[0] = 24;
        System.out.println(vetorzim[0]);        

    }

}
