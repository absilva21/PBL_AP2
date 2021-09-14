package modulo;
/*******************************************************************************
Autor: Alisson Bomfim da Silva
Componente Curricular: Algoritmos I
Concluido em: 14/10/2011
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/
import java.util.Iterator;

class Clientes extends MyLinkedList<Cliente> {
	
	/**
	 * 
	 */
	public Clientes() {
		super();
		super.resetIndex();
	}
	
	//remove por telefone
	/**
	 * @param phone
	 */
	public void removeByPhone(String phone) {
		int posi = 0;
		super.resetIndex();
		Cliente c = (Cliente) super.getIndex().getData();
		if(c.getTelefone().equals(phone)) {
			super.remove(posi);
		}
		
		while(super.getIndex()!=null) {
			c =  super.next();
			if(c.getTelefone().equals(phone)) {
				super.remove(posi);
				posi--;
				
			}
			
			posi++;
		}
		
	}

	/**
	 * @param c
	 */
	public void add(Cliente c) {
		super.add(c);
	}
	
	/**
	 * @return
	 */
	public Iterator iterator() {
		return this;
	}
	public Cliente get(int index) {
		return (Cliente) super.get(index);
	}
	
	public Cliente next() {
		return super.next();
	}
	
	public boolean hasNext() {
		return super.hasNext();
	}
	 //procura por name
	/**
	 * @param name
	 * @return
	 */
	/**
	 * @param name
	 * @return
	 */
	public Iterator searchClientebyName(String name) {
		
		MyLinkedList<Cliente> a = new MyLinkedList<Cliente>();
		super.resetIndex();
		
		Cliente c = (Cliente) super.next();
		if(c.getNome().equals(name)) {
			a.add(c);
			
		}
		
		while(super.getIndex()!=null) {
			c =  super.next();
			if(c.getNome().equals(name)) {
				a.add(c);
				
				
			}
			
			
		}
		
		return a;
	}
	///busca por telefone
	/**
	 * @param phone
	 * @return
	 */
	/**
	 * @param phone
	 * @return
	 */
	public Iterator searchClientebyPhone(String phone) {
		MyLinkedList<Cliente> a = new MyLinkedList<Cliente>();
		super.resetIndex();
		Cliente c = this.next();
		if(c.getTelefone().equals(phone)) {
			a.add(c);
			
		}
		
		while(super.getIndex()!=null) {
			c =  super.next();
			if(c.getTelefone().equals(phone)) {
				a.add(c);
				
				
			}
			
			
		}
		
		return a;
	}
}
