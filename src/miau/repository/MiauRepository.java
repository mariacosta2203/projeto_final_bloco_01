package miau.repository;

import miau.model.Produtos;

public interface MiauRepository {

	public void procurarPorNumero(int numero);

	public void listarTodas();

	public void cadastrar(Produtos conta);

	public void atualizar(Produtos conta);

	public void deletar(int numero);
	
}
