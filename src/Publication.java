import java.util.Scanner;
import java.util.Locale;

public class Publication {
    protected String title;
    protected float price;
    protected Language language;
    protected Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void inputData() {
        System.out.print("Ingrese título: ");
        title = scanner.nextLine();

        System.out.print("Ingrese precio (use punto para decimales, ej: 15.99): ");
        price = scanner.nextFloat();

        System.out.println("Seleccione idioma (1: Español, 2: Inglés, 3: Portugués): ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        switch(option) {
            case 1 -> language = Language.SPANISH;
            case 2 -> language = Language.ENGLISH;
            case 3 -> language = Language.PORTUGUESE;
            default -> language = Language.SPANISH;
        }
    }

    public void displayData() {
        System.out.println("\nTítulo: " + title);
        System.out.println("Precio: $" + price);
        System.out.println("Idioma: " + (language != null ? language.getDisplayName() : "No definido"));
    }
}