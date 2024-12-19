package miau.model;

public class MacacaoRoupa extends Produtos {

	private String macacao;
	
	public MacacaoRoupa(String tamanho, String cor, int modelo, String macacao) {
		super(tamanho, cor, modelo);
		
		this.macacao = macacao;
	}
	
	public MacacaoRoupa(String tamanho, int modelo, String cor) {
		super(tamanho, cor, modelo);
		
		this.macacao = "";
	}

	public String getMacacao() {
		return macacao;
	}

	public void setMacacao(String macacao) {
		this.macacao = macacao;
	}
		
	public void visualizar() {
		super.visualizar(); // refrencia da classe principal

	}

	



	
	
}
