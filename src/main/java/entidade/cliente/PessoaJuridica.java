package entidade.cliente;

public class PessoaJuridica extends Cliente{

	private String cnpj;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String email, String cnpj) {
		super(nome, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [nome=" + nome + ", email=" + email + ", cnpj=" + cnpj + "]";
	}

	@Override
	public String getDocumento() {
		return cnpj;
	}

	
}
