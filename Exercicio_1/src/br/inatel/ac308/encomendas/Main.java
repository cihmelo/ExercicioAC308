package br.inatel.ac308.encomendas;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Menu().initialize();

	}

}

class Menu {

	public void initialize() {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;

		System.out.println("----   MENU   ---- ");
		System.out.println("Escolha uma opcao: ");
		System.out.println("1. Cadastrar componentes (pe�as)");
		System.out.println("2. Cadastrar configura��es (produtos) ");
		System.out.println("3. Cadastrar encomendas ");
		System.out.println("4. Imprimir uma encomenda espec�fica ");
		System.out.println("5. Sair ");

		opcao = sc.nextInt();
		// sc.close();

		switch (opcao) {

		case 1:
			cadastrarComponentes();
			break;

		case 2:
			cadastrarConfiguracoes();
			break;
		case 3:
			cadastrarEncomendas();
			return;
		case 4:
			imprimirEncomenda();
			break;
		case 5:
			System.exit(0);
			return;
		default:
			System.out.println("Op��o Inv�lida!");

			break;
		}

	}

	public void cadastrarComponentes() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entre com o nome do componente: ");
			String nome = sc.next();
			System.out.println("Entre com o pre�o do componente: ");
			float preco = sc.nextFloat();

			Componentes componente = new Componentes(nome,preco);
			
			System.out.println("Deseja cadastar outro componente? 1 - sim  2- n�o");
			int novo = sc.nextInt();

			if (novo == 1) {

			} else
				
				

				sc.close();
		} catch (Exception e) {
			e.toString();
		}

	}

	public void cadastrarConfiguracoes() {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entre com o nome da configura��o: ");
			String nomeConf = sc.next();
			System.out.println("Entre com tipo da configura��o: ");
			int tipo = sc.nextInt();
			
			Configuracao configuracao = new Configuracao(nomeConf, tipo);
			//configuracao.adicionarPeca(componente);

			System.out.println("Deseja cadastar outra configura��o? 1 - sim  2- n�o");
			int novo = sc.nextInt();

			if (novo == 1) {

			} else
				
				

				sc.close();
		} catch (Exception e) {
			e.toString();
		}

	}

	public void cadastrarEncomendas() {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entre com o valor do status: ");
			int status = sc.nextInt();
			System.out.println("Entre com o numero: ");
			int numero = sc.nextInt();
			System.out.println("Entre com o nome do cliente: ");
			String nomeDoCliente = sc.next();

			Encomenda encomenda = new Encomenda(status, numero, nomeDoCliente);
			//encomenda.adicionarItem(configuracao);
			//HashMap.put(encomenda.hashCode(), encomenda);
			
			
			System.out.println("Deseja cadastar outro componente? 1 - sim  2- n�o");
			int novo = sc.nextInt();

			if (novo == 1) {

			} else
				
				
			sc.close();
		} catch (Exception e) {
			e.toString();
		}

	}

	public void imprimirEncomenda() {

	}

	// primeiro cadastrar os componentes, depois cadastra configuracao e add os
	// componentes a lista
	// e depois cadastra encomenda e add as configura��es a lista e por ultimo
	// add a encomenda na tabela hashmap
}
