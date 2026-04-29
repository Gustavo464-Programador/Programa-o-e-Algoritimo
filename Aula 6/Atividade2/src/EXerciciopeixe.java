//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class EXerciciopeixe {
    public static void main(String[]args){

        double kg = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso em Kg"));
        double excesso = (kg - 50);
        double multa  = (4 * excesso);
        if(kg <= 50){
            JOptionPane.showMessageDialog(null,"Sem Multa");
        }
        if(kg > 50){
            JOptionPane.showMessageDialog(null,"A multa é: " + "R$" + multa);

        }




    }







}