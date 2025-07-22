import java.util.Scanner;

public class CalculadoraCompra {
    // Dentro del método main, después de la entrada de datos

// Cálculos
    public static void main(String[] args) {
        
    final double TASA_IMPUESTO = 0.15; // 15% de impuesto
    
    Scanner entrada = new Scanner(System.in);

    
    System.out.println("digite el precio del articulo: ");
    double precio = entrada.nextDouble();
    System.out.println("Ingrese la cantidad de artículos:");
    var cantidad = entrada.nextInt();
    System.out.print("Ingrese la cantidad pagada por el cliente: ");
    var cantidadPagada = entrada.nextDouble();
    entrada.nextLine();
    
    double subtotal = precio * cantidad;
    double impuesto = subtotal * TASA_IMPUESTO;
    double total = subtotal + impuesto;
    double cambio = cantidadPagada - total;

    System.out.printf("El valor subtotal de su compra es: %.2f.\n", subtotal);
    System.out.printf("El valor impuesto de su compra es: %.2f.\n", impuesto);
    System.out.printf("El valor total de su compra es: %.2f.\n", total);
    System.out.printf("El valor cambio de su compra es: %.2f.\n", cambio);
        System.out.println("Gracias por su compra!");

    entrada.close();
    }
}
