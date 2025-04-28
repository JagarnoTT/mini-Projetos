import java.util.Scanner;

public class imcClass{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String name = readName(scanner);
        int age = readAge(scanner);
        float height = readHeight(scanner);
        double weight = readWeight(scanner);
        
        
        double imc = calculateIMC(weight, height);

        String classify = interpret(imc);
        
        showResults(name, age, imc, classify);
    
        scanner.close();
    }
    
    public static String readName(Scanner scanner){
        System.out.println("Qual seu nome? ");
        return scanner.nextLine();
    
    }
    public static int readAge(Scanner scanner){
        System.out.println("Qual sua idade: ");
        int age =  scanner.nextInt();
        scanner.nextLine();
        return age;
    }
    public static float readHeight(Scanner scanner){
        System.out.println("Digite Sua altura: ");
        return scanner.nextFloat();
    }
    public static double readWeight(Scanner scanner){
        System.out.println("Digite seu peso: ");
        return scanner.nextDouble();
    }
    public static double calculateIMC(double weight, double height){
        return weight / (height * height);
    }
    public static String interpret(double imc){
        if (imc < 19){
            return("Peso abaixo do ideal!");
        }
        else if(imc >=19 && imc <= 24.5){
            return("Peso ideal!");
        }
        else if(imc > 24.5 && imc <= 30){
            return("Peso acima do ideal!");
        }
        else{
            return("Peso ultrapassou niveis seguros!");
        }
    }
    public static void showResults(String name, int age, double imc, String classify){
        System.out.println("------------Results----------------");
        System.out.println("Nome: "+name);
        System.out.println("Idade: "+age);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: "+classify);
    
        }
    }