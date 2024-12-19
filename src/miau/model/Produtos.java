package miau.model;


//Classe abstrata
public class Produtos {

	private String cor;
	private String tamanho;
	private int modelo;
	
	public Produtos(String cor, String tamanho, int modelo) {

		this.cor = cor;
		this.tamanho = tamanho;
		this.modelo = modelo;

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
	
	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	
	
	public void visualizar() {

		String modelo = "";

		switch (this.modelo) {

		case 1:
			modelo = "Macacao";

			break;

		case 2:
			modelo= "Vestido";

			break;

		}
		
		System.out.println("\n\n**********************************************************************");
		System.out.println("Dados do cadastro");
		System.out.println("************************************************************************");
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Modelo: " + modelo);
		
	}

	



	
	
}
