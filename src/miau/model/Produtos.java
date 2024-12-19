package miau.model;


//Classe abstrata
public class Produtos {

	private String cor;
	private String tamanho;
	private int tipo;
	
	public Produtos(String cor, String tamanho, int tipo) {

		this.cor = cor;
		this.tamanho = tamanho;
		this.tipo = tipo;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {

		case 1:
			tipo = "Macacao";

			break;

		case 2:
			tipo = "Vestido";

			break;

		}
		
		System.out.println("\n\n**********************************************************************");
		System.out.println("Dados do cadastro");
		System.out.println("************************************************************************");
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Modelo: " + tipo);
		
	}

	



	
	
}
