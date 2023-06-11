import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaContatos {
    private static final int MAX_CONTATOS = 10;
    private List<Contato> contatos;

    public AgendaContatos() {
        contatos = new ArrayList<>();
    }

    public void incluirContato() {
        if (contatos.size() >= MAX_CONTATOS) {
            System.out.println("Agenda cheia! Não é possível adicionar mais contatos.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do contato:");
        String nome = scanner.nextLine();
        System.out.println("Digite o sobrenome do contato:");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite o telefone do contato:");
        String telefone = scanner.nextLine();
        Contato contato = new Contato(nome, sobrenome, telefone);
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void listarContatos() {
        System.out.println("Lista de contatos:");
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Sobrenome: " + contato.getSobrenome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("-----------------------");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Incluir contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    agenda.incluirContato();
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;

    public Contato(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }
}
