/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Vector;

/**
 *
 * @author Herry
 */
public class Estudante {

    private String nome;
    private Vector<Double> teste;
    private double media;

//Construtor
//    public Estudante(String nome, Vector<Double> teste) {
//        this.nome = nome;
//        this.teste = teste;
//       
//    }
//    
//Metodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vector<Double> getTeste() {
        return teste;
    }

    public void setTeste(Vector<Double> teste) {
        this.teste = teste;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

//Metodo para calcular media de cada estudante
    public static double calcularMedia(Vector<Double> notas) {
        int soma = 0;
        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }
        double media = soma / notas.size();
        return media;
    }

    //  metodo para exibir o estudante com melhor media;
    public static Estudante melhorEstudante(Vector<Estudante> a) {

        Estudante melhor = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getMedia() > melhor.media) {
                melhor = a.get(i);
            }
        }

        return melhor;
    }

}
