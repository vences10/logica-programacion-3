import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DiccionarioEspañolIngles {

    public static void main(String[] args) {

        // Crear el diccionario Español - Inglés
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("escuela", "school");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("coche", "car");
        diccionario.put("ciudad", "city");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("trabajo", "work");
        diccionario.put("tiempo", "time");
        diccionario.put("dinero", "money");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());

        int correctas = 0;
        int incorrectas = 0;

        System.out.println("=== Traduce las siguientes palabras al inglés ===\n");

        // Seleccionar 5 palabras aleatorias
        for (int i = 0; i < 5; i++) {

            int indice = random.nextInt(palabras.size());
            String palabraEspanol = palabras.remove(indice); // evita repetir palabras

            System.out.print("Traduccion de \"" + palabraEspanol + "\": ");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            String traduccionCorrecta = diccionario.get(palabraEspanol);

            if (respuesta.equals(traduccionCorrecta.toLowerCase())) {
                System.out.println("Tu si sabes,Correcto!!\n");
                correctas++;
            } else {
                System.out.println("Incorrecto, sigue estudiando. La respuesta correcta es: "
                        + traduccionCorrecta + "\n");
                incorrectas++;
            }
        }

        System.out.println("===== RESULTADOS =====");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}