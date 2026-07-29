/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;
import javax.swing.JOptionPane;
public class Exercicio2 {

    
    public static void main(String[] args) {
     
        //Declaração de Variaveis
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro"));
        
        int div = num % 2; 
        
        //Teste para saber se o número é par ou ímpar
        if(div == 0){
            
            JOptionPane.showMessageDialog(null,"O número " + num + " é par");
        }
        else{
            JOptionPane.showMessageDialog(null,"O número " + num + " é ímpar");
        }
        //Teste para saber se o númro é positivo ou negativo
        if(num < 0){
            
            JOptionPane.showMessageDialog(null,"O número " + num + " é negativo");
        }
        else{
            JOptionPane.showMessageDialog(null,"O número " + num + " é positivo");
        }
    }
    
}
