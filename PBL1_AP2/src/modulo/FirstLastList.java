package modulo;

final class FirstLastList {
	private Link first;
	private Link last;
	int size;
	public Link getFirst() {
		return first;
	}
	public void setFirst(Link first) {
		this.first = first;
	}
	public Link getLast() {
		return last;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setLast(Link last) {
		this.last = last;
	}
	
	public boolean isEmpity() {
		return first == null;
	}
	
	public void insertfirst(Object a) {
		if(isEmpity()) {
			Link c = new Link(a);
			this.first = c;
			size++;
		}
	}
	
	public void insertLast(Object a) {
		
		Link c = new Link(a);
		if (this.last == null) {
			this.last = c;
		}else {
			this.last.setProximo(c);
			this.last = c;
		}
	
		
	}
	
	
	public Link deleteFirst() {
		Link current = null;
		Link aux = null;
		if(!this.isEmpity()){
			current = this.first;
			aux = current;
			this.first = current.getProximo();
			
		}
		size--;
		return aux;
		
	}
	
	
}
