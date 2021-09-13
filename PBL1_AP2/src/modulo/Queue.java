package modulo;

class Queue<T> {
	FirstLastList<T> list;
	
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
