package modulo;

class LinkList {
	private Link inicio;
	int size =0;
	public Link getInicio() {
		return inicio;
	}

	public void setInicio(Link inicio) {
		this.inicio = inicio;
	}
	
	public boolean isEmpty() {
		return inicio == null;
	}
	
	public void inserir(Object data) {
		Link novo = new Link(data);
		Link aux;
		if(this.isEmpty()) {
			this.inicio = novo;
		}else {
			aux = this.inicio;
			this.inicio = novo;
			this.inicio.setProximo(aux);
		}
		size++;
		
	}
	
	public Link buscaNo(int index) {
		Link current = this.inicio;
		int cont = -1;
		while(cont != index) {
			if(current == null) {
				break;
			}
			current = current.getProximo();
			cont++;
		}
		return current;
	}
	
	public void inserirFinal(Object data) {
		Link current = this.inicio;
		Link anterior = null;
		Link novo = new Link(data);
		if(this.isEmpty()) {
			this.inicio = novo;
		}else {
			while(current!=null) {
				anterior = current;
				current = current.getProximo();
				
			}
			anterior.setProximo(novo);
			novo.setProximo(current);
			size++;
		}
	}
	public Link removerInicio() {
		Link current = null;
		Link aux = null;
		if(!this.isEmpty()){
			current = this.inicio;
			aux = current;
			this.inicio = current.getProximo();
			
		}
		return aux;
		
	}
	public void show() {
		Link current = this.inicio;
		if(this.isEmpty()) {
			System.out.println("A lista está vazia");
		}else {
			while(current!=null) {
				System.out.println(current.getData());
				current = current.getProximo();
			}
		}
	}
}
