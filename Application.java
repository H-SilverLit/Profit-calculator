import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean valid = true;
        System.out.println("Introduce tu capital inicial.");
        Scanner scanner = new Scanner(System.in);
        while (valid) {
            try {
                int capitalInicial = Integer.parseInt(scanner.nextLine());
                System.out.println("Introduce tu capital final.");
                int capitalFinal = Integer.parseInt(scanner.nextLine());
                System.out.println("Tu ganancia ha sido del " + (capitalFinal * 100 / capitalInicial - 100) + "%.");
                System.out.println("Introduce, si quieres, otro capital inicial para volver a calcular tus ganancias/pérdidas o escribe 'salir' para terminar.");
                if (scanner.nextLine().equals("salir")) {
                    System.out.println("Programa terminado.");
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Por favor introduce un número válido.");
            }
        }
    }
}