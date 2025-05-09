import java.util.Scanner;

public class SomandoComfor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        int soma = 0;

        for (int i = 0; i <= num; i++){
            soma += i;
        }
        System.out.println("O numero que você digitou é: " + num + " se o mesmo for somado, receberemos o valor de " + soma);
    }
}