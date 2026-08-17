public class Main{

    public static void main(String[] args){

        int [][] A = {

                {2, 4, 6, 8, 10},
                {12, 14, 16, 18, 20}
        };

        int [][] B = {

                {1, 3, 5, 7, 9},
                {11, 13, 15, 17, 19}
        };

        int [][] C = new int[5][5];
        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 5; j++){

                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matriz A");
        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 5; j++){

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B");
        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 5; j++){

                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz C");
        for(int i = 0; i <  2; i++){

            for(int j = 0; j < 5; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}