package miau.model;

public class VestidoRoupa extends Produtos {

private String vestido;
	
	public VestidoRoupa(String tamanho, String cor, int modelo, String macacao) {
		super(tamanho, cor, modelo);
		
		this.vestido = macacao;
	}
	
	public VestidoRoupa(String tamanho, int modelo, String cor) {
		super(tamanho, cor, modelo);
		
		this.vestido = "";
	}

	public String getMacacao() {
		return vestido;
	}

	public void setMacacao(String macacao) {
		this.vestido = macacao;
	}
		
	public void visualizar() {
		super.visualizar(); // refrencia da classe principal

	}
	
}
