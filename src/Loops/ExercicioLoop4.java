import java.util.Scanner;

public class ExercicioLoop4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int qtdPares = 0;
        int qtdImpares = 0;
        System.out.println("Quantidade de númeos: ");
        quantidadeNumeros = scan.nextInt();
        int count = 0;

        do{
            System.out.println("Número:" );
            numero = scan.nextInt();
            
            if (numero % 2 == 0){

                qtdPares++;
            }
            else qtdImpares++;
            count ++;

        }while(count < quantidadeNumeros);

        System.out.println("A quantidade de númeos pares é: " + qtdPares + "E a quantidade de número impares é: " + qtdImpares);
        
    }
}
