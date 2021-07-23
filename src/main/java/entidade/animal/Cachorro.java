package entidade.animal;

public class Cachorro extends Animal{

	public Cachorro() {
		super();
	}

	public Cachorro(String raca) {
		super(raca);
	}

	@Override
	public String falar() {
		return "au au";
	}
	
	
}
