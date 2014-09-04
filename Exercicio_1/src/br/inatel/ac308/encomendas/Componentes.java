package br.inatel.ac308.encomendas;

public class Componentes {

	private String nome;
	private float preco;

	public Componentes(String nome, float preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String gerarDetalhes() {
		
		//instanciando a classe StringBuilder e referenciando-a na variável sb
		StringBuilder sb = new StringBuilder();
		
		//nome é uma string por isso usa %s
		//%n é usado para quebrar a linha
		sb.append(String.format("Nome: %s%n", this.nome));
		sb.append(String.format("Preço: R$ %f", this.preco));

		return sb.toString();
		

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Float.floatToIntBits(preco);
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
		Componentes other = (Componentes) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
			return false;
		return true;
	}
	
}
