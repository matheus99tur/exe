import java.util.Scanner;

public class alunoVet {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a matrícula:");

    int matricula = scanner.nextInt();

    System.out.print("Digite o nome do aluno: ");
    scanner.nextLine(); // Consumir a quebra de linha pendente
    String nome = scanner.nextLine();

    System.out.println("Digite a nota 1: ");
    int nota1 = scanner.nextInt();

    System.out.println("Digite nota 2: ");
    int nota2 = scanner.nextInt();

    double notaFinal = (nota1 + nota2) / 2;

    if (notaFinal >= 6) {
      System.out.println("Aprovado");
    } else if (notaFinal < 6) {
      System.out.println("Reprovado");
    }

    System.out.println("Matricula: " + matricula);
    System.out.println("Nome: " + nome);
    System.out.println("Nota Final: " + notaFinal);
    System.out.println("Resultado: " + notaFinal);

    scanner.close();

  }
}
