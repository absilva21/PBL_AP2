package modulo;

class System {

	MyLinkedList<Cliente> clientes;
	MyLinkedList<Cardapio> Cardapio;
	Queue<Pedido> pedidosAbertos;
	Queue<Pedido> pedidosFechados;
	
	
	public Queue<Pedido> getPedidosAbertos() {
		return pedidosAbertos;
	}
	public void setPedidosAbertos(Queue<Pedido> pedidosAbertos) {
		this.pedidosAbertos = pedidosAbertos;
	}
	public Queue<Pedido> getPedidosFechados() {
		return pedidosFechados;
	}
	public void setPedidosFechados(Queue<Pedido> pedidosFechados) {
		this.pedidosFechados = pedidosFechados;
	}
	public MyLinkedList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(MyLinkedList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public MyLinkedList<Cardapio> getCardapio() {
		return Cardapio;
	}
	public void setCardapio(MyLinkedList<Cardapio> cardapio) {
		Cardapio = cardapio;
	}

	public System() {
		clientes =  new MyLinkedList<Cliente>();
	}

}