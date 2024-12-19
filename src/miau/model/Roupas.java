package miau.model;

public class Roupas extends Produtos {

	private int tipo;
	
	
	public Roupas(String cor, String tamanho, int tipo) {
		super(cor, tamanho, 0);
		
		this.tipo = tipo;
		

	}

	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		super.visualizar(); // refrencia da classe principal
		System.out.println("Roupa: " + this.tipo);

	}

}
