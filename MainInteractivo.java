import java.util.Scanner;
import Monedas.*;

public class MainInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Moneda m = new Moneda1000();
        Comprador c;

        System.out.println("Bienvenido al Expendedor!");
        System.out.println("Seleccione un producto:");
        System.out.println("1 = CocaCola");
        System.out.println("2 = Sprite");
        System.out.println("3 = Fanta");
        System.out.println("4 = Super8");
        System.out.println("5 = Snickers");
        System.out.print("Ingrese el número de su elección: ");

        int opcion = scanner.nextInt();
        c = new Comprador(m, opcion);

        System.out.println("Compraste: " + c.queCompraste());
        System.out.println("Tu vuelto es: " + c.cuantoVuelto());

        scanner.close();
    }
}
