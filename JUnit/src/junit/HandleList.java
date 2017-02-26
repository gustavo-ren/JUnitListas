package junit;

/**
 *
 * @author Gustavo
 */
public class HandleList {
    
    
    public int retornaMaior(TesteLista lista){
      
        if(lista.listaVazia()) return 0;
        
        int maior=(int)lista.retornaItens().get(0);
        
        for(int i:lista.retornaLista()){
            if(maior < i) maior=i;
        }
        
        return maior;
         
    }
}
