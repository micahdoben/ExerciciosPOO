/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector.Ex05;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Herry
 */
public class OrdenarVetores {
    //Instanciando dois vetores
     static Vector<Integer> a = new Vector<>();
     static Vector<Integer> segundo = new Vector<>();
     
    
    //Metodo quw ordena
    public static void ordenar(){
        
        //Adicionando valores no primeiro vetor
        a.add(1);
        a.add(18);
        a.add(13);
        a.add(2);
        a.add(16);
        
        
        
        
        do{
                int maior = 0;     
                for(int i = 0; i < a.size(); i++){
                     if(a.get(i) > maior)   
                       maior = a.get(i);
                   }
        
                
        
        int i = a.size();
        do{
           
            //for(int i = a.size(); i > 0 ; i--)
            segundo.add(i, maior);
            a.remove(maior);
            i--;
        
        }while (segundo.contains(i) == false);
        
        
        }while (a.isEmpty()); // fechamento do while principal
        
        
        
        
        // Ciclo para imprimir o segundo vetor organizado
        for(int i = 0; i < segundo.size(); i++){
            System.out.println( "O vetor ordenado :" +segundo.get(i));
        }
    }
    
    public static void main(String[] args) {
        
        ordenar();
}
}
