package entidade.animal;

public class Gato extends Animal{

	public Gato() {
		super();
	}

	public Gato(String raca) {
		super(raca);
	}

	@Override
	public String falar() {
		return "miau";
	}
	
}
