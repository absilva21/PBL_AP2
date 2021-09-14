package modulo;
import java.util.Date;
/**
 * @author alisson
 *
 */
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
class Pedido {
	String endereçoEntrega;
	MyLinkedList<ItemPedido> itens;
	Date datahora;
	boolean situacao;
	double valorTotal;
	Cliente cliente;
	boolean situação;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * @return
	 */
	public double geraValor(){
		double valor = 0;
		this.itens.resetIndex();
		ItemPedido item = (ItemPedido)this.itens.getIndex().getData();
		valor +=item.getOpcaoMenu().getValor()*item.getQuantidade();
		while(this.itens.hasNext()) {
			itens.next();
			item = (ItemPedido)itens.index.getData();
			valor +=item.getOpcaoMenu().getValor()*item.getQuantidade();
		}
		return valor;
	}

	public double getValorTotal() {
		this.valorTotal = this.geraValor();
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataHora() {
		return datahora;
	}

	public void setDataHora(Date datahora) {
		this.datahora = datahora;
	}

	public MyLinkedList<ItemPedido> getItens() {
		return itens;
	}

	/**
	 * @param i
	 */
	public void setItens(MyLinkedList<ItemPedido> i) {
		itens = i; }

	
	
	public String getEndereçoEntrega() {
		return endereçoEntrega;
	}

	public void setEndereçoEntrega(String endereçoEntrega) {
		this.endereçoEntrega = endereçoEntrega;
	}

	public boolean isSituação() {
		return situação;
	}

	public void setSituação(boolean situação) {
		this.situação = situação;
	}
	
	public void setFechado() {
		this.situacao= false;
	}
	
	
	public Pedido(Cliente c,Date d,String en,boolean s) {
		this.endereçoEntrega = en;
		this.itens = new MyLinkedList<ItemPedido>();
		this.datahora = d;
		this.situacao = s;
		this.cliente =c;
	}

	public Date getDatahora() {
		return datahora;
	}

	public void setDatahora(Date datahora) {
		this.datahora = datahora;
	}

	public boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
}
