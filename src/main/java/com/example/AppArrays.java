package com.example;

import java.util.Arrays;

public class AppArrays {
    
    public static void main(String[] args) {
        
        double vetorzim[] = {10.1,20,30,40};

        System.out.println("\n");

        // convertendo array para string - para impressão do array
        System.out.println(Arrays.toString(vetorzim));
        System.out.println(vetorzim[0]);

        vetorzim[0] = 24;
        System.out.println(vetorzim[0]);        

    }

}
