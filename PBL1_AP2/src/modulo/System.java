package modulo;

class System {
	MyLinkList clientes;
	MyLinkList Cardapio;
	Queue Pedidos;
	public MyLinkList getClientes() {
		return clientes;
	}
	public void setClientes(MyLinkList clientes) {
		this.clientes = clientes;
	}
	public MyLinkList getCardapio() {
		return Cardapio;
	}
	public void setCardapio(MyLinkList cardapio) {
		Cardapio = cardapio;
	}
	public Queue getPedidos() {
		return Pedidos;
	}
	public void setPedidos(Queue pedidos) {
		Pedidos = pedidos;
	}
}