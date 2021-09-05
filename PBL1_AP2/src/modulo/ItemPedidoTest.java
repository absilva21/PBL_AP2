package modulo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.Date;
public class ItemPedidoTest {
	private ItemPedido i1;
    private Cardapio m1;
    private Cliente c1;
	private Pedido p1;
	@Before
	public void setUp() throws Exception {
        c1 = new Cliente("Fulano", "000-9090-0000","fulano@email.com");

        m1 = new Cardapio("Prato1", 10.00);

        p1 = new Pedido(c1, new Date(1553303046),"Rua X", true);

        i1 = new ItemPedido(m1, 2, "sem ingrediente1");
        i1.setPedido(p1);
	    
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
