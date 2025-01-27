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
        List<Produto> produtos = new ArrayList<Produto>();
        int opcao = 0;

        while (opcao != 0) {
            System.out.println("MENU");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Salvar lista em arquivo");
            System.out.println("3. Carregar lista do Arquivo");
            System.out.println("4. Exibir produtos");
            System.out.println("5. Sair");
            System.out.print("Selecione uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.next();
                    System.out.println("Digite preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.println("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    Produto produto = new Produto(nome, preco, quantidade);
                    produtos.add(produto);
                    break;
                case 2:
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Produtos.ser"))){
                        oos.writeObject(produtos);
                        System.out.println("Lista salva com sucesso em 'produtos.ser");
                    }
            }
        }
    }
}
