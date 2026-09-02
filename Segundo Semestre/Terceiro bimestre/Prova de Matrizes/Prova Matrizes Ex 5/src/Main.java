//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int num = 3 ;
        int [][] A = {

                {2, 4},
                {6, 8}
        };

        int [][] C = new int[2][2];
        for (int i = 0; i < 2; i++){

            for (int j = 0; j < 2; j++){

                C[i][j] = num * A[i][j];
            }
        }

        System.out.println("Matriz C");
        for (int i = 0; i < 2; i++){

            for(int j = 0; j < 2; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}