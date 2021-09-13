package modulo;

class Clientes extends MyLinkedList<Cliente> {
	
	public Clientes() {
		super();
	}
	public void removeByPhone(String phone) {
		int posi = 0;
		super.resetIndex();
		Cliente c = (Cliente) super.getIndex().getData();
		while(!c.getTelefone().equals(phone)&&super.getIndex()!=null) {
			Link a = super.next();
			c = (Cliente) a.getData();
			posi++;
		}
		if(c.getTelefone().equals(phone)) {
			this.remove(posi);
		}
		
	}

	public void add(Cliente c) {
		super.add(c);
	}
	
	public Cliente get(int index) {
		return (Cliente) super.get(index);
	}
}
