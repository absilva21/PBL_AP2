package modulo;

class Cardapio {
	String decricao;
	float valor;
	public String getDecricao() {
		return decricao;
	}
	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Cardapio(String des,float val) {
		this.decricao = des;
		this.valor = val;
	}
}
