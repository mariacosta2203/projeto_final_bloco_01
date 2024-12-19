package miau.model;

public class VestidoRoupa extends Produtos {

private String vestido;
	
	public VestidoRoupa(String tamanho, String cor, int modelo, String macacao, String vestido) {
		super(tamanho, cor, modelo);
		
		this.vestido = vestido;
	}
	
	public VestidoRoupa(String tamanho, int modelo, String cor) {
		super(tamanho, cor, modelo);
		
		this.vestido = "";
	}

	public String getVestido() {
		return vestido;
	}

	public void setVestido(String vestido) {
		this.vestido = vestido;
	}
		
	public void visualizar() {
		super.visualizar(); // refrencia da classe principal

	}
	
}
