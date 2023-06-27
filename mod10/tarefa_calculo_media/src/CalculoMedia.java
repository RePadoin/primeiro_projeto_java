import java.util.Scanner;

public class CalculoMedia {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,nota3,nota4;

        System.out.println("Digite a nota da primeira prova (com decimais)");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota da segunda prova (com decimais)");
        nota2 = sc.nextDouble();

        System.out.println("Digite a nota da terceira prova (com decimais)");
        nota3 = sc.nextDouble();

        System.out.println("Digite a nota da quarta prova (com decimais)");
        nota4 = sc.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A média do aluno é: " + media);

        if (media >= 7 && media <= 10){
            System.out.println("O aluno está aprovado");
        }
        else if (media >= 5 && media < 7){
            System.out.println("O aluno está de recuperação");
        }
        else if (media >= 0 && media < 5){
            System.out.println("O aluno está reprovado");
        }
        else {
            System.out.println("Nota inválida, a nota precisa estar entre 0 e 10");
        }
    }
}