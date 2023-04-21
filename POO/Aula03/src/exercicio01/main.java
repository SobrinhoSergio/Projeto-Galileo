import java.util.Scanner;
import exercicio01.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o número de funcionários: ");
        int n = scanner.nextInt();

        Funcionario[] funcionarios = new Funcionario[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Entre com os dados do funcionário %d:\n", i+1);

            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            funcionarios[i] = new Funcionario(matricula, nome, salario);
        }

        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalario();
            System.out.printf("Matrícula: %d, Nome: %s, Salário: %.2f\n",
                    funcionario.getMatricula(), funcionario.getNome(), funcionario.getSalario());
        }

        double mediaSalarial = totalSalarios / n;
        System.out.printf("Média salarial: %.2f\n", mediaSalarial);
    }
}
