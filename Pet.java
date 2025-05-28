import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        String happiness = "Feliz";
        String hunger = "Hambriento";
        String energy = "Energético";
        String charisma = "Carismático";
        String nombre = "Mascota";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre de tu pet: ");
        String mascota = scanner.nextLine();
        System.out.println(mascota);

        System.out.println(" |\\__/,|   (`\\\r\n" + //
                " |o o  |__ _)\r\n" + //
                " _.( T   )  `  /\r\n" + //
                "((_ `^--' /_<  \\\r\n" + //
                "`` `-'(((/  (((/");
        System.out.println("Estado inicial de " + mascota + ":");
        System.out.println("Felicidad: " + 10);
        System.out.println("Hambre: " + 10);
        System.out.println("Energía: " + 10);
        System.out.println("Carisma: " + 10);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("=== Acciones disponibles ===");
            System.out.println("1. Jugar con " + mascota);
            System.out.println("2. Alimentar a " + mascota);
            System.out.println("3. Salir");

            Scanner scanner2 = new Scanner(System.in);
            opcion = scanner2.nextInt();

            if (opcion == 1) {
                System.out.println("¡Has jugado con " + mascota + "!");
                System.out.println("Felicidad: " + (10 + 2));
                System.out.println("Hambre: " + (10 - 1));
                System.out.println("Energía: " + (10 - 1));
                System.out.println("Carisma: " + (10 + 1));
            } else if (opcion == 2) {
                System.out.println("Has alimentado a " + mascota + "!");
                System.out.println("Felicidad: " + (10 - 1));
                System.out.println("Hambre: " + (10 + 2));
                System.out.println("Energía: " + (10 - 1));
                System.out.println("Carisma: " + (10 - 1));
            } else if (opcion == 3) {
                System.out.println("¡Hasta luego! " + mascota + " te echará de menos.");
                break;
            } else {
                System.out.println("Opción no válida.");
            }

        }
    }
}
