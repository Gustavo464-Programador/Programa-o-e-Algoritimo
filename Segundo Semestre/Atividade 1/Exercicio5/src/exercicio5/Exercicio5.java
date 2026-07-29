/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

import javax.swing.JOptionPane;
public class Exercicio5 {

    
    public static void main(String[] args) {
        
        //Declaração de Variaveis do tipo double
        double salA = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu salário "));
        
        double salM = 1293.20; 
        
        //Opeção aritimética 
        double calculo = salA / salM;
        
        JOptionPane.showMessageDialog(null,"Você recebe " + calculo);
    }
    
}
