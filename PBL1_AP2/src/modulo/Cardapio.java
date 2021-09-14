package modulo;
/*******************************************************************************
Autor: Alisson Bomfim da silva
Componente Curricular: Algoritmos I
Concluido em: 14/10/2011
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/
class Cardapio {
	String decricao;
	double valor;
	/**
	 * @return
	 */
	public String getDescricao() {
		return decricao;
	}
	/**
	 * @param decricao
	 */
	public void setDescricao(String decricao) {
		this.decricao = decricao;
	}
	/**
	 * @return
	 */
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * @param des
	 * @param val
	 */
	public Cardapio(String des,double val) {
		this.decricao = des;
		this.valor = val;
	}
	
	/**
	 * @param c
	 * @return
	 */
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
