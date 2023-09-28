import java.util.Scanner;
public class SimpleInventario {
    public static void agregarArticulo(String s) {
        System.out.println("agregar un articulo: ");


    }

    public static void RemoverArticulo(int id) {
    }

    public static double obtenerPrecioArticulo(int id) {
        return 0.00;
    }

    public static void ImprimiendoInventario() {
        System.out.println("Ingrese una opción");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.next();
        System.out.println("Bienvenido" + usuario);

        String articuloexistente = obtenerNombredeArticulo();
        System.out.println("articuloexistente" + articuloexistente);



}

    public static void main(String[] args) { ImprimiendoInventario();

    }

    public static String obtenerNombredeArticulo() {
        Scanner scanner = new Scanner(System.in);
   System.out.println("Ingrese el nombre del articulo" );

   String nombrearticulo;
        nombrearticulo = scanner.next();
    System.out.println("Usted ha ingresa un articulo" + nombrearticulo);

    return nombrearticulo;

    }



    }



