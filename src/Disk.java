public class Disk extends Publication {
    private float durationMinutes;
    private float durationHours;

    @Override
    public void inputData() {
        super.inputData();
        System.out.print("Ingrese duración en minutos: ");
        durationMinutes = scanner.nextFloat();
        // Lógica de conversión
        this.durationHours = durationMinutes / 60.0f;
        scanner.nextLine();
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.printf("Duración: %.2f minutos (%.2f horas)%n", durationMinutes, durationHours);
    }
}