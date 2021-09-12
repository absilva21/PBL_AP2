package modulo;

class ItemPedido {
	int quantidade;
	String observacao;
	Pedido pedido;
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
