import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final var array = RandomUtilities.generarRandomArrayInt(20, 5, 2, new Random());
        final var setNumeros = new HashSet<Integer>();

        for (var elemento : array) {
            setNumeros.add(elemento);
        }

        System.out.printf("El set de numeros es: %s%n", setNumeros);
        System.out.printf("El tamaño del set es: %s%n", setNumeros.size());
    }
}
