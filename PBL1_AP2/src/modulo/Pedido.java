package modulo;
import java.util.Date;
class Pedido {
	String data;
	String hora;
	String endereçoEntrega;
	MyLinkedList Itens;
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

	public double getValorTotal() {
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

	public MyLinkedList getItens() {
		return Itens;
	}

	public void setItens(MyLinkedList itens) {
		Itens = itens;
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
		this.Itens = new MyLinkedList();
		this.data = this.gerarData(d.toString());
		this.hora = this.gerarHora(d.toString());
		this.datahora = d;
		this.situacao = s;
	

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
