package modulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Cardapiotest {
	private Cardapio m1;
	@BeforeEach
	void setUp() throws Exception {
		 m1 = new Cardapio("Prato1", 10.00);
	}

	@Test
	void testBasic() {
		assertEquals("Prato1", m1.getDescricao());
        assertEquals(10.00, m1.getValor(),.0001);

        m1.setDescricao("Lanche1");
        m1.setValor(5.55);
        assertEquals("Lanche1", m1.getDescricao());
        assertEquals(5.55, m1.getValor(),.0001);
	}
	
	@Test
    public void testEquals() {
        Cardapio temp = new Cardapio("Prato1", 9.00);
        assertFalse(temp.equals(m1));

        temp.setValor(10.0);
        assertTrue(temp.equals(m1));

        temp = new Cardapio("Lanche1", 10.00);
        assertFalse(temp.equals(m1));
    }

}
