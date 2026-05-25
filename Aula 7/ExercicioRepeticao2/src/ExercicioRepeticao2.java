import javax.swing.JOptionPane;

public class ExercicioRepeticao2 {

public static void main(String[] args){


    int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero "));

    for(int i = 1; i <= 10; i++){

        int mult = i * num;

        JOptionPane.showMessageDialog(null,"Resultado " + mult );
    }

}

        }
