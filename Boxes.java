import java.util.Locale;
import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {

        
        /* ¡Nos mudamos de piso! vamos a crear un pequeño programa que nos ayude a saber en que caja pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 3. Bolsos
        Caja 4. Zapatos
        Caja 5. Cosas de verano
        Caja 6. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas
        String[][] boxesContent = {{"bible", "dictionary"}, {"spoon", "fork"}, {"soap gel", "toothpaste"}, {"backpack", "briefcase"}, {"boots","heels"}, {"swimsuit", "bikini"}, {"cap", "scarf"}};
        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar? (la respuesta deberá aparecer en la terminal en la misma línea)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi, I'm your organization assistant. What do you want to search for?: ");
        String object = scanner.nextLine();
        int boxCounter = 0;
        boolean inBox = false;

        //Crea un programa que te devuelva lo siguiente: <cosas> están en la caja <índice> en el caso de no existir que devuelva: <cosas> no las empacaste, oops!

        for (String[] box : boxesContent){
            for(String item : box){
                if(item.equals(object.toLowerCase())){
                    String firstletter = item.substring(0,1).toUpperCase();
                    String restLetters = item.substring(1);
                    inBox = true;
                    System.out.println( firstletter + restLetters + " is in box " + boxCounter);
                }
            }
            boxCounter++;
        }

        if (!inBox){
            String firstletterObj = object.substring(0,1).toUpperCase();
            String restLettersObj = object.substring(1);
            System.out.println(firstletterObj + restLettersObj +" you didn't pack it, oops!");
        }

        scanner.close();
    }
}
