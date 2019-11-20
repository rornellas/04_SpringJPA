package br.com.fiap.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	public Integer id;
	public String nome;
	public Double custo;
	public Double margemLucro;
	
	public Produto() {
	}

	public Produto(Integer id, String nome, Double custo, Double margemLucro) {
		this.id = id;
		this.nome = nome;
		this.custo = custo;
		this.margemLucro = margemLucro;
	}

	@Override
	public String toString() {
		return "Produto (id: " + id + ", nome: " + nome + ")";
	}

	public Double getPreco() {
		return custo += custo / margemLucro;
	}
}
