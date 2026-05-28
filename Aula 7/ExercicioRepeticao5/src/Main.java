import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args){

        //Criação de Strings que vão receber um input do usuário.
        String valA = JOptionPane.showInputDialog(null,"Digite o numero inicial: ");
        String valF = JOptionPane.showInputDialog(null,"Digite o valor final: ");
        //Transformação de uma String em Int.
        int numA = Integer.parseInt(valA);
        int numF = Integer.parseInt(valF);
        //Criação de uma String vazia para armazenar os numeros no final.
        String fim = "";
        //Criação do laço for.
        for(int i = numF; i >= numA; i--){

            //Criação de uma variavel que vai armazenar o resto da divisão do sentinela por 2.
            int resto = i % 2;
            //Criação de um if para descobrir se o numero é par.
            if(resto == 0 ){

                //Armazenando os dados na String vazia.
                fim = fim + i + "\n";
            }
        }

        //output de dados.
        JOptionPane.showMessageDialog(null,"Ordem decrescente dos numeros pares: " + "\n" + fim );
    }
}
