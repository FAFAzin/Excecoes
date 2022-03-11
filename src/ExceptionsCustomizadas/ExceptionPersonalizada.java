package ExceptionsCustomizadas;

public class ExceptionPersonalizada {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominnador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominnador.length; i++) {

            if (numerador[i] %2 != 0) throw new
            int resultado = numerador[i] / denominnador[i];
            System.out.println(resultado);


        }
        System.out.println("O programa continue...");

    }
}
