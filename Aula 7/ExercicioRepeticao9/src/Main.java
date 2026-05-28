import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        //Criação do sentinela.
        int i = 1;

        //Criação de um contador que vai contar quantas vezes uma determinada condição do laço While foi verdadeira.
        int contador = 0;
        //Criação de um laço While.
        while (true) {
            //Input de dados com Strings.
            String numeros = JOptionPane.showInputDialog(null, "Digite o " + i + "º");
            //Tranforção de String em Int.
            int num = Integer.parseInt(numeros);
            i++;
            //Condição para contar os numeros entre 100 e 200.
            if(num > 100 && num <= 200){
                contador ++;
            }
            //Condição para o fim do While.
            if(num == 0){
                JOptionPane.showMessageDialog(null,"A quantidade de numeros digitados entre 100 e 200 é: " + contador);
                System.exit(0);
            }
        }
    }
}