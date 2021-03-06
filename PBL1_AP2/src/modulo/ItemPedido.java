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
class ItemPedido {
	int quantidade;
	String observacao;
	Pedido pedido;
	/**
	 * 
	 */
	Cardapio OpcaoMenu;
	public Cardapio getOpcaoMenu() {
		return OpcaoMenu;
	}

	public void setOpcaoMenu(Cardapio opcaoMenu) {
		OpcaoMenu = opcaoMenu;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
		this.pedido.itens.add(this);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	

	
	public ItemPedido(Cardapio c, int quan, String obs) {
		this.OpcaoMenu = c;
		this.quantidade = quan;
		this.observacao = obs;
		
	}
}
