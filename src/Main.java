public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("--- REGISTRO DE LIBRO ---");
            Book book = new Book();
            book.inputData();

            System.out.println("\n--- REGISTRO DE DISCO ---");
            Disk disk = new Disk();
            disk.inputData();

            System.out.println("\n==========================");
            System.out.println("DETALLE DE PUBLICACIONES");
            System.out.println("==========================");

            book.displayData();
            disk.displayData();

        } catch (Exception e) {
            System.err.println("Error: El formato de entrada no es válido. Asegúrese de usar números donde se solicita.");
        }
    }
}