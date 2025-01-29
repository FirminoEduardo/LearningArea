package serializable.desafio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Salvar lista em arquivo");
            System.out.println("3. Carregar lista do Arquivo");
            System.out.println("4. Exibir produtos");
            System.out.println("5. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine(); // Permite nomes compostos
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // Consome a quebra de linha
                    produtos.add(new Produto(nome, preco, quantidade));
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Produtos.ser"))) {
                        oos.writeObject(produtos);
                        System.out.println("Lista salva com sucesso em 'produtos.ser'\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("A lista de produtos está vazia.");
                    } else {
                        System.out.println("Lista de Produtos:");
                        for (Produto produto : produtos) {
                            System.out.println(produto);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }
}