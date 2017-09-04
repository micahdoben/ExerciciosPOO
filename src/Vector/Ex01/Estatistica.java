/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector.Ex01;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Herry
 */
public class Estatistica {
    
    
    
    
    
    //Metodo pra calcular a media dos elementos do vetor
    public static int calcularMedia(Vector<Integer> a){
     int soma = 0;
     for (int i = 0; i<a.size(); i++){
         soma +=a.get(i);
     } int media = soma/a.size();
     return media;
}
    
    //Metodo pra indicar a moda dos elementos do vetor
    public static void moda(Vector<Integer> a){
        int controlador = 0;
            int  moda = 0;
        for(int i = 0; i<a.size(); i++){
        for(int j = i+1; j< a.size() - 1; j++){
           if(a.get(i)  == a.get(j))
               controlador++;
        }
        }
        for(int i = 0; i<a.size();i++)
        if(controlador > 1)
            moda =a.get(i);
        System.out.println("O elemento que mais se repete e :" + moda);
    }
    
    //Metodo pra indicar a mediana no vetor 
    public static void mediana(Vector<Integer> a){
        double mediana = 0;
        if((a.size() % 2) == 0){
            mediana = (a.get((a.size()/2 )- 1) + a.get(a.size() /2)) /2;
        } else
        {
          mediana =  a.get(( a.size() - 1)/2 );
        }
        System.out.println("A mediana do vetor e : " +mediana);
    }
    
    
    
    
   static Vector<Integer> numeros = new Vector<>();
   
   
    public static void main(String[] args) {
        
    int nrElementos = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros deseja introduzir"));
    for (int i = 0; i < nrElementos; i++){
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduza os numeros"));
    numeros.add(numero);
    }
    
    System.out.println("A media dos elementos e : " +calcularMedia(numeros));
        moda(numeros);
        mediana(numeros);
        
}


}
