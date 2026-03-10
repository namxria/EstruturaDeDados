import java.util.function.Consumer;

public class ArranjoOrdenado {
    private int[] arranjo;
    private int tamanho;
    private int capacidade;
    private boolean crescente;

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

    public void inserir(int elemento, boolean crescente){
        if(tamanho == capacidade) {
            throw new RuntimeException("O arranjo está cheio.");
        }
        int indice = 0;
        if (crescente) {
            for (indice = 0; indice < tamanho; indice++) {
                if (elemento < arranjo[indice]) {
                    break;
                }
            }
        } else {
            for (indice = 0; indice < tamanho; indice++) {
                if (elemento > arranjo[indice]) {
                    break;
                }
            }
        }
        for(int i = tamanho - 1; i >= indice; i--){
            arranjo[i+1] = arranjo[i];
        }
        arranjo[indice] = elemento;
        tamanho++;
    }

    public void excluir(int elemento){
        if(tamanho < 1) {
            throw new RuntimeException("O arranjo está vazio.");
        }
        int indice = 0;
        for(indice = 0; indice < tamanho; indice++){
            if(elemento < arranjo[indice]){
                break;
            }
        }
        if(indice == tamanho - 1){
            throw new RuntimeException("O elemento "+elemento+" não está no arranjo.");
        }
        for(int i = indice ; i < tamanho; i++){
            arranjo[i-1] = arranjo[i];
        }
        tamanho--;
    }


}
