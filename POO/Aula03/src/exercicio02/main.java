import java.util.Scanner;
import exercicio03.Funcionario; // inclui a classe Funcionario do pacote meuPacote

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de funcionários: ");
        int n = entrada.nextInt();

        // Cria um array de funcionários com tamanho n
        Funcionario[] funcionarios = new Funcionario[n];

        // Solicita ao usuário que entre com os dados dos funcionários
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário " + (i+1) + ":");
            System.out.print("Matrícula: ");
            int matricula = entrada.nextInt();
            entrada.nextLine(); // consome a quebra de linha pendente
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Salário: ");
            double salario = entrada.nextDouble();

            // Cria um novo objeto Funcionario com os valores recebidos e adiciona no array
            funcionarios[i] = new Funcionario(matricula, nome, salario);
        }

        // Imprime os dados dos funcionários
        double somaSalarios = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário " + (i+1) + ":");
            System.out.println("Matrícula: " + funcionarios[i].getMatricula());
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Salário: " + funcionarios[i].getSalario());
            System.out.println();

            somaSalarios += funcionarios[i].getSalario();
        }

        // Calcula e imprime a média salarial
        double mediaSalarios = somaSalarios / n;
        System.out.println("Média salarial: " + mediaSalarios);

        entrada.close();
    }
}
