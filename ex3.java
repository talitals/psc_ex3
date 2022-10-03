import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = console.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = console.nextInt();
    
        int soma = numero1 + numero2;
    
        System.out.println("O resultado da soma é: " + soma);
    
        console.close();
        }
}
