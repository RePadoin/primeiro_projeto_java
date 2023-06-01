package rpadoin;
import java.util.*;
public class tarefa_wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira variável: ");
        long a= sc.nextLong();
        System.out.println("Primeira variável do tipo primitiva: " + a);
        a = Long.valueOf(a);
        System.out.println("Primeira variável do tipo Wrapper: " + a);
        int b = (int) a;
        System.out.println("Variável do tipo primitiva após o casting: " + b);
        b = Integer.valueOf(b);
        System.out.println("Variável do tipo Wrapper após o casting: " + b);
    }
}
