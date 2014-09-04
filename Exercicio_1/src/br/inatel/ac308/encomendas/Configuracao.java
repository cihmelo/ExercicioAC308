package br.inatel.ac308.encomendas;

import java.util.ArrayList;
import java.util.List;

public class Configuracao {

	private String nome;
	private int tipo;

	private List<Componentes> pecas = new ArrayList<Componentes>();

	public Configuracao(String nome, int tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {

		Componentes c = pecas.get(0);
		c.getPreco();

		return 0;

	}

	public String gerarDetalhes() {

		// instanciando a classe StringBuilder e referenciando-a na variável sb
		StringBuilder sb = new StringBuilder();

		// nome é uma string por isso usa %s
		// %n é usado para quebrar a linha
		sb.append(String.format("Nome: %s%n", this.nome));
		sb.append(String.format("Tipo: %d", this.tipo));
		
		return sb.toString();

	}

	public void adicionarPeca(Componentes p) {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pecas == null) ? 0 : pecas.hashCode());
		result = prime * result + tipo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuracao other = (Configuracao) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pecas == null) {
			if (other.pecas != null)
				return false;
		} else if (!pecas.equals(other.pecas))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

}
