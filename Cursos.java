package com.company.Aula23.POO;

public class Cursos implements OfertasAcademicas{
    public String nome;
    public String descricao;
    public int horas;
    public double valorHora;

    public Cursos(String nome, String descricao, int horas, double valorHora) {
        this.nome = nome;
        this.descricao = descricao;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public double calcularPreco() {
        return this.horas * this.valorHora;
    }
}
