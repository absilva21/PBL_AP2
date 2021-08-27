package modulo;

class System {
	LinkList clientes;
	LinkList Cardapio;
	Queue Pedidos;
	public Queue getPedidos() {
		return Pedidos;
	}
	public void setPedidos(Queue pedidos) {
		Pedidos = pedidos;
	}
	public LinkList getClientes() {
		return clientes;
	}
	public void setClientes(LinkList clientes) {
		this.clientes = clientes;
	}
	public LinkList getCardapio() {
		return Cardapio;
	}
	public void setCardapio(LinkList cardapio) {
		Cardapio = cardapio;
	}
	
	
}
