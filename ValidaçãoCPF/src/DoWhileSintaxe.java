import java.util.Random;

public class DoWhileSintaxe {
    public static void main(String[] args){
        System.out.println("Discando...");
        
        do{
            System.out.println("Telefone tocando...");
        }
        while (tocando());

        System.out.println("Alo!!");
    }
    private static boolean tocando(){
        Boolean num = new Random().nextInt(6) == 1;
        System.out.println("Atendeu" + num);
        return ! num;
    }
}
