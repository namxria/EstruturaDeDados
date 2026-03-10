import java.util.Random;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        /*- Inserção -*/


        // Array crescente e inserção crescente
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            long T1 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                arranjo.inserir(i, true);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        // Array crescente e inserção decrescente
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            long T1 = System.nanoTime();
            for (int i = 100000; i > 0; i--) {
                arranjo.inserir(i, true);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        //Array crescente e inserção randômica
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            long T1 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                int num = random.nextInt(100_000);
                arranjo.inserir(num, true);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        // Array decrescente e inserção crescente
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            long T1 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                arranjo.inserir(i, false);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        // Array decrescente e inserção decrescente
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            long T1 = System.nanoTime();
            for (int i = 100000; i > 0; i--) {
                arranjo.inserir(i, false);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/


        // Array decrescente e inserção randômica
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            long T1 = System.nanoTime();
            for (int i = 100000; i > 0; i--) {
                int num = random.nextInt(100_000);
                arranjo.inserir(num, false);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        /*- Exclusão -*/

        // Array crescente e exclusão crescente
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            for (int i = 0; i < 100000; i++) {
                arranjo.inserir(i, true);
            }
            long T1 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                arranjo.excluir(i);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        // Array crescente e exclusão decrescente
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            for (int i = 100000; i > 0; i--) {
                arranjo.inserir(i, true);
            }
            long T1 = System.nanoTime();
            for (int i = 100000; i > 0; i--) {
                arranjo.excluir(i);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        //Array crescente e exclusão randômica
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            int[] arranjo_exclusao = new int[100000];
            for (int i = 0; i < 100000; i++) {
                int num = random.nextInt(100_000);
                arranjo.inserir(num, true);
                arranjo_exclusao[i] = num;
            }
            long T1 = System.nanoTime();
            for (int number : arranjo_exclusao) {
                arranjo.excluir(number);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        // Array decrescente e exclusão crescente
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            for (int i = 0; i < 100000; i++) {
                arranjo.inserir(i, false
                );
            }
            long T1 = System.nanoTime();
            for (int i = 0; i < 100000; i++) {
                arranjo.excluir(i);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/

        // Array decrescente e exclusão decrescente
        /*for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            for (int i = 100000; i > 0; i--) {
                arranjo.inserir(i, false);
            }
            long T1 = System.nanoTime();
            for (int i = 100000; i > 0; i--) {
                arranjo.excluir(i);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }*/


        // Array decrescente e exclusão randômica
        for (int j = 0; j < 100; j++) {
            ArranjoOrdenado arranjo = new ArranjoOrdenado(100000);
            int[] arranjo_exclusao = new int[100000];
            for (int i = 0; i < 100000; i++) {
                int num = random.nextInt(100_000);
                arranjo.inserir(num, false);
                arranjo_exclusao[i] = num;
            }
            long T1 = System.nanoTime();
            for (int i = arranjo_exclusao.length - 1; i >= 0; i--) {
                arranjo.excluir(arranjo_exclusao[i]);
            }
            long T2 = System.nanoTime();
            long total = T2 - T1;
            System.out.println(total);
        }
    }
}
