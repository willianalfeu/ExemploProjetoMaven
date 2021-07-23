package entidade.animal;

public abstract class Animal {

	private String raca;
	
	public Animal() {
	}
	
	public Animal(String raca) {
		this.raca = raca;
	}
	
	public abstract String falar();
	
	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Animal [raca=" + raca + "]";
	}

}
