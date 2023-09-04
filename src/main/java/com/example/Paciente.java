package com.example;

public class Paciente {
    private String nome;
    private String estado;
    private int diasInternado;

    public Paciente() {

    }

    public Paciente(String nome, String estado, int diasInternado) {
        this();
        setDiasInternado(diasInternado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void getDiasInternado(int diasInternado) {
        this.diasInternado = diasInternado;
    }

    public void setDiasInternado(int diasInternado) {
        if (diasInternado <= 0)
            System.out.println("Número de dias negativo");
        else
            this.diasInternado = diasInternado;
    }
}
