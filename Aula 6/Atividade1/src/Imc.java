//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



import javax.swing.JOptionPane;
public class Imc {
    public static void main(String[] args){
        String Sexo= JOptionPane.showInputDialog(null,"Digite seu Genero (masculino ou feminino)");

        double peso= 0;
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu altura"));



      
        if(Sexo == "masculino") {
            peso = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal e" + peso);
        }
        else
            peso = (62.1 * altura) - 44.7;
        {
            System.out.println("Seu peso ideal e " + peso);
            JOptionPane.showMessageDialog(null,"Seu peso ideal e " + peso);
        }




    }
}






