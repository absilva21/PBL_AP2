package modulo;

import java.util.Iterator;

class Clientes extends MyLinkedList<Cliente> {
	
	public Clientes() {
		super();
		super.resetIndex();
	}
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
}
