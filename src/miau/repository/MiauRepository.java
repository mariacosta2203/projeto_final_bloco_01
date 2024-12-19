package miau.repository;

import miau.model.Miaulandia;

public interface MiauRepository {

	public void procurarPorNumero(int numero);

	public void listarTodas();

	public void cadastrar(Miaulandia conta);

	public void atualizar(Miaulandia conta);

	public void deletar(int numero);
	
}
