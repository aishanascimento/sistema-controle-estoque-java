package estoque;

import java.util.Scanner;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEstoque = 0;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public void adicionarEstoque(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Quantidade invalida!");
		} else {
			quantidadeEstoque = quantidadeEstoque + quantidade;
			System.out.println("Produto adicionado com sucesso!");
		}
	}

	public double vender(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Quantidade invalida!");
			return -2;
		} else if (quantidadeEstoque < quantidade) {
			System.out.println("Estoque insuficiente!");
			return -1;
		} else {
			quantidadeEstoque = quantidadeEstoque - quantidade;
			return quantidade * preco;
		}
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Produto p1 = new Produto("Caderno", 54.00);

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("1 - Adicionar ao estoque");
			System.out.println("2 - Realizar venda");
			System.out.println("3 - Consultar produto");
			System.out.println("0 - Sair");
			opcao = entrada.nextInt();

			switch (opcao) {
				case 1:
					System.out.println("Informe a quantidade do produto que deseja adicionar:");
					int quantidadeAdicionar = entrada.nextInt();
					p1.adicionarEstoque(quantidadeAdicionar);
					break;

				case 2:
					System.out.println("Informe a quantidade desejada:");
					int quantidadeVender = entrada.nextInt();
					double resultado = p1.vender(quantidadeVender);

					if (resultado == -2) {
						System.out.println("Erro: quantidade invalida para venda!");
					} else if (resultado == -1) {
						System.out.println("Erro: estoque insuficiente para realizar venda!");
					} else {
						System.out.println("Venda realizada com sucesso! Total da compra: " + resultado);
					}
					break;

				case 3:
					System.out.println("Nome: " + p1.getNome());
					System.out.println("Preco: R$ " + p1.getPreco());
					System.out.println("Estoque atual: " + p1.getQuantidadeEstoque() + " unidades");
					break;

				case 0:
					System.out.println("Encerrando o programa.");
					break;

				default:
					System.out.println("Opcao invalida! Escolha um numero entre 0 e 3.");
					break;
			}
		}

		entrada.close();
	}

}