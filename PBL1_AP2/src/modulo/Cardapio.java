package modulo;

class Cardapio {
	String decricao;
	double valor;
	public String getDecricao() {
		return decricao;
	}
	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Cardapio(String des,double val) {
		this.decricao = des;
		this.valor = val;
	}
}
