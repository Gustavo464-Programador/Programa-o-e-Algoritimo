/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import javax.swing.JOptionPane;
public class Exercicio4 {

  
    public static void main(String[] args) {
       
        //Declaração de uma variavel 
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro"));
        
        //Declaração das variaveis para um sucessor e um antecessor
        int sus = num + 1;
        int ante = num - 1;  
        //Menssagens 
        JOptionPane.showMessageDialog(null, num);
        JOptionPane.showMessageDialog(null,"Sucessor de " + num + " é " + sus );
        JOptionPane.showMessageDialog(null,"O antecessor de " + num + " é " + ante);
    } 
    
}
