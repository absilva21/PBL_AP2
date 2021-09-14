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
class System {
	Clientes clientes;
	
	MyLinkedList<Cardapio> cardapio;
	Pedidos pedidosAbertos;
	Queue<Pedido> pedidosFechados;
	
	public Clientes getClientes() {
		return clientes;
	}
	/**
	 * @param clientes
	 */
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