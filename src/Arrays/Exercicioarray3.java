import java.util.Random;
/*

Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100 ) e armazene-os em um vetor.
Ao final mostre os números e seus sucessores.

 */
public class Exercicioarray3 {
    
    public static void main(String[] args) {
    
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {

    
            System.out.print(numero + " ");
            
        }

        System.out.print("\nSucessoeres dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            
            System.out.print((numero + 1) + " ");
        }
    
        System.out.print("\nAntecessoeres dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            
            System.out.print((numero - 1) + " ");
        }
    
    }
}
