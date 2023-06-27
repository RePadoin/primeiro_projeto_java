import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ParteUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        System.out.println("Entre com os textos separados por vírgula:");
        String input = scanner.nextLine();

        // Split the input string into individual values
        String[] values = input.split(",");

        // Process the array of values
        for (String value : values) {
            lista.add(value);
        }
        Collections.sort(lista);
        System.out.println(lista);
        scanner.close();
    }
}