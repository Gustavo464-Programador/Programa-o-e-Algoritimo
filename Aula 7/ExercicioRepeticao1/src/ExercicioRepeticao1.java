public class ExercicioRepeticao1 {

public static void main(String[] args){

    //Criação do laço for
    for(int i = 1; i < 20; i++){

        int resto = i % 2;
      //Criação de um If para saber se o numero é par ou não.
      if( resto == 0){   
        //saida de dados via terminal
        System.out.println("numeros pares: " + i++);
      }
    }
 }

}
