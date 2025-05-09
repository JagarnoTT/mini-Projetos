import java.util.Scanner;

public class SomandoComfor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= num; i++){
            soma += i;

        if (soma >= 15){
            break;
        }
    }
        System.out.println("O numero que você digitou é: " + num + " se o mesmo for somado, receberemos o valor de " + soma);

        sc.close();
    }
}