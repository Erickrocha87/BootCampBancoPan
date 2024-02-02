import java.util.Scanner;
public class ExercicioLoop3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;

        do{
            numero = scan.nextInt();
            System.out.println("Numero: " + numero);

            if (numero > maior){
                maior = numero;
            }

            soma = soma + numero;
            count = count + 1;

        }while(count < 5);

        System.out.println("O maior númeo é: " + maior);
        System.out.println("A média dos números é " + (soma/count));
    }
}
