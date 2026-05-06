import javax.swing.JOptionPane;
public class CalculodaMioridade{

    public static void main(String[] args) {



        int idade;
        int data_N;
        int data_A;

         data_N = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua data de nascimento"));
         data_A  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua data Atual"));
        idade = data_A - data_N;
        if (idade < 18){
            JOptionPane.showMessageDialog(null,"Você é menor de idade");
        }
        else{
            JOptionPane.showMessageDialog(null,"Você é maior de idade");
        }





    }

}