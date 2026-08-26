public class Main {

    public static void main(String[] args){

        //Declaração das matrizes
        int [][] A = {

                {3, 1, 6},
                {3, 6, 7},
                {4, 3, 1}
        };

        int [][] B = {

                {1, 5, 4},
                {2, 1, 6},
                {9, 1, 3}
        };

        int [][] C = new int[3][3];

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                C[i][j] = A[i][j] + B[i][j];
            }
        }

        //Exibe as Matrizes através do terminal
        System.out.println("Matriz A");
        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz C");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

    }
}