package com.company.Aula23.POO;

public class Main {
    public static void main(String[] args) {
        Cursos frontend = new Cursos("FrontEnd", "Curso para web", 32, 1000.00);
        Cursos backend = new Cursos("BackEnd", "Curso de Backend", 40, 900.00);

        ProgramaIntensivo programa = new ProgramaIntensivo("FullStack", "Curso muito caro!", 20.00);
        programa.addCurso(frontend);
        programa.addCurso(backend);

        System.out.println(programa.toString());
        System.out.println(programa.calcularPreco());


    }
}
