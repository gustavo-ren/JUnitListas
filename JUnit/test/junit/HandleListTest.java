package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class HandleListTest {
    
    public HandleListTest() {
    }
    
    private HandleList item;
    private TesteLista lista;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        lista=new TesteLista();
        item=new HandleList();
    }
    
    @After
    public void tearDown() {
        lista=null;
    }

    @Test
        public void deveRetornar0() {
        
        int retorno=item.retornaMaior(lista);
        
        assertEquals(0, retorno);
    }
    
    @Test
    public void retornaUnicoElemento(){
        lista.adiciona(2);
        
        assertEquals(2, item.retornaMaior(lista));
    }
    
    @Test
    public void retornaMaiorElemento(){
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(5);
        lista.adiciona(4);
        lista.adiciona(3);
        
        assertEquals(5, item.retornaMaior(lista));
    }
    
   
    
}
