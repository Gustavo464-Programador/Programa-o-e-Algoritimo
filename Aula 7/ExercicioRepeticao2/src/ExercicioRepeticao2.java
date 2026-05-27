import javax.swing.JOptionPane;

public class ExercicioRepeticao2 {

public static void main(String[] args){

    //Entrada de dados transformando de String para Int.

    int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero "));

    //Laço for apresentando os parâmetros.
    for(int i = 1; i <= 10; i++){

        //Declaração de uma variavel que vai receber o sentinela multiplicado pelo valor inserido pelo usuário
        int mult = i * num;

        //Caixa de dialogo através da Biblioteca swing.
        JOptionPane.showMessageDialog(null,"Resultado " + mult );
    }

}

        }
