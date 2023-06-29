import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listam = new ArrayList<>();
        List<String> listaf = new ArrayList<>();
        List<String> listae = new ArrayList<>();
        System.out.println("Entre com os nomes e sexos separados por vírgula:");
        String input = scanner.nextLine();

        // Split the input string into individual values
        String[] values = input.split(",");

        // Process the array of values
        for (String value : values) {
            if (value.contains("- M")){
                listam.add(value);
            }
            else if (value.contains("- F")){
                listaf.add(value);
            }
            else {
                listae.add(value);
            }

        }

        System.out.println("Lista de nomes masculinos: " + listam);
        System.out.println("Lista de nomes femininos: " + listaf);
        System.out.println("Lista de nomes fora do padrão: " + listae);
        scanner.close();
    }
}