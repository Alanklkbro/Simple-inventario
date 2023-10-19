import java.util.Scanner;

public class SimpleInventario {
    public static void agregarArticulo(String s) {
        if (s.length() > 4) {
            System.out.println("Artículo agregado exitosamente!");
        } else {
            System.out.println("No se permite este artículo");
        }
    }

    public static void removerArticulo(int id) {
        if (id > 0) {
            // Coloca aquí la lógica para remover el artículo
            System.out.println("Artículo removido exitosamente!");
        }
    }

    public static double obtenerPrecioArticulo(String articulo) {
        double random = (Math.random() * 4900) + 100;
        return random;
    }

    public static void modificarArticulo() {
        String nombrearticulo = obtenerNombredeArticulo();
        if (nombrearticulo.startsWith("A") || nombrearticulo.toUpperCase().startsWith("D")) {
            double precio = obtenerPrecioArticulo(nombrearticulo);
            if (precio >= 150 && precio <= 250) {
                precio *= 1.02;
                System.out.println("El precio del artículo " + nombrearticulo + " ha sido actualizado a " + precio);
            } else if (precio > 250 && precio <= 500) {
                precio *= 1.08;
                System.out.println("El precio del artículo " + nombrearticulo + " ha sido actualizado a " + precio);
            } else if (precio > 500) {
                precio *= 1.12;
                System.out.println("El precio del artículo " + nombrearticulo + " ha sido actualizado a " + precio);
            }
        } else if (nombrearticulo.toUpperCase().startsWith("CO") || nombrearticulo.toUpperCase().startsWith("M")) {
            double precio = obtenerPrecioArticulo(nombrearticulo);
            precio *= 0.8;
            System.out.println("El precio del artículo " + nombrearticulo + " ha sido actualizado a " + precio);
        }
    }

    public static void ImprimiendoInventario() {
        System.out.println("Ingrese su nombre");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.next();
        System.out.println("Bienvenido " + usuario);

        modificarArticulo();
    }

    public static void main(String[] args) {
        ImprimiendoInventario();
    }

    public static String obtenerNombredeArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del artículo");
        String nombrearticulo = scanner.next();
        if (nombrearticulo.length() > 3) {
            System.out.println("Usted ha ingresado un artículo " + nombrearticulo);
            return nombrearticulo;
        } else {
            return "";
        }
    }
}