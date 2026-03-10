import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArranjoOrdenadoTest {


    @Test
    public void inserirNumArranjoCheio(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(2);
        try{
            arranjo.inserir(10, true);
            arranjo.inserir(10, true);
            arranjo.inserir(10, true);
            Assertions.fail("Deve lançar uma exceção quando o ArranjoOrdenado estiver cheio.");
        }catch (RuntimeException ignored){}
    }

    @Test
    public void inserirNumArranjoVazio(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(9, true);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("9",builder.toString());
    }

    @Test
    public void inserirDoisElementosArranjo(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4, true);
        arranjo.inserir(9, true);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("49",builder.toString());
    }

    @Test
    public void inserirNoMeioDeDoisElementosArranjo(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4, true);
        arranjo.inserir(9, true);
        arranjo.inserir(5, true);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("459",builder.toString());
    }

    @Test
    public void inserirNoComecoArranjo(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4, true);
        arranjo.inserir(9, true);
        arranjo.inserir(5, true);
        arranjo.inserir(1, true);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("1459",builder.toString());
    }

    @Test
    public void excluirUmElementoNoMeioDoArranjo(){
        ArranjoOrdenado arranjo = new ArranjoOrdenado(5);
        arranjo.inserir(4, true);
        arranjo.inserir(9, true);
        arranjo.inserir(5, true);
        arranjo.inserir(1, true);
        arranjo.excluir(4);
        StringBuilder builder = new StringBuilder();
        arranjo.percorrer(i -> builder.append(i));
        Assertions.assertEquals("159",builder.toString());
    }

}
