public class GUIA6 {

    // Método que lanza una excepción de tipo Exception
    public static void throwException() throws Exception {
        throw new Exception("Este es un mensaje lanzado por una excepcion");
    }

    // Método que lanza un error de tipo Error
    public static void throwError() {
        throw new Error("Este es un mensaje lanzado por un error");
    }

    public static void main(String[] args) {
        try {
            // Llamamos al método que lanza una excepción
            throwException();
        } catch (Exception e) {
            // Capturamos la excepción y mostramos su mensaje
            System.out.println("Capturamos la excepcion:");
            System.out.println("Mensaje de excepcion: " + e.getMessage());
            // Imprimimos la traza de la pila
            e.printStackTrace();
        } finally {
            System.out.println("Finalizando programa tras procesar excepcion");
        }

        try {
            // Llamamos al método que lanza un error
            throwError();
        } catch (Error err) {
            // Capturamos el error y mostramos su mensaje
            System.out.println("Caught el error:");
            System.out.println("Mesnsaje de error: " + err.getMessage());
            // Imprimimos la traza de la pila
            err.printStackTrace();
        } finally {
            System.out.println("Finalizando programa tras procesar error");
        }
    }
}
