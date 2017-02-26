package junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class TesteLista {
    
    private List<Integer> lista;
    
    public TesteLista(){
        this.lista=new ArrayList<>();
    }
    
    public void adiciona(int i){
        lista.add(i);
    }
    
    public boolean listaVazia(){
        return lista.isEmpty();
    }
    
    public int tamanho(){
        
        return lista.size();
    }
    
    public List retornaItens(){
        return lista;
    }
    
    public List<Integer> retornaLista(){
        return Collections.unmodifiableList(lista);
    }
    
}
