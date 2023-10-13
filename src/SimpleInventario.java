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

    public static String obtenerPrecioArticulo(String articulo, double precio) {
        if (articulo.startsWith("mar") && precio >= 0.00) {
            double random = (Math.random() * 4900) + 100;
            return "Articulo " + articulo + " tiene un valor de RDS " + random;
        } else if (articulo.startsWith("tab") || precio >= 12000.00) {
            double random = (Math.random() * 4900) + 100;
            return "Articulo " + articulo + " tiene un valor que sobrepasa 12,000.00. El monto es de RDS " + random;
        } else {
            return "Ninguno de los escenarios pudo aplicar";
        }
    }

    public static void ImprimiendoInventario() {
        System.out.println("Ingrese su nombre");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.next();
        System.out.println("Bienvenido " + usuario);

        String articuloexistente = obtenerNombredeArticulo();
        System.out.println("Artículo existente: " + articuloexistente);
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
            return "Error en operación!";
        }
    }
}


