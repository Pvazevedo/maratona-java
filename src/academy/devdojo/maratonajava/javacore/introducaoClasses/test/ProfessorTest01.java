package academy.devdojo.maratonajava.javacore.introducaoClasses.test;

import academy.devdojo.maratonajava.javacore.introducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + " idade: " + professor.idade + " anos sexo: " + professor.sexo);

    }
}
