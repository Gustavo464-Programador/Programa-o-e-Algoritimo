/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;

import javax.swing.JOptionPane;
public class Exercicio6 {

    
    public static void main(String[] args) {
        
        double sal = Double.parseDouble(JOptionPane.showInputDialog(null,"digite seu salário"));
        
        double reajuste = sal * 0.05;
        double salF = reajuste + sal;
        
        JOptionPane.showMessageDialog(null,"Seu salário final é " + salF );
    }
    
}
