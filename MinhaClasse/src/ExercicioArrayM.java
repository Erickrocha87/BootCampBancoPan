import java.util.Random;

/**
 * ExercicioArrayM
 */
public class ExercicioArrayM {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] Multi = new int[4][4];

        for (int i = 0; i < Multi.length; i++){
            for(int c = 0; c < Multi[i].length; c++){
                Multi[i][c] = random.nextInt(9);
            }
        }

        for (int[] linha : Multi) {
            for (int coluna : linha) {

                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    } 
}