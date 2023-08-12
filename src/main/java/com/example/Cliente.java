package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;

    public Cliente() {
        System.out.println("Criando cliente");
        double aleatorio = Math.random();
        if (aleatorio > 0.5)
            especial = true;
        else
            especial = false;
    }

    public double getRenda(){
        return renda;
    }

    public void setRenda (double renda){
        if (renda >= 0)
            this.renda = renda;
        else
            System.out.println("A renda não pode ter um valor negativo!");
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo=='M'||sexo=='F')
            this.sexo = sexo;
        else
            System.out.println("Erro na definição do sexo");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

}