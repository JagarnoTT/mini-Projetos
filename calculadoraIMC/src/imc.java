import java.util.Scanner;

public class imc {
    //Calculadora de IMC
  public static void main (String [] args){
      Scanner input = new Scanner (System.in); //Padrão para criação do Scanner
      
      System.out.println("Write your name: ");
      String name = input.nextLine(); //Comando para leitura do nome
      
      System.out.println("Digite sua idade: ");// Comando para a leitura da idade
      int age = input.nextInt(); // Comando para leitura da idade
      
      System.out.println("Write your Height: ");
      float height = input.nextFloat(); //Comando para ler o peso do usuario
      
      System.out.println("Write your weight: ");
      double weight = input.nextDouble();//Comando para ler o peso do usuario
      
      double IMC2 = weight / (height * height);
      String IMC = String.format("%.2f", IMC2);
      
      //Condição para atender diferentes tipos de usuario
      
      if (IMC2<19){
          System.out.println(name+" "+" você tem "+age+" anos de idade, você está com o IMC de "+IMC+" abaixo do ideal, busque um médico ou nutricionista");
      
    }  else if (IMC2>=19 && IMC2<=24){
          System.out.println(name+" "+" você tem "+age+" anos de idade, e seu IMC "+IMC+" está ideal");
    }  
        else if(IMC2>=25 && IMC2<=29){
            System.out.println(name+" "+" você tem "+age+" anos de idade, seu IMC "+IMC+" está acima do peso atenção");
        }   
        else{
            System.out.println(name+" "+" você tem "+age+" anos de idade, você está com sobrepeso... seu IMC é "+IMC+" procure um médico ou nutricionista urgente");
        }
      input.close(); //Fecha o Scanneer(Boas práticas)
    }
}