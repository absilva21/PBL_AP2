package modulo;

class Link {
	private Object data;
	private Link proximo;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Link getProximo() {
		return proximo;
	}
	public void setProximo(Link proximo) {
		this.proximo = proximo;
	} 
	
	public Link(Object data){
		this.data = data;
	}
	
}

