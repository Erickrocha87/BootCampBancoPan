import java.util.Scanner;


public class ExercicioLoop5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o número que deseja fazer a tábuada: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de + " + numero);

        for(int i = 0; i < 10; i++){

            System.out.println(numero + " x " + i + " = " + (numero * i ));

        };

    }
}
