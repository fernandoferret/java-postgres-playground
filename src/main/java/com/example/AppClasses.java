package com.example;

public class AppClasses {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRenda(20000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1960);
        System.out.println("----------");
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println("----------");
    }
}
