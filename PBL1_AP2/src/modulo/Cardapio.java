package modulo;

class Cardapio {
	String decricao;
	double valor;
	public String getDescricao() {
		return decricao;
	}
	public void setDescricao(String decricao) {
		this.decricao = decricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Cardapio(String des,double val) {
		this.decricao = des;
		this.valor = val;
	}
	
	public boolean equals(Cardapio c) {
		int check=0;
		if(c.getValor()==this.valor){
			check++;
		}
		if(c.getDescricao().equals(decricao)) {
			check++;
		}
		
		
		return check == 2;
	}
}
