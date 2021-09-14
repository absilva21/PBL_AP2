package modulo;

class Clientes extends MyLinkedList<Cliente> {
	
	public Clientes() {
		super();
	}
	public void removeByPhone(String phone) {
		int posi = 0;
		super.resetIndex();
		Cliente c = (Cliente) super.getIndex().getData();
		if(c.getTelefone().equals(phone)) {
			super.remove(posi);
		}
		
		while(super.getIndex()!=null) {
			Link a = super.next();
			c = (Cliente) a.getData();
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
	
	public Cliente get(int index) {
		return (Cliente) super.get(index);
	}
}
