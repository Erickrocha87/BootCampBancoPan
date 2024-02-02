import java.util.Scanner;
//Execicio de fatorial
public class ExercicioLoop6 {
    
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 

    System.out.println("Escolha o número a se feito o fatorial: ");
    int fatorial = scan.nextInt();
    int multiplicacao = 1;

    for(int i = fatorial; i > 1; i--){

        multiplicacao = multiplicacao * i;

        System.out.println(multiplicacao);

        }
    System.out.print("O fatorial de " + fatorial + " é " + fatorial + " ! = " + multiplicacao );
    }
}