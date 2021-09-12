package modulo;
import java.util.Date;
class Pedido {
	String data;
	String hora;
	String endereçoEntrega;
	MyLinkedList<ItemPedido> itens;
	Date datahora;
	boolean situacao;
	double valorTotal;
	Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
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

	public void setItens(MyLinkedList<ItemPedido> i) {
		itens = i;
	}

	boolean situação;
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

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
	
	public String gerarData(String date) {
		String dia = String.copyValueOf(date.toCharArray(), 8, 2);
		String ano =  String.copyValueOf(date.toCharArray(),24,4);
	    String mes =  String.copyValueOf(date.toCharArray(),4,3);
	    
	    return dia+" "+mes+" "+ano;
	    
	  
	}
	
	public String gerarHora(String date) {
		return String.copyValueOf(date.toCharArray(), 11, 8);
	}
	
	public Pedido(Cliente c,Date d,String en,boolean s) {
		this.endereçoEntrega = en;
		this.itens = new MyLinkedList<ItemPedido>();
		this.data = this.gerarData(d.toString());
		this.hora = this.gerarHora(d.toString());
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
