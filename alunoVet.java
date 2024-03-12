import java.util.Scanner;

public class alunoVet {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int vetorAluno = 5;

    int [] matriculas = new int [vetorAluno];
    String [] nomes = new String[vetorAluno];
    double [] notas1 = new double[vetorAluno];
    double [] notas2 = new double[vetorAluno];
    double [] notasFinais = new double [vetorAluno];
    
    for (int i = 0; i < vetorAluno; i++) {
      System.out.println("Aluno " + (i + 1));
      System.out.print("Digite a matrícula do aluno: ");
      matriculas[i] = scanner.nextInt();

      System.out.print("Digite o nome do aluno: ");
      scanner.nextLine(); // Consumindo a quebra de linha
      nomes[i] = scanner.nextLine();

      System.out.print("Digite a nota 1 do aluno: ");
      notas1[i] = scanner.nextDouble();

      System.out.print("Digite a nota 2 do aluno: ");
      notas2[i] = scanner.nextDouble();

      // Calculando a nota final
      notasFinais[i] = (notas1[i] + notas2[i]) / 2;

      // Determinando o status do aluno
      if (notasFinais[i] >= 6) {
          status[i] = "Sim";
      } else {
          status[i] = "Não";
      }
  }

  // Imprimindo o relatório final
  System.out.println("\nRelatório Final:");
  for (int i = 0; i < alunoVet; i++) {
      System.out.println("Aluno " + (i + 1));
      System.out.println("Matrícula: " + matriculas[i]);
      System.out.println("Nome: " + nomes[i]);
      System.out.println("Aprovado: (" + status[i] + ")");
      System.out.println("Nota final: " + notasFinais[i] + "\n");
  }




    scanner.close();

  }
}
