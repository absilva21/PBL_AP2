package modulo;

class ItemPedido {
	int quantidade;
	String observacao;
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

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	Cardapio cardapio;
	
	public ItemPedido(Cardapio c, int quan, String obs) {
		this.cardapio = c;
		this.quantidade = quan;
		this.observacao = obs;
	}
}
