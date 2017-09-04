/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Herry
 */
public class EstudanteTeste {
    
    //criacao dum objeto estudante
   static Vector<Estudante> meuVector = new Vector<>();
    
    public static void main(String[] args) {
        
    int totalAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos sao? "));
    
    //Ciclo para introduzir nome e notas de cada estudante
    for(int i = 0; i<totalAlunos ;i++ ){
        String nome = JOptionPane.showInputDialog("Introduza o"+i+"nome : ");
        double teste1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza a 1a notas"));
        double teste2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza 2a notas"));
        double teste3 = Double.parseDouble(JOptionPane.showInputDialog("Introduza 3a notas"));
         
        
        // este vetor e pra guardar os testes do estudante
        Vector<Double> testes = new Vector<Double>();
          testes.add(teste1);
          testes.add(teste2);
          testes.add(teste3);
          
          //Criando objeto estudante 
        Estudante a = new Estudante();
         a.setNome(nome);
         a.setTeste(testes);
         a.setMedia(a.calcularMedia(testes));
         
         //Adicionando o objeto no vetor
         meuVector.add(a); 
        
    } 
         //Este ciclo e pra impressao dos alunos
          for(int i=0 ; i< totalAlunos ; i++){
           System.out.println("Nome :" +meuVector.get(i).getNome());
           System.out.println("Notas dos Testes :" +meuVector.get(i).getTeste());
           System.out.println("A media :" +meuVector.get(i).getMedia());
       }
    
       
       
}
}