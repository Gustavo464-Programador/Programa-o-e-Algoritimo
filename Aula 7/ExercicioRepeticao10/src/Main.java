import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        //Abertura do laço For
        for(int i = 1; i < 10; i++){

            //Declaração de variavel
            int par = i % 2;
            //If para saber se um numero é par
            if(par == 0){
                //Output de Dados
                System.out.println("Linha " + i);
            }

        }
    }
}