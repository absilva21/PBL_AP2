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
class Pedidos extends Queue<Pedido> {
	
	/**
	 * 
	 */
	public Pedidos() {
		super();
	}
//tira o proximo pedido da fila
	/**
	 * 
	 */
	public void setNexttoPedidoFechado() {
		super.dequeue();
	}
}
