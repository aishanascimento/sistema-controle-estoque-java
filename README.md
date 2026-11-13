# 📦 Sistema de Controle de Estoque (Java - POO)

## 📌 Visão Geral
Aplicação desenvolvida em Java para gerenciamento de estoque e comercialização de produtos, aplicando os conceitos fundamentais de **Programação Orientada a Objetos (POO)**, encapsulamento de atributos, construtores com `this` e tratamento de erros por códigos de retorno.

## 🚀 Funcionalidades e Regras de Negócio

- **Encapsulamento:** Atributos privados (`private String nome`, `private double preco`, `private int quantidadeEstoque`) acessados de forma segura por métodos getters.
- **Construtor com `this`:** Inicialização padronizada do produto com nome e preço unitário.
- **Controle de Estoque (`adicionarEstoque`):** Validação para aceitar apenas quantidades maiores que zero, somando ao saldo atual.
- **Sistema de Vendas (`vender`):** Método com retorno numérico (`double`) para controle de fluxo:
  - Retorna **`-2`**: Quantidade inválida para venda.
  - Retorna **`-1`**: Estoque insuficiente.
  - Retorna o **valor total da venda**: Atualizando e abatendo a quantidade vendida do estoque.
- **Menu Interativo via Terminal:** Laço de repetição (`while`) combinado com `switch` para gerenciar adições, vendas, consultas e encerramento.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java
- **Conceitos Aplicados:** POO, Encapsulamento, Construtores, Métodos com Retorno, Estruturas de Condição e Repetição..
