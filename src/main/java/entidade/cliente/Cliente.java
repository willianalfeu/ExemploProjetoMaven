package entidade.cliente;

public abstract class Cliente {

	protected String nome;
	protected String email;

	public Cliente() {
	}

	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public abstract String getDocumento(); 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + "]";
	}

}
