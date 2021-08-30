package modulo;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class testes {


	private System sys;
    private Cliente c1, c2, c3;
    private Cardapio m1, m2, m3;
    private Pedido p1, p2, p3;
	 @Before
	 public void setUp() throws Exception {

		 //c1 = new Cliente("Fulano", "000-9090-0000","fulano@email.com");
	    

	    }
	 	
	 
	 /*@Test
	 public void testBasic() {
		 c1 = new Cliente("Fulano", "000-9090-0000","fulano@email.com");
		 assertEquals("Fulano", c1.getNome());
	     assertFalse(c1.getTelefone().equals("000-9080-0000"));
	     assertEquals("fulano@email.com", c1.getEmail());
	 }*/
	 
	 @Test
	 public void testAddCliente() {
		 	c1 = new Cliente("Fulano", "000-9090-0000","fulano@email.com");
	        c2 = new Cliente("Beltrano", "000-9080-0000","beltrano@email.com");
	        c3 = new Cliente("Cicrano", "000-9080-0000","cicrano@email.com");
	        sys = new System();
	        sys.getClientes().add(c1);
	        sys.getClientes().add(c2);
	        sys.getClientes().add(c3);
	        assertEquals(sys.getClientes().size(),3);
	        
	        assertEquals(c1, sys.getClientes().get(0));
	        assertEquals(c2, sys.getClientes().get(1));
	        assertEquals(c3, sys.getClientes().get(2));

	 }
}
