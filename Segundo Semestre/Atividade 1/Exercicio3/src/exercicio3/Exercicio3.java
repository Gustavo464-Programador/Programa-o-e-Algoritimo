/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import javax.swing.JOptionPane;
public class Exercicio3 {

   
    public static void main(String[] args) {
       
        //Declaração de variaveis
       int numA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor A"));
       int numB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor B"));
        
       //teste para saber se os números são iguais ou diferentes 
       if(numA == numB){
           
           int soma = numA + numB;
           
           //Atribui a uma nova variavel a soma realizada
           int numC = soma;
           
           JOptionPane.showMessageDialog(null,"a soma dos dois valores iguais é " + numC);
       }
       else{
           
           int mult = numA  * numB;
           
           //Atribui a uma nova variavel a multiplicação realizada
           int numC = mult;
           
           JOptionPane.showMessageDialog(null,"a soma dos dois valores diferentes é " + numC);
       }
    }
    
}
