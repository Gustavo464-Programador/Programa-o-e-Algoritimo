import javax.swing.JOptionPane;
public class ExercicioRepeticao4 {

    public static void main(String[] args){

        //Criação de Strings que vão receber um input do usuário.
        String valA = JOptionPane.showInputDialog(null,"Digite o numero inicial: ");
        String valF = JOptionPane.showInputDialog(null,"Digite o valor final: ");
        //Transformação de uma String em Int.
        int numA = Integer.parseInt(valA);
        int numF = Integer.parseInt(valF);
        //Criação de uma variavel acumuladora que vai receber a soma final.
        int soma = 0;
        //Criação de um laço for.
        for( int i = numA; i < numF; i ++){
            //Variaver para armazenar o resto da divisão do sentinela por 2.
            int resto = i % 2 ;
            //if para saber se o sentinela é impar.
            if(resto != 0){

                 soma = soma +  i;

            }

        }
        //Output de dados através de uma janela.
        JOptionPane.showMessageDialog(null,"A soma dos numeros impares é: " + soma);
    }
}