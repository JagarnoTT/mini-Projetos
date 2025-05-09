public class whileSintaxe{
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0){
            double valordoce = valorAleatório();

            if (valordoce > mesada){
                valordoce = mesada;
            }

            System.out.printf("Doce R$ %.2f adicionado ao carrinho!\n", valordoce);

            mesada -= valordoce;
        }
        }
        private static double valorAleatório() {
            return Math.random() * 100;
    }
}
