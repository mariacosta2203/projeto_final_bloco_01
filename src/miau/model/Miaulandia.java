package miau.model;


//Classe abstrata
public class Miaulandia {

	private int cpf; 
	private int telefone; 
	private String email; 
	private String nome;
	private int tamanho;
	
	public Miaulandia(int cpf, int telefone, String nome, String email) {

		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;

	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void visualizar() {

		String tamanho = "";

		switch (this.tamanho) {

		case 1:
			tamanho = "Roupas";

			break;
		}
		
		System.out.println("\n\n**********************************************************************");
		System.out.println("Dados do cadastro");
		System.out.println("************************************************************************");
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Tamanho do gato: " + tamanho);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Cpf: " + this.cpf);
		
	}
	
}
