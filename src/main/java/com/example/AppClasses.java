package com.example;

public class AppClasses {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setRenda(120000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1960);
        System.out.println("-----1-----");
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());
        System.out.println("----------");

        Cliente cliente2 = new Cliente(1230000, 'F');
        System.out.println("-----2-----");
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano: " + cliente2.getAnoNascimento());
        System.out.println("Especial: " + cliente2.isEspecial());
        System.out.println("----------");
    }
}
