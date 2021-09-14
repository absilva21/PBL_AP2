package modulo;

class Pedidos extends Queue<Pedido> {
	
	public Pedidos() {
		super();
	}
//tira o proximo pedido da fila
	public void setNexttoPedidoFechado() {
		super.dequeue();
	}
}
