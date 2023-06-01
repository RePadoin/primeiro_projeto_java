// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double media;
        double nota1 = 7.0;
        double nota2 = 3.6;
        double nota3 = 7.5;
        double nota4 = 8.2;

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média do aluno é: " + media);

        if (media >= 5 && media <= 10){
            System.out.println("O aluno está aprovado");
        }
        else if (media > 10){
            System.out.println("Nota inválida");
        }
        else {
            System.out.println("O aluno está reprovado");
        }
    }
}