import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesteArrayListString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando 10 Strings informadas pelo usuário
        System.out.println("Digite 10 strings:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a string " + (i + 1) + ": ");
            String input = scanner.nextLine();
            lista.add(input);
        }

        // Percorrendo a lista e imprimindo cada String
        System.out.println("\nLista antes de ordenar:");
        for (String str : lista) {
            System.out.println(str);
        }

        // Ordenando a lista
        Collections.sort(lista);

        // Percorrendo a lista novamente e imprimindo as Strings ordenadas
        System.out.println("\nLista após ordenar:");
        for (String str : lista) {
            System.out.println(str);
        }

        scanner.close();
    }
}
