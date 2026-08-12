//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Declaração de matrizes
        int [][] A = {

                {2, 4},
                {6, 8}
        };


        int [][] B = {

            {1, 3},
            {5, 7}
        };

        //Declaração da matriz C que armazenará o resultados
        int [][] C = new int [2] [2];
        //
        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 2; j++ ){

                //Soma os elementos correspondentes
                C [i][j] = A[i][j] + B[i][j];
            }
        }
        //Exibe as matrizes
        System.out.println("Matriz A");
        for(int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
            }
            System.out.println("Matriz B");
            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 2; j++){

                    System.out.print(B[i][j] + "\t");
                }

                System.out.println();
            }

            System.out.println("Matriz C");
            for(int i = 0; i < 2; i++){

                for(int j = 0; j < 2; j++){

                    System.out.print(C[i][j] + "\t");
                }
                System.out.println();
            }


    }
}