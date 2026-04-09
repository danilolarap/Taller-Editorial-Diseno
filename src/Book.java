public class Book extends Publication {
    private int pageCount;
    private int publicationYear;

    @Override
    public void inputData() {
        super.inputData(); // Llama a la captura de datos común
        System.out.print("Ingrese número de páginas: ");
        pageCount = scanner.nextInt();
        System.out.print("Ingrese año de publicación: ");
        publicationYear = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void displayData() {
        super.displayData(); // Muestra los datos comunes
        System.out.println("Páginas: " + pageCount);
        System.out.println("Año de publicación: " + publicationYear);
    }
}