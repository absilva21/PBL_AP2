package modulo;

class Cliente {
	String nome;
	String telefone;
	String email;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente(String name, String tel, String em) {
		this.nome = name;
		this.telefone = tel;
		this.email = em;
	}
	
	/*public boolean equals (Cliente c) {
		int check=0;
		if(c.getNome().equals(nome)) {
			check++;
		}
		if(c.getEmail().equals(email)) {
			check++;
		}
		if(c.getTelefone().equals(telefone)) {
			check++;
		}
		
		return check == 3;
	}*/
}
