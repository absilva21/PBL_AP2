package modulo;

class System {
	Clientes clientes;
	
	MyLinkedList<Cardapio> cardapio;
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
		return cardapio;
	}
	public void setCardapio(MyLinkedList<Cardapio> cardapi) {
		cardapio = cardapi;
	}

	public Pedidos getPedidosAbertos() {
		return pedidosAbertos;
	}
	public void setPedidosAbertos(Pedidos pedidosAbertos) {
		this.pedidosAbertos = pedidosAbertos;
	}
	public System() {
		clientes =  new Clientes();
		cardapio = new MyLinkedList<Cardapio>();
		this.pedidosAbertos = new Pedidos();
	
	}

}