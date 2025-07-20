package academy.devdojo.maratonajava.javacore.introducaoClasses.test;

import academy.devdojo.maratonajava.javacore.introducaoClasses.dominio.Estudante;

import java.sql.SQLOutput;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Zoro";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Sanji";
        estudante2.idade = 19;
        estudante2.sexo = 'M';

        System.out.println("Estudante 1");
        System.out.println("nome:" + estudante.nome);
        System.out.println("idade:" + estudante.idade);
        System.out.println("sexo:" + estudante.sexo);

        System.out.println("Estudante 2");
        System.out.println("nome:" + estudante2.nome);
        System.out.println("idade:" + estudante2.idade);
        System.out.println("sexo:" + estudante2.sexo);
    }
}
