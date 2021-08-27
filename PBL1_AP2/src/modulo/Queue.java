package modulo;

class Queue {
	FirstLastList list;
	
	public Queue() {
		list = new FirstLastList();
	}
	
	public void enqueue(Link a) {
		this.list.insertLast(a);
	}
	
	public Link dequeue() {
		return this.list.deleteFirst();
	}
}
