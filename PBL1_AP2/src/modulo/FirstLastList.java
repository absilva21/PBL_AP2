package modulo;
import java.util.Iterator;


final class FirstLastList<T> implements Iterator {
	private Link first;
	private Link last;
	private Link index;
	int size;
	
	public Link getIndex() {
		return index;
	}

	public void setIndex(Link a) {
		index = a;
	}

	public boolean hasNext() {
		return this.index.getProximo()!=null;
	}
	
	public void resetIndex() {
		this.index = this.first;
	}
	
	public Link next() {
		Link data = this.index;
		this.index = index.getProximo();
		return data;
	}
	
	public T get(int index) {
		Link current = this.first;
		int cont = 0;
		while(cont != index) {
			if(current == null) {
				break;
			}
			current = current.getProximo();
			cont++;
		}
		return(T) current.getData();
	}
	
	public void Remove(int index) {
		Link current = this.first;
		Link temp = null;
		int cont = 0;
		while(cont != index) {
			if(current == null) {
				break;
			}
			current = current.getProximo();
			cont++;
		}
		
		this.first.setProximo(this.first);
		this.first= current;
		current = this.first;
		temp = current;
		this.first = current.getProximo();
		
	}
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
		size++;
	
		
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
