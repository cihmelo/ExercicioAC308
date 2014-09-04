package br.inatel.ac308.encomendas;

import java.util.ArrayList;
import java.util.List;

public class Encomenda {

	private int status;
	private int numero;
	private String nomeDoCliente;

	private List<Configuracao> produtos = new ArrayList<Configuracao>();

	// metodo construtor
	public Encomenda(int status, int numero, String nomeCliente) {
		super();
		this.status = status;
		this.numero = numero;
		this.nomeDoCliente = nomeCliente;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeDoCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeDoCliente = nomeCliente;
	}

	public float calcularPrecoTotal() {

		return 0;

	}

	public void confirmarMontagem() {
		// pronto
		status = 2;
	}

	public void adicionarItem(Configuracao item) {
		produtos.add(item);
		// preparando
		status = 1;
	}

	public String gerarDetalhes() {

		// instanciando a classe StringBuilder e referenciando-a na variável sb
		StringBuilder sb = new StringBuilder();

		// nome é uma string por isso usa %s
		// %n é usado para quebrar a linha
		sb.append(String.format("Status: %s%n", this.status));
		sb.append(String.format("Número: %d%n", this.numero));
		sb.append(String.format("Nome do Cliente: %s", this.nomeDoCliente));

		return sb.toString();

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomeDoCliente == null) ? 0 : nomeDoCliente.hashCode());
		result = prime * result + numero;
		result = prime * result
				+ ((produtos == null) ? 0 : produtos.hashCode());
		result = prime * result + status;
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
		Encomenda other = (Encomenda) obj;
		if (nomeDoCliente == null) {
			if (other.nomeDoCliente != null)
				return false;
		} else if (!nomeDoCliente.equals(other.nomeDoCliente))
			return false;
		if (numero != other.numero)
			return false;
		if (produtos == null) {
			if (other.produtos != null)
				return false;
		} else if (!produtos.equals(other.produtos))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	

}
