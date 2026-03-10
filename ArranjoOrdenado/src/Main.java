import java.util.Random;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        //Array decrescente, inserção aletória
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            long T1 = System.nanoTime();
            for (int i = 100000; i > 0; i--) {
                int num = random.nextInt(100_000);
                arranjo.inserir(num, false);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);

        }
    }
}