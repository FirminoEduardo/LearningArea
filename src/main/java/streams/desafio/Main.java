package streams.desafio;

import generics.desafio.Produto;
import generics.desafio.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repositorio<Produto> repositorio = new Repositorio<Produto>();
        int opcao = 1;

        while (opcao != 4) {
            UserInterface.ExibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    Produto produto = new Produto(nomeProduto);
                    repositorio.adicionar(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto a remover: ");
                    String nomeProdutoRemovido = scanner.nextLine();

                    repositorio.buscar(new Produto(nomeProdutoRemovido))
                            .ifPresentOrElse(produtoRemovido -> {
                                repositorio.remover(produtoRemovido);
                                System.out.println("Produto removido com sucesso!");
                            }, () -> System.out.println("Produto não encontrado."));
                    break;
                case 3:
                    System.out.println("Lista de produtos:");
                    repositorio.getLista()
                            .stream()
                            .forEach(System.out::println); // ✅ Usa Stream para listar
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
