package miau.model;

public class MiauRoupas extends Miaulandia {

	private String tamanho;
	
	public MiauRoupas(int cpf, int telefone, String nome, String email, String tamanho) {
		super(cpf, telefone, nome, email);
		
		this.tamanho = tamanho;
	}
	
	public MiauRoupas(int cpf, int telefone, String nome, String email) {
		super(cpf, telefone, nome, email);
		
		this.tamanho = "";
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	
	}
		
	public void visualizar() {
		super.visualizar(); // refrencia da classe principal
		System.out.println("Tamanho: " + this.tamanho);

	}



	
	
}
