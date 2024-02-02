import java.util.Scanner;

public class ExerciciosLoops {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        while (true) {

            System.out.println("Digite seu nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Nome: " + nome);
            
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            System.out.println("Idade: " + idade);
        }

        System.out.println("Contínua aqui...");
     
    }

}
