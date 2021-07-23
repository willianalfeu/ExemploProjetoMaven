package entidade.cliente;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String email, String cpf) {
		super(nome, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [nome=" + nome + ", email=" + email + ", cpf=" + cpf + "]";
	}

	@Override
	public String getDocumento() {
		return cpf;
	}

}
