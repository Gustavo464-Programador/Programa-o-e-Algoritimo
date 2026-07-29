/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;
import javax.swing.JOptionPane;

public class Exercicio1 {

   
    public static void main(String[] args) {
       
       //Declaração de Variaveis 
       int numA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor A"));
       int numB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor B"));
       int numC = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor C"));
        
       //Criação de uma variavel para armazenar a soma
        int soma = numA + numB;
        
        //Teste para saber se a soma é maior ou menor que o terceiro número
        if(soma < numC){
            
            JOptionPane.showMessageDialog(null,"A soma é menor que C");
        }
    }
    
}
