package modulo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

class ClienteTeste {
	private ItemPedido i1;
	private Cardapio m1;
	private Cliente c1;
	private Pedido p1;
	
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cliente("Fulano", "000-9090-0000","fulano@email.com");

        m1 = new Cardapio("Prato1", 10.00);

        p1 = new Pedido(c1, new Date(1553303046),"Rua X", true);

        i1 = new ItemPedido(m1, 2, "sem ingrediente1");
        
	}

	@Test
	public void testBasic() {
		c1 = new Cliente("Fulano", "000-9090-0000","fulano@email.com");

        m1 = new Cardapio("Prato1", 10.00);

        p1 = new Pedido(c1, new Date(1553303046),"Rua X", true);

        i1 = new ItemPedido(m1, 2, "sem ingrediente1");
		
		assertEquals("Fulano", c1.getNome());
        assertEquals("000-9090-0000", c1.getTelefone());
        assertFalse(c1.getTelefone().equals("000-9080-0000"));
        assertEquals("fulano@email.com", c1.getEmail());
	}
	
	@Test
	public void testEquals() {
		c1 = new Cliente("Fulano", "000-9090-0000","fulano@email.com");

        m1 = new Cardapio("Prato1", 10.00);

        p1 = new Pedido(c1, new Date(1553303046),"Rua X", true);

        i1 = new ItemPedido(m1, 2, "sem ingrediente1");
        
		
		Cliente temp = new Cliente("Fulano", "000-9090-0000","fulano@email.com");
        assertTrue(temp.equals(c1));
        
        temp = new Cliente("Beltrano", "099-9090-0000","beltrano@email.com");
        assertFalse(temp.equals(c1));

        temp = new Cliente("Fulano", "099-9090-0000","fulano2@email.com");
        assertFalse(temp.equals(c1));
	}

}
