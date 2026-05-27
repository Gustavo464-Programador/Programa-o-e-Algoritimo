import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        int contador = 0;
        String fim = "";
       for(int i = 1; i <= 15; i++){

           String numeros = JOptionPane.showInputDialog(null,"Digite o " + i + "º" + " numero");
           int numA = Integer.parseInt(numeros);


           if(numA > 30){

               contador++;
               fim = fim + contador + " numeros" + "\n";
           }


       }
        JOptionPane.showMessageDialog(null,"A quantia de numeros maiores que 30 é " + "\n" + fim);
    }
}