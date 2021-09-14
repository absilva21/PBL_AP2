package modulo;
import java.util.Iterator;
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

/**
 * @author alisson
 *
 * @param <T>
 */
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
	
	/**
	 * @param index
	 * @return
	 */
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
	
	/**
	 * @param index
	 */
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
	/**
	 * @return
	 */
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
	
	/**
	 * @param a
	 */
	public void insertfirst(Object a) {
		if(isEmpity()) {
			Link c = new Link(a);
			this.first = c;
			size++;
		}
	}
	
	/**
	 * @param a
	 */
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
	
	
	/**
	 * @return
	 */
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
