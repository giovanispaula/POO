package com.company.Aula23.POO;

import java.util.ArrayList;

public class ProgramaIntensivo implements OfertasAcademicas{
    public String nome;
    public String descricao;
    public double desconto;

    public ArrayList<OfertasAcademicas> listaCursos;

    public ProgramaIntensivo(String nome, String descricao, double desconto) {
        this.nome = nome;
        this.descricao = descricao;
        this.listaCursos = new ArrayList<>();
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return  "nome do programa = " + nome + "\n" +
                "Descrição do programa = " + descricao + "\n" +
                "Lista de Cursos = " + listaCursos.toString();
    }

    @Override
    public double calcularPreco() {
        double valorTotal = 0;

        for (OfertasAcademicas programa:listaCursos) {
            valorTotal += programa.calcularPreco();
             }
        return (valorTotal * (1 - (desconto/100)));
    }

    public void addCurso(OfertasAcademicas curso){
        listaCursos.add(curso);
    }

    public void removerCurso( OfertasAcademicas curso){
        listaCursos.remove(curso);
    }
}
