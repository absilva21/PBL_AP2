package modulo;

class System {
	Clientes clientes;
	
	MyLinkedList<Cardapio> Cardapio;
	Pedidos pedidosAbertos;
	Queue<Pedido> pedidosFechados;
	
	public Clientes getClientes() {
		return clientes;
	}
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public Queue<Pedido> getPedidosFechados() {
		return pedidosFechados;
	}
	public void setPedidosFechados(Queue<Pedido> pedidosFechados) {
		this.pedidosFechados = pedidosFechados;
	}
	
	
	public MyLinkedList<Cardapio> getCardapio() {
		return Cardapio;
	}
	public void setCardapio(MyLinkedList<Cardapio> cardapio) {
		Cardapio = cardapio;
	}

	public Pedidos getPedidosAbertos() {
		return pedidosAbertos;
	}
	public void setPedidosAbertos(Pedidos pedidosAbertos) {
		this.pedidosAbertos = pedidosAbertos;
	}
	public System() {
		clientes =  new Clientes();
		this.pedidosAbertos = new Pedidos();
	
	}

}