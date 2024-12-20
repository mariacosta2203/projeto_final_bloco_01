package miau.controller;

import java.util.ArrayList;
import miau.model.Produtos;
import miau.repository.MiauRepository;

public class Controller implements MiauRepository{

	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarTodas() {
		for (var produtos : listaProdutos) {
			produtos.visualizar();
		}
		
	}
	@Override
	public void cadastrar(Produtos produto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizar(Produtos produto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar(int numero) {
		var produtos = buscarNaCollection(numero);

		if (produtos != null) {
			if (listaProdutos.remove(produtos) == true)
				System.out.println("\nA conta numero: " + numero + " foi deletada com sucesso!");
		} else
			System.out.println("\nA conta numero: " + numero + " não foi encontrada!");
		
	}
	private Object buscarNaCollection(int numero2) {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<Produtos> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(ArrayList<Produtos> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
}
