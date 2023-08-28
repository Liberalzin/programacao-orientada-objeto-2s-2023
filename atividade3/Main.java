import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " - Quantidade: " + quantidade;
    }
}

class GerenciadorEstoque {
    private List<Produto> estoque;

    public GerenciadorEstoque() {
        estoque = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade) {
        estoque.add(new Produto(nome, quantidade));
        System.out.println("Produto adicionado ao estoque.");
    }

    public void removerProduto(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                estoque.remove(produto);
                System.out.println("Produto removido do estoque.");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setQuantidade(novaQuantidade);
                System.out.println("Quantidade atualizada.");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    public void listarProdutos() {
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Sistema de Gerenciamento de Estoque =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    gerenciador.adicionarProduto(nomeProduto, quantidade);
                    break;

                case 2:
                    System.out.print("Nome do Produto: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciador.removerProduto(nomeRemover);
                    break;

                case 3:
                    System.out.print("Nome do Produto: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    gerenciador.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    break;

                case 4:
                    gerenciador.listarProdutos();
                    break;

                case 5:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
                    break;
            }
        }
    }
}