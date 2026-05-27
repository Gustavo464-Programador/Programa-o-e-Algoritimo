import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        //String para criar um espaçamento nos valores.
        String exibir = "";
        //Criação de um for com contagem decrescente.-
        for(int i =200; i >= 100; i--){

            //Repetição da string junto com o contador
            exibir = exibir + i + "   |   ";
            System.out.println("Linha " + i);
            //If para saber com quantos numeros o contador deve parar na caixa de dialogo por linha.
            if(i % 4 == 0){
                exibir = exibir + "\n" + " ";
            }
        }

        //Abre uma janela que vai possuir todos os valores agrupados seguindo a regra do if.
        JOptionPane.showMessageDialog(null,exibir);
    }
}