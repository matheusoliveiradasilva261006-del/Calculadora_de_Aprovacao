import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Bem-vindo à Calculadora de Aprovação!");
        System.out.println("=====================================");

        System.out.println("Informe qual é o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o RA do aluno: ");
        String ra = scanner.nextLine();
        System.out.println("Informe qual é a disciplina que o aluno cursa: ");
        String disciplina = scanner.nextLine();
        System.out.println("Informe quanto de aulas o aluno teve: ");
        int aulas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe quantas faltas o aluno teve: ");
        int faltas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a nota 1 do aluno (0 a 10): ");
        double nota1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a nota 2 do aluno (0 a 10): ");
        double nota2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("=====================================");
        
        double media = calcularNotaDeAprovacao(nota1, nota2);
        System.out.println("A Media de (" + media + ") do aluno " + nome);
        double frequencia = calcularFrequencia(aulas, faltas);
        System.out.println("A frequência de (" + frequencia + "%) do aluno " + nome + " que teve " + faltas + " faltas de um total de " + aulas);
        System.out.println("=====================================");

        if (media>= 7.0 && frequencia >= 75.0) {
            System.out.println("O aluno " + nome + " do ra: " + ra);
            System.out.println("Está APROVADO na disciplina " + disciplina + ".");
        } else if (media >= 5.0 && (frequencia >= 75.0)) {
            System.out.println("O aluno " + nome + " do ra: " + ra);
            System.out.println("Está de RECUPERACAO na disciplina " + disciplina + ".");
        }else {
            System.out.println("O aluno " + nome + " do ra: " + ra);
            System.out.println("Está REPROVADO na disciplina " + disciplina + ".");
        }


        scanner.close();
    }

    public static double calcularNotaDeAprovacao(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Aprovado por média.");
        } else {
            System.out.println("Reprovado por média.");
        }
        return media;
    }

    public static double calcularFrequencia(int aulas, int faltas) {
        double frequencia = ((double) (aulas - faltas) / aulas) * 100;

        if (frequencia >= 75.0) {
            System.out.println("Aprovado por frequência.");
        } else {
            System.out.println("Reprovado por frequência.");
        }
        return frequencia;
    }
}
