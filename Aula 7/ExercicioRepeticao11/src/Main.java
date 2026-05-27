import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {

        //Criação de uma String Vazia.
        String fim = "";
        //Inicialização de um laço.
        for(int i = 1;  i <= 5; i++){

            //Criação de uma caixa de dialogo em string.
            String numero = JOptionPane.showInputDialog(null,"Digite o " + i +"º" + "numero");
            //Converção de String para Int.
            int numA = Integer.parseInt(numero);
            
            int Quad = numA*numA;
            fim = fim + i + "º numeros " + Quad +"\n";


        }


        JOptionPane.showMessageDialog(null, fim);
    }
}