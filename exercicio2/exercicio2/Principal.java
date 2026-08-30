import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            System.out.println("\n=== CHAPÉU SELETOR ===");

            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Coragem: ");
            double coragem = scanner.nextDouble();

            System.out.print("Inteligência: ");
            double inteligencia = scanner.nextDouble();

            System.out.print("Ambição: ");
            double ambicao = scanner.nextDouble();

            System.out.print("Lealdade: ");
            double lealdade = scanner.nextDouble();

            System.out.print("Estratégia: ");
            double estrategia = scanner.nextDouble();

            System.out.print("Criatividade: ");
            double criatividade = scanner.nextDouble();

            Aluno aluno = new Aluno(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade,
                    estrategia,
                    criatividade
            );

            aluno.calcularCasa();
            aluno.exibirInformacoes();

            scanner.nextLine();

            System.out.print("\nDeseja cadastrar outro aluno? (s/n): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("\nPrograma encerrado.");

        scanner.close();
    }
}
