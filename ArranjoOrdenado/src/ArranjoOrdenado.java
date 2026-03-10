import java.util.function.Consumer;

public class ArranjoOrdenado {
    private int[] arranjo;
    private int tamanho;
    private int capacidade;

    public ArranjoOrdenado(int capacidade) {
        this.capacidade = capacidade;
        arranjo = new int[capacidade];
        tamanho = 0;
    }

    public void percorrer(Consumer<Integer> consumer) {
        for(int i =0; i < tamanho; i++) {
            consumer.accept(arranjo[i]);
        }
    }

    public void inserir(int num, boolean crescente){
        if(tamanho == capacidade) {
            throw new RuntimeException("O arranjo está cheio.");
        }

        int i = 0;
        if (crescente) {
            for (i = 0; i < tamanho; i++) {
                if (num < arranjo[i]) {
                    break;
                }
            }
        } else {
            for (i = 0; i < tamanho; i++) {
                if (num > arranjo[i]) {
                    break;
                }
            }
        }
        for(int j = tamanho - 1; j >= i; j--){
            arranjo[j +1] = arranjo[j];
        }
        arranjo[i] = num;
        tamanho++;
    }

    public void excluir(int elemento){
        if(tamanho < 1) {
            throw new RuntimeException("O arranjo está vazio.");
        }
        boolean decrescente = (tamanho > 1) && (arranjo[0] > arranjo[tamanho - 1]);

        int indice = -1;
        for(int i = 0; i < tamanho; i++){
            if(arranjo[i] == elemento){
                indice = i;
                break;
            }
            if (decrescente && arranjo[i] < elemento) break;
            if (!decrescente && arranjo[i] > elemento) break;
        }
        if(indice == -1){
            throw new RuntimeException("O elemento "+elemento+" não está no arranjo.");
        }
        for(int i = indice ; i < tamanho-1; i++){
            arranjo[i] = arranjo[i+1];
        }

        tamanho--;
    }


}
