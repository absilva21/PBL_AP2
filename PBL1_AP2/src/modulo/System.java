package modulo;

class System {
	MyLinkedList clientes;
	MyLinkedList Cardapio;
	Queue Pedidos;
	public MyLinkedList getClientes() {
		return clientes;
	}
	public void setClientes(MyLinkedList clientes) {
		this.clientes = clientes;
	}
	public MyLinkedList getCardapio() {
		return Cardapio;
	}
	public void setCardapio(MyLinkedList cardapio) {
		Cardapio = cardapio;
	}
	public Queue getPedidos() {
		return Pedidos;
	}
	public void setPedidos(Queue pedidos) {
		Pedidos = pedidos;
	}

}