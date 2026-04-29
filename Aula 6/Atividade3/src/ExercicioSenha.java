import javax.swing.JOptionPane;

public class ExercicioSenha{
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog(null,"Digite sua senha");

        if(senha.equals("abcd")){
            JOptionPane.showMessageDialog(null,"Senha valida");
        }
        else{
            JOptionPane.showMessageDialog(null,"Senha invalida");
        }

    }
}