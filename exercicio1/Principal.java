import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo de IMC ===");

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        pessoa.CalculaIMC();

        System.out.println("\n=== Resultado ===");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.printf("IMC: %.2f%n", pessoa.getImc());
        System.out.println("Classificação: " + pessoa.InformaObesidade());

        scanner.close();
    }
}
