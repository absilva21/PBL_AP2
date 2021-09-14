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
class Queue<T> {
	FirstLastList<T> list;
	s
	/**
	 * 
	 */
	public Queue() {
		list = new FirstLastList<T>();
	}
	
	public void enqueue(Object a) {
		this.list.insertLast(a);
	}
	
	public T get(int index) {
		Object a = this.list.get(index);
		return (T) a;
	}
	
	public T peek() {
		return (T) this.list.getFirst().getData();
	}
	
	public T last() {
		return (T) this.list.getLast().getData();
	}
	
	public Link dequeue() {
		return this.list.deleteFirst();
	}
	
	public int size() {
		return this.list.getSize();
	}
}
