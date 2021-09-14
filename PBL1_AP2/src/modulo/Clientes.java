package modulo;

import java.util.Iterator;

class Clientes extends MyLinkedList<Cliente> {
	
	public Clientes() {
		super();
		super.resetIndex();
	}
	
	//remove por telefone
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

	public void add(Cliente c) {
		super.add(c);
	}
	
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
