import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.Locale;

/*public class AboutMe {
    
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo" + nome + "" + sobrenome);
        System.out.println("Minha idade é " + idade);
        System.out.println("Tenho" + altura + "de altura" );
    }
}
*/

public class AboutMe{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me conte mais sobre você");

        System.out.println("Me fale seu nome: ");
        String nome = scanner.next();

        System.out.println("" + nome + "Qual é seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Perfeito, agora, me diga qual é a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Certo para finalizarmos, qual sua altura: ");
        Double altura = scanner.nextDouble();
}
}