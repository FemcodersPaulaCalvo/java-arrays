import java.util.ArrayList;
import java.util.List;

public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!
        String[] names = {"Reina", "Lord Gato", "Gatastrofe", "Abogato", "Tom"};

        for(String name : names) {
            System.out.println("¡Hello " + name + ", welcome to Java!");
        }

        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin modificarlo ni creando uno nuevo
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == 10 || numbers[i] == 30 || numbers[i] == 50 || numbers[i] == 70 || numbers[i] == 90){
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();

        for(int i = 0; i < numbers.length; i++){
            if ((numbers[i]/10)%2 != 0){
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();

        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado (multiplicado por 2 )
        int[] numbersDup = {1,2,3,4,5,6,7,8,9,0};

        for(int number : numbersDup){
            System.out.print(number*2 + " ");
        }

        System.out.println();

        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada vocal en mayúsculas
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(char vowel : vowels){
            System.out.print(Character.toUpperCase(vowel) + " ");
        }

    }
}